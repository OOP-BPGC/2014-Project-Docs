package RM;

import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

public class LoggedInUserTest extends TestCase {
	
	private LoggedInUser user;
	private LoggedInUserTestMethods test;
	protected void setUp() {
		test = createNiceMock(LoggedInUserTestMethods.class);
		user = new LoggedInUser();
	}
	
	public void testVerifyLogin(){
		String username = "123";
		String pwd = "12";
		expect(test.verifyLogin()).andReturn(false);
	
		replay();
		user.setLoggedInUserTestMethods(test);
		assertEquals(false,user.verifyLogin("123", "12"));
	}
	
	public void testNotLoggedInException(){
		try{
			user.checkPendingBookingRequets("12321");
			fail();
		}catch(NotLoggedInException e){
			System.out.println("User not logged in");
		}
	}
	
	public void testPrivilegeTooLowException(){
			user.setPrivilege(1);
			user.setLoggedIn(true);
			try {
				user.modifyPermissionRequestStatus();
				fail();
			}catch(UserPrivilegeTooLowException f){
				System.out.println("User privilege too low");
				assertTrue(true);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{		
			user.setPrivilege(2);
			try {
				user.modifyAvailableRooms(new Room[] {new Room(1), new Room(2)});
			}catch(UserPrivilegeTooLowException f){
				System.out.println("User privilege too low");
				assertTrue(true);
			}catch(Exception e){
				
			}
		}
	}
}
