import org.easymock.EasyMock;

import junit.framework.TestCase;


public class AuthenticateTest extends TestCase {
//@Before
	private Authenticate testa  = null;
	AuthIn mockauth = EasyMock.createStrictMock(AuthIn.class);
//	private ConnectToDB mockconnect = null;
	char[] pwd = {'a','b','c'};
	
	boolean fetch = mockauth.auth("Priyya",pwd,5);
	public void setUp() throws Exception {
	EasyMock.expect(mockauth.auth("Priyya",pwd,5));
	EasyMock.replay(mockauth);
	EasyMock.verify(mockauth);
}
	
	//@Test
	public final void test() {
		assertTrue(mockauth.auth("Priyya",pwd,5));
	}
}
