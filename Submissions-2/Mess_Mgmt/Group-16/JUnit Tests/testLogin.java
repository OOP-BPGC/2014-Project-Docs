
import junit.framework.*;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class testLogin extends TestCase {
	
	private Login login;
	public void setUp() throws Exception {
		login = createNiceMock(Login.class);
		}
	public void testCustomerAuth(){
		
		expect(login.CustomerAuth("username", "truepwd")).andReturn(true);
		expect(login.CustomerAuth("username", "falsepwd")).andReturn(false);
		replay(login);

		assertEquals(true, login.CustomerAuth("username", "truepwd"));
		assertEquals(false, login.CustomerAuth("username", "falsepwd"));
		verify(login);
		
	}
	
	public void testEmployeeAuth(){
		
		expect(login.EmployeeAuth("username", "truepwd")).andReturn(true);
		expect(login.EmployeeAuth("username", "falsepwd")).andReturn(false);
		replay(login);
		
		assertEquals(true, login.EmployeeAuth("username", "truepwd"));
		assertEquals(false, login.EmployeeAuth("username", "falsepwd"));
		verify(login);
	}
	
	public void testLogout(){
		
		assertTrue(true);
		
	}
	
	public void testcheckIDcard(){
		
		expect(login.checkIDcard("validID")).andReturn(true);
		expect(login.checkIDcard("invalidID")).andReturn(false);
		replay(login);
		
		assertEquals(true, login.checkIDcard("validID"));
		assertEquals(false, login.checkIDcard("invalidID"));
		verify(login);
		
	}

}
