import junit.framework.TestCase;

public class TestUploadVideo extends TestCase {
	TestUploadVideo() {
		super();
	}

	Dopy d1 = new Dopy();

	public void Test1() {
		try {
			d1.uploadvideo();
			assertTrue(true);
		} catch (FileTooBigException e) {
			assertTrue(false);
		}
	}
}