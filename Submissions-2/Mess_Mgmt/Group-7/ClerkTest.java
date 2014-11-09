import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class ClerkTest extends TestCase{
	private Clerk mockClerk;
	private MockControl mockClerk_control;
	
	protected void setUp(){
		mockClerk_control = MockControl.createControl(Clerk.class);
		mockClerk = (Clerk) mockClerk_control.getMock();
	}
	
	public void testClerkMock() {
		mockClerk.markAttendance();
		mockClerk_control.setReturnValue(true);
		
		mockClerk.recSalary();
		mockClerk_control.setReturnValue(true);
		
		mockClerk.takeMoney();
		mockClerk_control.setReturnValue(true);
		
		mockClerk.scanCard();
		mockClerk_control.setReturnValue(true);
		
		mockClerk.getName();
		mockClerk_control.setReturnValue("Sumathi");
		
		mockClerk.setName(EasyMock.isA(String.class));
		mockClerk_control.setReturnValue(true);
		
		mockClerk.getMob();
		mockClerk_control.setReturnValue("9444444444");
		
		
		mockClerk.setMob(EasyMock.isA(String.class));
		mockClerk_control.setReturnValue(true);
		
		mockClerk.Responsibility();
		mockClerk_control.setReturnValue("Clerk");
		
		mockClerk_control.replay();
				
		assertTrue(mockClerk.markAttendance());
		assertTrue(mockClerk.recSalary());
		assertTrue(mockClerk.takeMoney());
		assertTrue(mockClerk.scanCard());
		assertTrue(mockClerk.setName("Sumathi"));
		assertTrue(mockClerk.setMob("9879875465"));
		assertEquals("Clerk",mockClerk.Responsibility());
		assertEquals("Sumathi",mockClerk.getName());
		assertEquals("9444444444",mockClerk.getMob());
		
	}
}

