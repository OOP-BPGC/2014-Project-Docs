import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class DishwasherTest extends TestCase{
	private dishwasher mockdishwasher;
	private MockControl mockdishwasher_control;
	
	protected void setUp(){
		mockdishwasher_control = MockControl.createControl(dishwasher.class);
		mockdishwasher = (dishwasher) mockdishwasher_control.getMock();
	}
	
	public void testdishwasherMock() {
		mockdishwasher.markAttendance();
		mockdishwasher_control.setReturnValue(true);
		
		mockdishwasher.recSalary();
		mockdishwasher_control.setReturnValue(true);
		
		mockdishwasher.getName();
		mockdishwasher_control.setReturnValue("Sumathi");
		
		mockdishwasher.setName(EasyMock.isA(String.class));
		mockdishwasher_control.setReturnValue(true);
		
		mockdishwasher.getMob();
		mockdishwasher_control.setReturnValue("9444444444");
		
		
		mockdishwasher.setMob(EasyMock.isA(String.class));
		mockdishwasher_control.setReturnValue(true);
		
		mockdishwasher.Responsibility();
		mockdishwasher_control.setReturnValue("dishwasher");
		
		mockdishwasher_control.replay();
				
		assertTrue(mockdishwasher.markAttendance());
		assertTrue(mockdishwasher.recSalary());
		assertTrue(mockdishwasher.setName("Sumathi"));
		assertTrue(mockdishwasher.setMob("9879875465"));
		assertEquals("dishwasher",mockdishwasher.Responsibility());
		assertEquals("Sumathi",mockdishwasher.getName());
		assertEquals("9444444444",mockdishwasher.getMob());
		
	}
}

