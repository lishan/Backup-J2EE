package lishan.yu.infra.action;

/**
 * @author fred
 *         Date: 9/11/13
 *         Time: 12:08 PM
 */
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;

@Namespace("/custom")
public class HelloWorld extends ActionSupport {
    @Actions({
            @Action("/different/url"),
            @Action("/another/url")
    })
    public String execute() {
        return SUCCESS;
    }
}
