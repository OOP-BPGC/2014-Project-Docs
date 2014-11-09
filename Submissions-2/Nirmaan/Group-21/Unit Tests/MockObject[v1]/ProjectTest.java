import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class ProjectTest extends TestCase{
	private Project mockProject;
	private MockControl mockProject_control;
	
	protected void setUp(){
		mockProject_control = MockControl.createControl(Project.class);
		mockProject = (Project) mockProject_control.getMock();
	}
	
	public void testProjectMock() {
		mockProject.viewSchedule();
		mockProject_control.setReturnValue("{Schedule}");
		
		mockProject.setEvent(EasyMock.isA(String.class),EasyMock.isA(String.class));
		mockProject_control.setReturnValue(true);
		
		mockProject.setAttribute(EasyMock.isA(String.class),EasyMock.isA(String.class));
		mockProject_control.setReturnValue(true);
		
		mockProject_control.replay();
				
		assertEquals("{Schedule}",mockProject.viewSchedule());
		assertTrue(mockProject.setEvent("EventName","{EventAttributes}"));
		assertTrue(mockProject.setAttribute("Attribute","Value"));
		
	}
}
