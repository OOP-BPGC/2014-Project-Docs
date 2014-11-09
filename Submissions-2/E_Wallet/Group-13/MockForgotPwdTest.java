import java.awt.event.ActionEvent;

import org.easymock.EasyMock;

import junit.framework.TestCase;


public class MockForgotPwdTest extends TestCase {
//@Before
	private ForgotPassword testpassword = null;
	ForgotPwdInter mockpassword = EasyMock.createStrictMock(ForgotPwdInter.class);
	Object source = new Object();
	ActionEvent e = new ActionEvent(source,709,"Here is the action event!!");

//@Test
	/** Since actionPerformed() method returns void, 
	 * expectLastCall() is invoked to make sure that the method has been called.
	 * Mock object is in record mode before replay().
	 * so any calls to it performs default behaviour i.e. returns null and is eligible for replaying after replay() is called*/ 
	public void setUp() throws Exception {
		mockpassword.actionPerformed(e);
		EasyMock.expectLastCall();
		/*	EasyMock.expectLastCall().once();
		 * 	EasyMock.expectLastCall().atLeastOnce();
		 * 	EasyMock.expectLastCall().anyTimes();
		 */
	EasyMock.replay(mockpassword);
	
	EasyMock.verify(mockpassword);
	}
	
}