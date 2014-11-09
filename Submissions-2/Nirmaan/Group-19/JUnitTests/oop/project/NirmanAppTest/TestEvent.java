package oop.project.NirmanAppTest;

import java.util.Date;

import oop.project.nirmanApp.*;

import junit.framework.TestCase;

public class TestEvent extends TestCase
{
	public TestEvent(String name)
	{
		super(name);
	}
	private Event e = new Event();
	private Event.Activity a1 = e.new Activity();
	Date sd ;
	Date ed;
	
	
	public void testScheduleActivity()
	{
		assertTrue(e.schedulActivity("activity1", sd, ed));
		assertFalse(e.schedulActivity("activity2", ed, sd));	//ending before start so fail
		
	}
	
	
}
