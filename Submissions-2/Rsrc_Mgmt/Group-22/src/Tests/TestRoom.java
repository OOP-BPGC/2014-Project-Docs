package Tests;

import Project.*;
import junit.framework.*;

/**
 * This class contains test modules for Room class.
 * Download Room/java from src/Project/ directory to run these tests.
 * @author varsheeth
 *
 */

public class TestRoom extends TestCase
{
	public TestRoom(String str)
	{
		super(str);
	}
	
	private static Room room = new Room();
	
	public static void oneTimeSetUp()
	{
		room.setRoomNumber("A604");
		room.setProjectorStatus(false);
		room.setStatus("booked");
		room.setBookingTime("12:04", "17.06");
		room.setBookingDate("10/15/2016");
		room.setCapacity(50);
    }
	
	public void testGetRoomNumber()
	{
		assertEquals("A604", room.getRoomNumber());
	}
	public void testGetProjectorStatus()
	{
		assertFalse("Error", room.getProjectorStatus());
	}
	public void testGetStatus()
	{
		assertEquals("booked", room.getStatus());
	}
	public void testGetCapacity()
	{
		assertEquals(50, room.getCapacity());
	}
	public void testGetStartingTime()
	{
		assertEquals("12:04", room.getStartingTime());
	}
	public void testGetDuration()
	{
		assertEquals("17.06", room.getDuration());
	}
	public void testGetBookingDate()
	{
		assertEquals("10/15/2016", room.getBookingDate());
	}
	
	
}
