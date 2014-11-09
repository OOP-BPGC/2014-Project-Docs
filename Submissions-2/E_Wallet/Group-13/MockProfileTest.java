import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

import org.easymock.EasyMock;

import junit.framework.TestCase;


public class MockProfileTest extends TestCase {
//@Before
	private Profile testprofile = null;
	ProfileInter mockprofile = EasyMock.createStrictMock(ProfileInter.class);
	Object source = new Object();
	ActionEvent e = new ActionEvent(source,586,"Here is the action event!!");
	Object src = new Object();
	private ItemSelectable s;
	ItemEvent ie = new ItemEvent(s,4,src,5);
//@Test
	/** Since actionPerformed() method returns void, 
	 * expectLastCall() is invoked to make sure that the method has been called.
	 * Mock object is in record mode before replay().
	 * so any calls to it performs default behaviour i.e. returns null and is eligible for replaying after replay() is called*/ 
	public void setUp() throws Exception {
		mockprofile.actionPerformed(e);
		EasyMock.expectLastCall();
		/*	EasyMock.expectLastCall().once();
		 * 	EasyMock.expectLastCall().atLeastOnce();
		 * 	EasyMock.expectLastCall().anyTimes();
		 */
		
		EasyMock.replay(mockprofile);
		EasyMock.verify(mockprofile);
		mockprofile.itemStateChanged(ie);
		EasyMock.expectLastCall();
		EasyMock.replay(mockprofile);
		EasyMock.verify(mockprofile);
	}
	
	
}