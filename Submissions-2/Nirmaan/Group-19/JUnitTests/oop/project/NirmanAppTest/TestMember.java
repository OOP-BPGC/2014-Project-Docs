package oop.project.NirmanAppTest;

import oop.project.nirmanApp.*;
import junit.framework.TestCase;

public class TestMember extends TestCase 
{
	public TestMember(String name) {
		super(name);
	}
	
	private Member m;
	private Event e;
	private Event ne;	//non-existing event or not scheduled yet
	private Event.Activity a1;
	private Event.Activity a2;
	
	public void testLogin()
	{
		assertTrue(m.login("Member","password"));
		assertFalse(m.login("RandomPerson","wrongPassword"));
	}
	
	public void testLogout()
	{
		assertTrue(m.logout());	
									//WHEN IT CAN GIVE FALSE??
	}
	
	public void testPomoteEvent()
	{
		assertTrue(m.promoteEvent(e));
		assertFalse(m.promoteEvent(ne));
	}
	
	public void testEnrollForEvent()
	{
		assertTrue(m.enrollForEvent(a1));
		assertFalse(m.enrollForEvent(a2));
	}
	
}
