package lishan.yu.element;

import org.apache.log4j.Logger;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author fred
 *         Date: 9/24/13
 *         Time: 11:13 AM
 */
@Entity
@Table(name = "test")
public class TestElement implements Serializable{
    private static final Logger log = Logger.getLogger(TestElement.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @PostLoad
    public void setUp(){
        log.info("test post load method run");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
