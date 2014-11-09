import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MessRepTest extends TestCase{
	private MessRep mockMessRep;
	private MockControl mockMessRep_control;
	
	protected void setUp(){
		mockMessRep_control = MockControl.createControl(MessRep.class);
		mockMessRep = (MessRep) mockMessRep_control.getMock();
	}
	
	public void testMessRepMock() {
		mockMessRep.decideMenu();
		mockMessRep_control.setReturnValue(true);
		
		mockMessRep.getName();
		mockMessRep_control.setReturnValue("Sumathi");
		
		mockMessRep.setName(EasyMock.isA(String.class));
		mockMessRep_control.setReturnValue(true);
		
		mockMessRep.getMob();
		mockMessRep_control.setReturnValue("9444444444");
		
		mockMessRep.setMob(EasyMock.isA(String.class));
		mockMessRep_control.setReturnValue(true);
		
		mockMessRep_control.replay();
				
		assertTrue(mockMessRep.decideMenu());
		assertTrue(mockMessRep.setName("Sumathi"));
		assertTrue(mockMessRep.setMob("9879875465"));
		assertEquals("Sumathi",mockMessRep.getName());
		assertEquals("9444444444",mockMessRep.getMob());
		
	}
}

