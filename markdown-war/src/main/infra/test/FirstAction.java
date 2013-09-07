package infra.test;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;

import java.lang.Exception;
import java.lang.Override;
import java.lang.String;

/**
 * This is only a test action to be called by struts2
 * @author fred
 */
public class FirstAction extends ActionSupport{
    private Logger log = Logger.getLogger(FirstAction.class);
    private String name;

    @Override
    public String execute() throws Exception {
        if(log.isInfoEnabled()){
            log.info("execute");
        }
        setName("Yu Lishan");
        return "test";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String method(){
        if(log.isInfoEnabled()){
            log.info("log init");
        }
        return "success";
    }
}
