package lishan.yu.db;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author fred
 *         Date: 9/29/13
 *         Time: 11:35 AM
 */
@Entity
@Table(name = "testDic")
public class DirectoryElement implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
