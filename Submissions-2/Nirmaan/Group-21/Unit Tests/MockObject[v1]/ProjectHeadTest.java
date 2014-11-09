import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class ProjectHeadTest extends TestCase{
	private ProjectHead mockProjectHead;
	private MockControl mockProjectHead_control;
	
	protected void setUp(){
		mockProjectHead_control = MockControl.createControl(ProjectHead.class);
		mockProjectHead = (ProjectHead) mockProjectHead_control.getMock();
	}
	
	public void testProjectHeadMock() {
		mockProjectHead.volunteerProjectRequest();
		mockProjectHead_control.setReturnValue(true);
		
		mockProjectHead.manageEvent(EasyMock.isA(String.class),EasyMock.isA(String.class));
		mockProjectHead_control.setReturnValue(true);
		
		mockProjectHead.manageProject(EasyMock.isA(String.class),EasyMock.isA(String.class));
		mockProjectHead_control.setReturnValue(true);
		
		mockProjectHead.createAndBroadcastMessage();
		mockProjectHead_control.setReturnValue(true);
		
		mockProjectHead_control.replay();
				
		assertTrue(mockProjectHead.volunteerProjectRequest());
		assertTrue(mockProjectHead.manageEvent("{OldEvent}","{NewEvent}"));
		assertTrue(mockProjectHead.manageProject("{OldProject}","{NewProject}"));
		assertTrue(mockProjectHead.createAndBroadcastMessage());
		
	}
}
