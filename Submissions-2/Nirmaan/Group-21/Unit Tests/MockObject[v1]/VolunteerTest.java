import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class VolunteerTest extends TestCase{
	private Volunteer mockVolunteer;
	private MockControl mockVolunteer_control;
	
	protected void setUp(){
		mockVolunteer_control = MockControl.createControl(Volunteer.class);
		mockVolunteer = (Volunteer) mockVolunteer_control.getMock();
	}
	
	public void testVolunteerMock() {
		mockVolunteer.requestProject();
		mockVolunteer_control.setReturnValue(true);
		
		mockVolunteer.workForEvent(EasyMock.isA(String.class));
		mockVolunteer_control.setReturnValue(true);
		
		mockVolunteer.workForProject(EasyMock.isA(String.class));
		mockVolunteer_control.setReturnValue(true);
		
		mockVolunteer_control.replay();
				
		assertTrue(mockVolunteer.requestProject());
		assertTrue(mockVolunteer.workForEvent("Event Work}"));
		assertTrue(mockVolunteer.workForProject("Project Work"));
		
	}
}
