package lishan.yu.element;

import org.apache.log4j.Logger;

import javax.persistence.*;

/**
 * @author fred
 *         Date: 9/24/13
 *         Time: 11:13 AM
 */
@Entity
@Table(name = "EMPLOYEE_INFO")
public class TestElement {
    private static final Logger log = Logger.getLogger(TestElement.class);

    @Id
    @Column(name = "INFO_ID")
    private int id;

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
}
