import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MessManagerTest extends TestCase{
	private MessManager mockMessManager;
	private MockControl mockMessManager_control;
	
	protected void setUp(){
		mockMessManager_control = MockControl.createControl(MessManager.class);
		mockMessManager = (MessManager) mockMessManager_control.getMock();
	}
	
	public void testMessManagerMock() {
		
		mockMessManager.getName();
		mockMessManager_control.setReturnValue("Sumathi");
		
		mockMessManager.setName(EasyMock.isA(String.class));
		mockMessManager_control.setReturnValue(true);
		
		mockMessManager.getMob();
		mockMessManager_control.setReturnValue("9444444444");
		
		mockMessManager.getBalance();
		mockMessManager_control.setReturnValue(20);
		
		mockMessManager.setMob(EasyMock.isA(String.class));
		mockMessManager_control.setReturnValue(true);
		
		mockMessManager.paySalary(EasyMock.isA(Employee.class));
		mockMessManager_control.setReturnValue(true);
		
		mockMessManager.putOnLeave(EasyMock.isA(Employee.class));
		mockMessManager_control.setReturnValue(true);
		
		mockMessManager.doTransaction(EasyMock.isA(Integer.class));
		mockMessManager_control.setReturnValue(true);
		
		mockMessManager_control.replay();
		Employee e = null;
		assertTrue(mockMessManager.setName("Sumathi"));
		assertTrue(mockMessManager.setMob("9879875465"));
		assertEquals("Sumathi",mockMessManager.getName());
		assertEquals("9444444444",mockMessManager.getMob());
		assertEquals(20,mockMessManager.getBalance());
		assertTrue(mockMessManager.paySalary(e));
		assertTrue(mockMessManager.putOnLeave(e));
		assertTrue(mockMessManager.doTransaction(2));
		
	}
}

