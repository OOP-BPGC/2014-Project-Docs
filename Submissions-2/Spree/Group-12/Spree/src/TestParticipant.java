import static org.easymock.EasyMock.*;

import java.util.ArrayList;

import junit.framework.TestCase;
import org.junit.Test;


public class TestParticipant extends TestCase{

	Participant participant;
	
	@Override
	public void setUp(){
		participant = createNiceMock(Participant.class);
	}

	@Test
	public void testRegisterForAcco() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetReminders() {
		expect(participant.getReminders()).andReturn("Reminders");
		replay(participant);
		
		assertEquals("Reminders", participant.getReminders());
		verify(participant);
	}

	@Test
	public void testViewMyFixture() {
		ArrayList<Fixture> fixtures = new ArrayList<Fixture>();
		fixtures.add(new Fixture());
		
		expect(participant.viewMyFixture()).andReturn(fixtures);
		replay(participant);
		
		assertEquals(fixtures, participant.viewMyFixture());
		verify(participant);
	}

}
