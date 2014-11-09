
import junit.framework.TestCase;

import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.easymock.EasyMock.eq;
/**
* Test case for LoginService.
*/
public class LoginServiceTest extends TestCase{

     private LoginServiceImpl service;
     private UserDAO mockDao;

     /**
     * setUp overrides the default, empty implementation provided by
     * JUnit's TestCase.  We will use it to instantiate our required
     * objects so that we get a clean copy for each test.
     */
     @Override
     public void setUp() {
          service = new LoginServiceImpl();
          mockDao = createStrictMock(UserDAO.class);
          service.setUserDAO(mockDao);
     }
}