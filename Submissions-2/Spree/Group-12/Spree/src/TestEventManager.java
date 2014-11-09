import junit.framework.TestCase;

import org.junit.Test;


public class TestEventManager extends TestCase {

	EventManager em;
	Event event;
	
	@Override
	public void setUp() {
		em = new EventManager();
		event = new Event();
	}

	@Test
	public void testUpdateScores() {
		Fixture fixture = new Fixture();
		em.updateScores(fixture, "score");
		assertEquals(fixture.getScore(), "score");
	}

	@Test
	public void testUpdateFixture() {
		Fixture fixture = new Fixture();
		event.addFixture(fixture);
		assert(event.getFixture().contains(fixture));
	}

}
