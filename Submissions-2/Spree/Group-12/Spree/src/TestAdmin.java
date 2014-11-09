import static org.easymock.EasyMock.*;
import junit.framework.TestCase;

import org.junit.Test;


public class TestAdmin extends TestCase{

	Admin admin;
	Sport sport;
	
	@Override
    public void setUp() {
		admin = createNiceMock(Admin.class);
		sport = createNiceMock(Sport.class);
	}
	
	@Test
	public void testCheckNewRegistrations() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateFinance() {
		expect(admin.updateFinance(100.0f)).andReturn(100.0f);
		replay(admin);
		
		assertEquals(100.0f, admin.updateFinance(100.0f), 0);
		verify(admin);
		
	}

	@Test
	public void testSetRules() {
		Rule rule = new Rule();
		admin.setRules(sport, rule);
		assertEquals(sport.getRules(), rule);
	}

	@Test
	public void testUpdateScores() {
		Fixture fixture = new Fixture();
		admin.updateScores(fixture, "score");
		assertEquals(fixture.getScore(), "score");
	}

	@Test
	public void testUpdateFixtures() {
		Fixture fixture = new Fixture();
		sport.addFixture(fixture);
		assert(sport.getFixture().contains(fixture));
	}

}
