import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class CoreTest extends TestCase{
	private Core mockCore;
	private MockControl mockCore_control;
	
	protected void setUp(){
		mockCore_control = MockControl.createControl(Core.class);
		mockCore = (Core) mockCore_control.getMock();
	}
	
	public void testCoreMock() {
		mockCore.createMember(EasyMock.isA(Person.class));
		mockCore_control.setReturnValue(true);
		
		mockCore.modifyMember(EasyMock.isA(Person.class),EasyMock.isA(Person.class));
		mockCore_control.setReturnValue(true);
		
		mockCore.createEvent(EasyMock.isA(String.class));
		mockCore_control.setReturnValue(true);
		
		mockCore.createAndBroadcastMessage();
		mockCore_control.setReturnValue(true);
		
		mockCore_control.replay();
		
		Person x = new Person(){

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
			}};
		
		assertTrue(mockCore.createMember(x));
		assertTrue(mockCore.modifyMember(x,x));
		assertTrue(mockCore.createEvent("{Event}"));
		assertTrue(mockCore.createAndBroadcastMessage());
		
	}
}
