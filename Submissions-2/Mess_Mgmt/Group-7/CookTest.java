import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class CookTest extends TestCase{
	private Cook mockCook;
	private MockControl mockCook_control;
	
	protected void setUp(){
		mockCook_control = MockControl.createControl(Cook.class);
		mockCook = (Cook) mockCook_control.getMock();
	}
	
	public void testCookMock() {
		mockCook.markAttendance();
		mockCook_control.setReturnValue(true);
		
		mockCook.recSalary();
		mockCook_control.setReturnValue(true);
		
		mockCook.getName();
		mockCook_control.setReturnValue("Sumathi");
		
		mockCook.setName(EasyMock.isA(String.class));
		mockCook_control.setReturnValue(true);
		
		mockCook.getMob();
		mockCook_control.setReturnValue("9444444444");
		
		
		mockCook.setMob(EasyMock.isA(String.class));
		mockCook_control.setReturnValue(true);
		
		mockCook.Responsibility();
		mockCook_control.setReturnValue("Cook");
		
		mockCook_control.replay();
				
		assertTrue(mockCook.markAttendance());
		assertTrue(mockCook.recSalary());
		assertTrue(mockCook.setName("Sumathi"));
		assertTrue(mockCook.setMob("9879875465"));
		assertEquals("Cook",mockCook.Responsibility());
		assertEquals("Sumathi",mockCook.getName());
		assertEquals("9444444444",mockCook.getMob());
		
	}
}

