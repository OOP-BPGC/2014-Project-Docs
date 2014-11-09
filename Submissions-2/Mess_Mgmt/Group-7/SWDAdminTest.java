import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

public class SWDAdminTest extends TestCase{
	private SWDAdmin mockSWDAdmin;
	private MockControl mockSWDAdmin_control;
	
	protected void setUp(){
		mockSWDAdmin_control = MockControl.createControl(SWDAdmin.class);
		mockSWDAdmin = (SWDAdmin) mockSWDAdmin_control.getMock();
	}
	
	public void testSWDAdminMock() {
		mockSWDAdmin.addStudent();
		mockSWDAdmin_control.setReturnValue(true);
		
		mockSWDAdmin.approveLeave();
		mockSWDAdmin_control.setReturnValue(true);
		
		mockSWDAdmin.updateMessOption();
		mockSWDAdmin_control.setReturnValue(true);
		
		mockSWDAdmin.doFloppyPosting();
		mockSWDAdmin_control.setReturnValue(true);
				
		mockSWDAdmin_control.replay();
				
		assertTrue(mockSWDAdmin.addStudent());
		assertTrue(mockSWDAdmin.approveLeave());
		assertTrue(mockSWDAdmin.updateMessOption());
		assertTrue(mockSWDAdmin.doFloppyPosting());
		
	}
}



