import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class EventTest extends TestCase{
	private Event mockEvent;
	private MockControl mockEvent_control;
	
	protected void setUp(){
		mockEvent_control = MockControl.createControl(Event.class);
		mockEvent = (Event) mockEvent_control.getMock();
	}
	
	public void testEventMock() {
		mockEvent.setName(EasyMock.isA(String.class));
		mockEvent_control.setReturnValue(true);
		
		mockEvent.setLocation(EasyMock.isA(String.class));
		mockEvent_control.setReturnValue(true);
		
		mockEvent.setOrganizers(EasyMock.isA(String.class));
		mockEvent_control.setReturnValue(true);
		
		mockEvent.setContacts(EasyMock.isA(String.class));
		mockEvent_control.setReturnValue(true);
		
		mockEvent.getContacts();
		mockEvent_control.setReturnValue("{ContactList}");
		
		mockEvent_control.replay();
				
		assertTrue(mockEvent.setName("Test"));
		assertTrue(mockEvent.setLocation("Test"));
		assertTrue(mockEvent.setOrganizers("Test"));
		assertTrue(mockEvent.setContacts("Test"));
		assertEquals("{ContactList}",mockEvent.getContacts());
		
	}
}
