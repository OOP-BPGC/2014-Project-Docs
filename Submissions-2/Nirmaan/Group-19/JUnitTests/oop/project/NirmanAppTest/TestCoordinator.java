package oop.project.NirmanAppTest;

import java.sql.Time;
import java.util.Date;

import oop.project.nirmanApp.*;

import junit.framework.*;

public class TestCoordinator extends TestCase 
{
	public TestCoordinator(String name)
	{
		super(name);
	}
	
	
	private Coordinator codi;
	private Event existingEvent;
	private Event nonExistingEvent;
	private Feed f1;//exists
	private Date dummyDate;
	private Date endDummy;
	private Time t2;
	
	
	public void testLogin()
	{
		assertTrue(codi.login("userNameOfCoordinator","password"));
		assertFalse(codi.login("otherUser","wrongPassword"));
	}
	
	public void testLogout()
	{
		assertTrue(codi.logout());	
									//WHEN IT CAN GIVE FALSE??
	}
	
	public void testPomoteEvent()
	{
		//assertTrue(codi.promoteEvent(existingEvent));
		assertTrue(codi.promoteEvent(existingEvent));
		assertFalse(codi.promoteEvent(nonExistingEvent));
	}
	//DO WE NEED TO TEST THIS ???
	public void testSearch()
	{
		
	}
	
	public void testSubscribeToFeed()
	{
		assertTrue(codi.subscribeToFeed(f1));
		assertFalse(codi.subscribeToFeed(f1));	//subsribing again
	}
	
	public void testPostFeed()
	{
		assertTrue(codi.postFeed("this is new feed"));
													//when can it give false???
	}
	
	//CAN'T TEST METHODS WITH VOID AS RETURN TYPE ?????
	public void testScheduleEvent()
	{
		assertTrue(codi.scheduleEvent("Event name XYZ", dummyDate,endDummy, "AnyWhere"));
						//WHEN FALSE?????
	}
	
	
	public void testScheduleMeeting()
	{
		assertTrue(codi.scheduleMeeting(dummyDate, t2,t2, "B dome"));
		//assertFalse(codi.scheduleMeeting(d, t, venue));
	}
	
	
}
