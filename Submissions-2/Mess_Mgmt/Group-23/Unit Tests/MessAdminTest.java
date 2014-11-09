import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MessAdminTest extends TestCase
{
	private MessAdmin ma;
	private MockControl mockma;
	
	protected void setUp()
	{
		mockma = MockControl.createControl(MessAdmin.class);
		ma = (MessAdmin) mockma.getMock();
	}
	
	public void testMessAdminMock()
	{
		ma.getName();
		mockma.setReturnValue("name");
		
		ma.getEmail();
		mockma.setReturnValue("123@abc.com");
		
		ma.getPassword();
		mockma.setReturnValue("pass");
		
		ma.setName(EasyMock.isA(String.class));
		mockma.setReturnValue(true);
		
		ma.setEmail(EasyMock.isA(String.class));
		mockma.setReturnValue(true);
		
		ma.setPassword(EasyMock.isA(String.class));
		mockma.setReturnValue(true);
		
		ma.resetSystem();
		mockma.setReturnValue(true);
		
		ma.swipe(EasyMock.isA(Student.class);
		mockma.setReturnValue(true);
		
		ma.changePassword(EasyMock.isA(String.class));
		mockma.setReturnValue(true);

		ma.editMenu();
		mockma.setReturnValue(true);
		
		ma.updateMenu();
		mockma.setReturnValue(true);
		
		ma.login();
		mockma.setReturnValue(true);
		
		ma.logout();
		mockma.setReturnValue(true);
		
		ma.viewNCOrders();
		mockma.setReturnValue(true);
		
		ma.approveSpecialOrder(EasyMock.isA(SpecialOrder.class));
		mockma.setReturnValue(true);
		
		mockma.replay();
		
		assertEquals(ma.getName(),"name");
		assertEquals(ma.getEmail(),"123@abc.com");
		assertEquals(ma.getPassword(),"pass");
		
		assertTrue(ma.setName("name"));
		assertTrue(ma.setEmail("123@abc.com"));
		assertTrue(ma.setPassword("pass"));
		
		assertTrue(ma.resetSystem());
		assertTrue(ma.editMenu());
		assertTrue(ma.updateMenu());
		assertTrue(ma.login());
		assertTrue(ma.logout());
		assertTrue(ma.viewNCOrders());
		
		assertTrue(ma.swipe(new Student()));
		assertTrue(ma.changePassword("pass2"));
		assertTrue(ma.approveSpecialOrder(new SpecialOrder()));
	}
}