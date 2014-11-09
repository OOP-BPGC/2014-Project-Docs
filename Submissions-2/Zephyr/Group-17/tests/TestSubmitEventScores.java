import junit.framework.TestCase;

public class TestSubmitEventScores extends TestCase {
	TestSubmitEventScores() {
		super();
	}
Judge j=new Judge();

	public void Test1() {
		try {j.submitscore();
			assertTrue(true);
		} catch (EventNotOccurredException e) {
			assertTrue(false);
		}
	}
}