package Tests;

import Project.*;
import junit.framework.*;

/**
 * The class has been implemented in such a way that none of the methods could be
 * tested without refactoring the code.
 * @author varsheeth
 *
 */

public class TestRoomDB extends TestCase
{

	private static Room room = new Room();
	
	public TestRoomDB(String str)
	{
		super(str);
	}
	
	public static void oneTimeSetUp()
	{
		room.setBookingDate("26/12/1256");
		room.setBookingTime("12:04", "17:06");
		room.setCapacity(56);
		room.setStatus("booked");
		room.setRoomNumber("A609");
		room.setProjectorStatus(false);
	}

}
