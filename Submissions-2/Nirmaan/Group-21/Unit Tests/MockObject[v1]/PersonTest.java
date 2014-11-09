import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class PersonTest extends TestCase{
	private Person mockPerson;
	private MockControl mockPerson_control;
	
	protected void setUp(){
		mockPerson_control = MockControl.createControl(Person.class);
		mockPerson = (Person) mockPerson_control.getMock();
	}
	
	public void testPersonMock() {
		mockPerson.getDesignation();
		mockPerson_control.setReturnValue("Core");
		
		mockPerson.getEvents();
		mockPerson_control.setReturnValue("{Event1},{Event2}");
		
		mockPerson.getProjects();
		mockPerson_control.setReturnValue("{Proj1},{Proj2}");
		
		mockPerson.setDesignation(EasyMock.isA(String.class));
		mockPerson_control.setReturnValue(true);
		
		mockPerson.updateMinutesOfMeeting(EasyMock.isA(String.class));
		mockPerson_control.setReturnValue(true);
		
		mockPerson_control.replay();
		
		assertEquals("Core",mockPerson.getDesignation());
		assertEquals("{Event1},{Event2}",mockPerson.getEvents());
		assertEquals("{Proj1},{Proj2}",mockPerson.getProjects());
		assertTrue(mockPerson.setDesignation("Kahuna"));
		assertTrue(mockPerson.updateMinutesOfMeeting("Big Kahuna Burger"));
		
	}
}
