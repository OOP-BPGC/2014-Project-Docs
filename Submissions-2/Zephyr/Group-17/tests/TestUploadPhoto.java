import junit.framework.TestCase;

public class TestUploadPhoto extends TestCase {
	TestUploadPhoto() {
		super();
	}

	Dopy d = new Dopy();

	public void Test1() {
		try {
			d.uploadphoto();
			assertTrue(true);
		} catch (FileTooBigException e) {
			assertTrue(false);
		}
	}
}