package lishan.yu.directory.api;

import javax.ejb.Remote;

/**
 * @author fred
 *         Date: 9/20/13
 *         Time: 3:55 PM
 */
@Remote
public interface TestEjbRemote {
    String hello();
}
