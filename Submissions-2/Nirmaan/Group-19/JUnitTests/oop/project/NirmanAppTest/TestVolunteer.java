package oop.project.NirmanAppTest;

import oop.project.nirmanApp.*;
import junit.framework.TestCase;

public class TestVolunteer extends TestCase 
{
	public TestVolunteer(String name) {
		super(name);
	}
	
	private Volunteer v1;
	private Event e;
	private Event ne;	//non existing event or not scheduled yet
	private Event.Activity a1;
	private Event.Activity a2;
	
	public void testLogin()
	{
		assertTrue(v1.login("CorrectuserNamer","password"));
		assertFalse(v1.login("InvalidUser","wrongPassword"));
	}
	
	public void testLogout()
	{
		assertTrue(v1.logout());	
									//WHEN IT CAN GIVE FALSE??
	}
	
	public void testPomoteEvent()
	{
		assertTrue(v1.promoteEvent(e));
		assertFalse(v1.promoteEvent(ne));
	}
	
	public void testEnrollForEvent()
	{
		assertTrue(v1.enrollForEvent(a1));
		assertFalse(v1.enrollForEvent(a2));
	}
	
}
