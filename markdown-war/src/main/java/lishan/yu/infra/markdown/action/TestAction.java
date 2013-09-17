package lishan.yu.infra.markdown.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author matrix
 *         Date: 9/16/13
 *         Time: 2:21 PM
 */
public class TestAction extends ActionSupport{

    private String name;

    @Action(value = "test",
        results = {
                @Result(name = "success",
                location = "/markdown/index.jsp")
        })
    @Override
    public String execute() throws Exception {
        setName("Xu Chuyi");
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
