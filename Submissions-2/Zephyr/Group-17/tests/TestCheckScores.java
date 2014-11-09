import junit.framework.*;

public class TestCheckScores extends TestCase {
	TestCheckScores() {
		super();
	}

	Hostelmember h = new Hostelmember();

	public void Test1() {
		try {
			h.checkscore();
			assertTrue(true);
		} catch (EventNotOccurredException e) {
			assertTrue(false);
		}
	}
}