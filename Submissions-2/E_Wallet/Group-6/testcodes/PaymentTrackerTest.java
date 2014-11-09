import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PaymentTrackerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		PaymentTracker t = new PaymentTracker();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PaymentTracker obj = new PaymentTracker();
		String s= obj.createLog(null, null, 23, 650);
		String actual = "Date: null Date : null Amount spent: 23 Balance in a/c: 650";
		assertEquals(s, actual);
		fail("Not yet implemented");
	}

}

