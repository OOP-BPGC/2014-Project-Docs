package Tests;

import Project.*;
import junit.framework.*;

public class TestRoomBook extends TestCase
{
	private static RoomBook book = new RoomBook();
	
	public TestRoomBook(String str)
	{
		super(str);
	}
	
	public static void oneTimeSetUp()
	{
		String UID = book.generateUID();
	}
	
	public void testGetRoom()
	{
		assertEquals("A604", book.getRoom());
	}
	public void testGetAttendanceCount()
	{
		assertEquals(50, book.getAttendanceCount());
	}
	public void testGetBookingDay()
	{
		assertEquals("26/10/2016", book.getBookingDate());
	}
	public void testGetStartingTime()
	{
		assertEquals("12:04", book.getStartingTime());
	}
	public void testGetDuration()
	{
		assertEquals("17:06", book.getDuration());
	}

}
