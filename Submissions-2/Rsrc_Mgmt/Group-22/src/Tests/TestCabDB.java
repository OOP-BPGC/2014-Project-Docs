package Tests;

import junit.framework.TestCase;
import Project.*;

/**
 * The cab classes have not been developed so these tests will not run
 * for now.
 * The class has been implemented in such a way that none of the methods could be
 * tested without refactoring the code.
 * @author nisarg
 *
 */

public class TestCabDB extends TestCase {
	
	public TestCabDB(String str)
	{
		super(str);
	}
	
	public static void oneTimeSetUp() {
		Cab cab = new Cab();
		cab.setCabNumber("RJ25SB7676");
		cab.setStatus("booked");
		cab.setBookingType("time-based");
		cab.setBookingTime("12:04", "17.06");
		cab.setBookingDate("10/15/2016");
		cab.setCapacity(5);
		CabDB.addCab(cab);
	}
}
