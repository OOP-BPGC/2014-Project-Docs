import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class EmployeeTest extends TestCase{
	private Employee mockEmployee;
	private MockControl mockEmployee_control;
	
	protected void setUp(){
		mockEmployee_control = MockControl.createControl(Employee.class);
		mockEmployee = (Employee) mockEmployee_control.getMock();
	}
	
	public void testEmployeeMock() {
		mockEmployee.recSalary();
		mockEmployee_control.setReturnValue(true);
		
		mockEmployee.markAttendance();
		mockEmployee_control.setReturnValue(true);
		
		mockEmployee.getName();
		mockEmployee_control.setReturnValue("Sumathi");
		
		mockEmployee.setName(EasyMock.isA(String.class));
		mockEmployee_control.setReturnValue(true);
		
		mockEmployee.getMob();
		mockEmployee_control.setReturnValue("9444444444");
		
		mockEmployee.setMob(EasyMock.isA(String.class));
		mockEmployee_control.setReturnValue(true);
	
		
		mockEmployee.responsibility();
		mockEmployee_control.setReturnValue("Clerk");
		
		mockEmployee_control.replay();
				
		assertTrue(mockEmployee.recSalary());
		assertTrue(mockEmployee.markAttendance());
		assertTrue(mockEmployee.setName("Sumathi"));
		assertTrue(mockEmployee.setMob("9879875465"));
		assertEquals("Sumathi",mockEmployee.getName());
		assertEquals("Clerk",mockEmployee.responsibility());
		assertEquals("9444444444",mockEmployee.getMob());
		
	}
}



