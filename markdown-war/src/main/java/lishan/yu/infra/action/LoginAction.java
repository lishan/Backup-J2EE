package lishan.yu.infra.action;

/**
 * @author fred
 *         Date: 9/11/13
 *         Time: 12:43 PM
 */
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value="/")
@Result(name="success",location="test.jsp")
public class LoginAction extends ActionSupport{

}