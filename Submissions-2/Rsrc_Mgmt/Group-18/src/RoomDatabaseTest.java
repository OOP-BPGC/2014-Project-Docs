import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class RoomDatabaseTest {

	@Test
	public void testFind() 
	{
		RoomDatabase ab=new RoomDatabase();
		ArrayList<String> ans=ab.find("24-8-2014","1750");
		assertEquals(true,ans.contains("A201"));
		assertEquals(true,ans.contains("A405"));
		assertEquals(false,ans.contains("A301"));
	}

	@Test
	public void testCancel() 
	{
		RoomDatabase ab=new RoomDatabase();
		ab.cancel(1);
		assertEquals("Available",ab.data.get(2)[3]);

	}

}
