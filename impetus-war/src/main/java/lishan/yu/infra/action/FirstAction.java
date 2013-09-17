package lishan.yu.infra.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.config.entities.ResultTypeConfig;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.lang.Exception;
import java.lang.Override;
import java.lang.String;

/**
 * This is only a action action to be called by struts2
 * @author fred
 */
@Namespace("/custom")
public class FirstAction extends ActionSupport{
    private Logger log = Logger.getLogger(FirstAction.class);
    private String name;

    @Override
    public String execute() throws Exception {
        if(log.isInfoEnabled()){
            log.info("execute");
        }
        setName("Yu Lishan");
        return "action";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Action(value = "/first",
            results = {
                    @Result(location = "/index.jsp")
            }
    )
    public String method(){
        if(log.isInfoEnabled()){
            log.info("log init");
        }
        setName("Xu Chuyi");
        return "success";
    }
}
