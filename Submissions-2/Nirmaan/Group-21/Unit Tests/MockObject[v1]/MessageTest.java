import java.util.Date;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MessageTest extends TestCase{
	private Message mockMessage;
	private MockControl mockMessage_control;
	
	protected void setUp(){
		mockMessage_control = MockControl.createControl(Message.class);
		mockMessage = (Message) mockMessage_control.getMock();
	}
	
	public void testMessageMock() {
		mockMessage.decodeString(EasyMock.isA(String.class));
		mockMessage_control.setReturnValue("DecodedString");
		
		mockMessage.decodeString(EasyMock.isA(String.class));
		mockMessage_control.setReturnValue("EncodedString");
		
		mockMessage.isAvailable(EasyMock.isA(Person.class));
		mockMessage_control.setReturnValue(true);
		
		mockMessage.setDate(EasyMock.isA(Date.class));
		mockMessage_control.setReturnValue(true);
		
		mockMessage_control.replay();
		
		Person p = new Core(){ //Core or ProjectHead or Volunteer

			@Override
			public String getDesignation() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean setDesignation(String s) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String getEvents() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getProjects() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean updateMinutesOfMeeting(String s) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean createMember(Person p) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean modifyMember(Person old, Person p) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean createEvent(String s) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean createAndBroadcastMessage() {
				// TODO Auto-generated method stub
				return false;
			}};
			
		assertEquals("DecodedString",mockMessage.decodeString("Test"));
		assertEquals("EncodedString",mockMessage.decodeString("Test"));
		assertTrue(mockMessage.isAvailable(p)); // p's class will be used to validate availability
		assertTrue(mockMessage.setDate(new Date(2000,1,1)));
		
	}

}
