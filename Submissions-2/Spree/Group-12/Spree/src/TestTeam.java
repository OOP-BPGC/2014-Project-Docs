import junit.framework.TestCase;

import org.junit.Test;


public class TestTeam extends TestCase {
	
	Team team;

	@Override
	public void setUp() {
		team = new Team();
	}

	@Test
	public void testUpdateParticipants() {
		Participant p = new Participant();
		team.addParticipant(p);
		assert(team.getParticipants().contains(p));
		team.removeParticipant(p);
		assert(!team.getParticipants().contains(p));
	}

	@Test
	public void testUpdateStatistics() {
		fail("Not yet implemented");
	}

}
