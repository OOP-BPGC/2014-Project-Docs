import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class StudentTest extends TestCase
{
	private Student st;
	private MockControl mockst;
	
	protected void setUp()
	{
		mockst = MockControl.createControl(Student.class);
		st = (Student) mockst.getMock();
	}
	
	public void testStudentMock()
	{
		st.getName();
		mockst.setReturnValue("name");
		
		st.getID();
		mockst.setReturnValue("2013A7PS078G");
		
		st.getPassword();
		mockst.setReturnValue("pass");
		
		st.getEmail();
		mockst.setReturnValue("123@abc.com");
		
		st.getMessOption();
		mockst.setReturnValue('A');
		
		st.getHasEaten();
		mockst.setReturnValue(false);
		
		
		st.setName(EasyMock.isA(String.class));
		mockst.setReturnValue(true);
		
		st.setID(EasyMock.isA(String.class));
		mockst.setReturnValue(true);
		
		st.setPassword(EasyMock.isA(String.class));
		mockst.setReturnValue(true);
		
		st.setEmail(EasyMock.isA(String.class));
		mockst.setReturnValue(true);
		
		st.setMessOption(EasyMock.isA(Character.class));
		mockst.setReturnValue(true);
		
		st.setHasEaten(EasyMock.isA(Boolean.class));
		mockst.setReturnValue(true);
		
		st.sendFeedback(EasyMock.isA(Feedback.class));
		mockst.setReturnValue(true);
		
		
		st.login();
		mockst.setReturnValue(true);
	
		st.logout();
		mockst.setReturnValue(true);
		
		st.resetPassword();
		mockst.setReturnValue(true);
		
		st.applyForLeave();
		mockst.setReturnValue(true);
		
		st.bookSpecialMeal();
		mockst.setReturnValue(true);
		
		st.bookNCMeal();
		mockst.setReturnValue(true);
		
		st.viewOrderStatus();
		mockst.setReturnValue(true);
		
		st.viewSpecialOrderStatus();
		mockst.setReturnValue(true);
		
		st.viewMenu();
		mockst.setReturnValue(true);
		
		mockst.replay();
		
		assertTrue(st.setName("name"));
		assertTrue(st.setID("2013A7PS078G"));
		assertTrue(st.setPassword("pass"));
		assertTrue(st.setEmail("123@abc.com"));
		assertTrue(st.setMessOption('A'));
		assertTrue(st.setHasEaten(false));
		assertTrue(st.sendFeedback(new Feedback()));
		
		assertTrue(st.login());
		assertTrue(st.logout());
		assertTrue(st.resetPassword());
		assertTrue(st.applyForLeave());
		assertTrue(st.bookSpecialMeal());
		assertTrue(st.bookNCMeal);
		assertTrue(st.viewOrderStatus());
		assertTrue(st.viewSpecialOrderStatus());
		assertTrue(st.viewMenu());

		assertEquals(st.getName(),"name");
		assertEquals(st.getID(),"2013A7PS078G");
		assertEquals(st.getPassword(),"pass");
		assertEquals(st.getEmail(),"123@abc.com");
		assertEquals(st.getMessOption(),'A');
		assertEquals(st.getHasEaten(),false);
		
	}
}