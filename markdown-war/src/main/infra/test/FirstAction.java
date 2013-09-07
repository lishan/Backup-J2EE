package infra.test;

import org.apache.log4j.Logger;

/**
 * This is only a test action to be called by struts2
 * @author fred
 */
public class FirstAction{
    private Logger log = Logger.getLogger(FirstAction.class);

    public String method(){
        if(log.isInfoEnabled()){
            log.info("log init");
        }
        return "success";
    }
}
