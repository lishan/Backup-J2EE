package lishan.yu.infra.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author fred
 *         Date: 9/12/13
 *         Time: 3:16 PM
 */
public class TestAction extends ActionSupport{

    @Override
    public String execute() throws Exception {
        return ActionSupport.SUCCESS;
    }
}
