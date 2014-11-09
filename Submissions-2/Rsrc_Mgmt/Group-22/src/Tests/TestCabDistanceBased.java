package Tests;

import junit.framework.TestCase;
import Project.*;

/**
 * The cab classes have not been developed so these tests will not run
 * for now.
 * @author nisarg
 *
 */

public class TestCabDistanceBased extends TestCase {
	
	public TestCabDistanceBased(String str)
	{
		super(str);
	}
	
	public void testAllMethods() {
		String UID = CabBookDistanceBased.generateUID();
		CabBookDistanceBased.bookCab(5, "RJ25SB7676", UID, "26/10/2016", "12:04", 56);
		assertEquals("RJ25SB7676", CabBookDistanceBased.getRoom());
		assertEquals(5, CabBookDistanceBased.getAttendanceCount());
		assertEquals(500, CabBookDistanceBased.calcFare());
		assertEquals("26/10/2016", CabBookDistanceBased.getBookingDay());
		assertEquals("12:04", CabBookDistanceBased.getStartingTime());
		assertEquals(56, CabBookDistanceBased.getDistance());
		try{
			CabBookDistanceBased.set_distance(-1);
		fail("Negative values not accepted");
		}
		catch(Exception  ex)
		{
			assertTrue(true);
		}	
	}

}
