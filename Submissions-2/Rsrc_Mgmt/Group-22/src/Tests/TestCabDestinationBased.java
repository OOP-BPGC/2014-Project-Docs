package Tests;

import junit.framework.TestCase;
import Project.*;

/**
 * The cab classes have not been developed so these tests will not run
 * for now.
 * @author nisarg
 *
 */

public class TestCabDestinationBased extends TestCase {
	
	public TestCabDestinationBased(String str)
	{
		super(str);
	}
	
	public void testAllMethods() {

		String UID = CabBookDestinationBased.generateUID();
		CabBookDestinationBased.bookCab(5, "RJ25SB7676", UID, "26/10/2016", "12:04", "Margaon", "Vasco");
		assertEquals("RJ25SB7676", CabBookDestinationBased.getCab());
		assertEquals(5, CabBookDestinationBased.getAttendanceCount());
		assertEquals(500, CabBookDestinationBased.calcFare());
		assertEquals("26/10/2016", CabBookDestinationBased.getBookingDay());
		assertEquals("12:04", CabBookDestinationBased.getStartingTime());
		assertEquals("Margaon", CabBookDestinationBased.getInitialDestination());
		assertEquals("Vasco", CabBookDestinationBased.getFinalDestination());
		try
		{
			CabBookDestinationBased.set_destination("wagamama");
			fail("Invalid destination passed.");
		}catch(Exception ex)
		{
			assertTrue(true);
		}
		String[] d ={"Margaon","Vasco"};
		String[] g = new String[CabBookDestinationBased.nextdest];
		for(int i=0;i<CabBookDestinationBased.nextdest;i++)
			g[i]=CabBookDestinationBased.get_destinations()[i];
			assertArrayEquals(g,d);	
	}

}
