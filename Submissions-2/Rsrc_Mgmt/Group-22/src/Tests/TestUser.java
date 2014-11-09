package Tests;

import Project.*;
import junit.framework.*;


public class TestUser extends TestCase
{
	static User user = new User();
	
	public TestUser(String str)
	{
		super(str);
	}
	
	public static void oneTimeSetUp()
	{
		user.setId("2013A7PS049G");
		user.setName("Shubham");
	}
	
	public void testGetId()
	{
		assertEquals("2013A7PS049G", user.getId());
	}
	public void testGetName()
	{
		assertEquals("Shubham", user.getName());
	}	
	
}
