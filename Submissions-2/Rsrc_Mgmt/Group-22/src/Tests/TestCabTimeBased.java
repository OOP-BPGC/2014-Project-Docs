package Tests;

import junit.framework.TestCase;
import Project.*;

/**
 * The cab classes have not been developed so these tests will not run
 * for now.
 * @author nisarg
 *
 */

public class TestCabTimeBased extends TestCase {
	
	public TestCabTimeBased(String str)
	{
		super(str);
	}
	
	public void testAllMethods() {
		
		String UID = CabBookTimeBased.generateUID();
		CabBookTimeBased.bookCab(5, "RJ25SB7676", UID, "26/10/2016", "12:04", "17:06");
		assertEquals("RJ25SB7676", CabBookTimeBased.getCab());
		assertEquals(5, CabBookTimeBased.getAttendanceCount());
		assertEquals(500, CabBookTimeBased.calcFare());
		assertEquals("26/10/2016", CabBookTimeBased.getBookingDay());
		assertEquals("12:04", CabBookTimeBased.getStartingTime());
		assertEquals("17:06", CabBookTimeBased.getDuration());
		
	}

}
