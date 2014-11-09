import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class WaiterTest extends TestCase{
	private Waiter mockWaiter;
	private MockControl mockWaiter_control;
	
	protected void setUp(){
		mockWaiter_control = MockControl.createControl(Waiter.class);
		mockWaiter = (Waiter) mockWaiter_control.getMock();
	}
	
	public void testWaiterMock() {
		mockWaiter.markAttendance();
		mockWaiter_control.setReturnValue(true);
		
		mockWaiter.recSalary();
		mockWaiter_control.setReturnValue(true);
		
		mockWaiter.getName();
		mockWaiter_control.setReturnValue("Sumathi");
		
		mockWaiter.setName(EasyMock.isA(String.class));
		mockWaiter_control.setReturnValue(true);
		
		mockWaiter.getMob();
		mockWaiter_control.setReturnValue("9444444444");
		
		
		mockWaiter.setMob(EasyMock.isA(String.class));
		mockWaiter_control.setReturnValue(true);
		
		mockWaiter.Responsibility();
		mockWaiter_control.setReturnValue("Waiter");
		
		mockWaiter_control.replay();
				
		assertTrue(mockWaiter.markAttendance());
		assertTrue(mockWaiter.recSalary());
		assertTrue(mockWaiter.setName("Sumathi"));
		assertTrue(mockWaiter.setMob("9879875465"));
		assertEquals("Waiter",mockWaiter.Responsibility());
		assertEquals("Sumathi",mockWaiter.getName());
		assertEquals("9444444444",mockWaiter.getMob());
		
	}
}

