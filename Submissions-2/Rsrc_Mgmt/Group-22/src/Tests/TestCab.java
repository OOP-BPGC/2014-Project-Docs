package Tests;

import junit.framework.TestCase;
import Project.*;

/**
 * The cab classes have not been developed so these tests will not run
 * for now.
 * @author nisarg
 *
 */

public class TestCab extends TestCase{
	
	public TestCab(String str)
	{
		super(str);
	}
	
	private Cab cab = new Cab();
	
	public void testCabCabNumber()
	{
		cab.setCabNumber("RJ25SB7676");
		assertEquals("RJ25SB7676", cab.getCabNumber());
	}
	
	public void testCabStatus()
	{
		cab.setStatus("booked");
		assertEquals("booked", cab.getStatus());
	}
	
	public void testCabBookingTime()
	{
		cab.setBookingTime("12:04", "17.06");
		assertEquals("12:04", cab.getBookingTime());
	}
	
	public void testCabBookingDate()
	{
		cab.setBookingDate("10/15/2016");
		assertEquals("10/15/2016", cab.getBookingDate());
	}
	
	public void testCabCapacity()
	{
		cab.setCapacity(5);
		assertEquals(5, cab.getCapacity());
	}

}
