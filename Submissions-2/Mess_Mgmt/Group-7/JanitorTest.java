import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class JanitorTest extends TestCase{
	private Janitor mockJanitor;
	private MockControl mockJanitor_control;
	
	protected void setUp(){
		mockJanitor_control = MockControl.createControl(Janitor.class);
		mockJanitor = (Janitor) mockJanitor_control.getMock();
	}
	
	public void testJanitorMock() {
		mockJanitor.markAttendance();
		mockJanitor_control.setReturnValue(true);
		
		mockJanitor.recSalary();
		mockJanitor_control.setReturnValue(true);
		
		mockJanitor.getName();
		mockJanitor_control.setReturnValue("Sumathi");
		
		mockJanitor.setName(EasyMock.isA(String.class));
		mockJanitor_control.setReturnValue(true);
		
		mockJanitor.getMob();
		mockJanitor_control.setReturnValue("9444444444");
		
		
		mockJanitor.setMob(EasyMock.isA(String.class));
		mockJanitor_control.setReturnValue(true);
		
		mockJanitor.Responsibility();
		mockJanitor_control.setReturnValue("Janitor");
		
		mockJanitor_control.replay();
				
		assertTrue(mockJanitor.markAttendance());
		assertTrue(mockJanitor.recSalary());
		assertTrue(mockJanitor.setName("Sumathi"));
		assertTrue(mockJanitor.setMob("9879875465"));
		assertEquals("Janitor",mockJanitor.Responsibility());
		assertEquals("Sumathi",mockJanitor.getName());
		assertEquals("9444444444",mockJanitor.getMob());
		
	}
}

