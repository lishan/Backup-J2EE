package lishan.yu.directory;

import lishan.yu.directory.api.TestEjbLocal;
import lishan.yu.directory.api.TestEjbRemote;
import lishan.yu.element.TestElement;
import org.apache.log4j.Logger;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.*;

/**
 * @author fred
 *         Date: 9/20/13
 *         Time: 3:18 PM
 */
@Stateless
public class TestEjbMain implements TestEjbLocal,TestEjbRemote {
    private static final Logger log = Logger.getLogger(TestEjbMain.class);

    @Override
    public String hello() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        TestElement element = new TestElement();
        element.setId(1);
        entityManager.persist(element);
        transaction.commit();
        System.out.println("Hello everyone");
        log.info("Directory ejb calls, hello everyone");
        return "success";
    }
}
