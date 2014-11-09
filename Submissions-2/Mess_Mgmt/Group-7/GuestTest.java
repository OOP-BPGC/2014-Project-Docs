import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

public class GuestTest extends TestCase{
	private Guest mockGuest;
	private MockControl mockGuest_control;
	
	protected void setUp(){
		mockGuest_control = MockControl.createControl(Guest.class);
		mockGuest = (Guest) mockGuest_control.getMock();
	}
	
	public void testGuestMock() {
		mockGuest.pay();
		mockGuest_control.setReturnValue(true);
		
		mockGuest.eat();
		mockGuest_control.setReturnValue(true);
				
		mockGuest_control.replay();
				
		assertTrue(mockGuest.pay());
		assertTrue(mockGuest.eat());
		
	}
}
