package lishan.yu.infra.markdown.action;

import com.opensymphony.xwork2.ActionSupport;
import lishan.yu.db.DirectoryElement;
import lishan.yu.directory.api.TestEjbLocal;
import lishan.yu.directory.api.TestEjbRemote;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import javax.ejb.EJB;
import javax.naming.Context;

import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.rmi.PortableRemoteObject;
import java.util.Properties;

/**
 * @author matrix
 *         Date: 9/16/13
 *         Time: 2:21 PM
 */
public class TestAction extends ActionSupport{
    private static final Logger log = Logger.getLogger(TestAction.class);

    private String name;

    @Action(value = "test",
        results = {
                @Result(name = "success",
                location = "/markdown/index.jsp")
        })
    @Override
    public String execute() throws Exception {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY,"org.apache.openejb.client.RemoteInitialContextFactory");
            props.put(Context.PROVIDER_URL,"ejbd://127.0.0.1:4201");
            Context ctx = new InitialContext(props);
            Object ref = ctx.lookup("TestEjbMainRemote");
            TestEjbRemote h = (TestEjbRemote) PortableRemoteObject.narrow(ref, TestEjbRemote.class);
            String result = h.hello();
            setName(result);
            log.info(result);
            System.out.println(result);
            return SUCCESS;
    }

    @Action(value = "method",
            results = {
                    @Result(location = "/markdown/index.jsp")
            }

    )
    public String method(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dic");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        DirectoryElement element = new DirectoryElement();
        element.setName("tester");
        entityManager.persist(element);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
