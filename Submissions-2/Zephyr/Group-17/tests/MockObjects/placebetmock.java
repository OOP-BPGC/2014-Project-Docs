
import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;

public class TestPlaceBets extends TestCase {
	public TestPlaceBets(String name)
	{
		super(name);
	}
	public void testPlaceBets()
	{
		//creates a new HostelRepresentative object given that username, password is known already.
		HostelRepresentative hr=new HostelRepresentative("username","password");
		
		MockEvent me=new MockEvent();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2014, Calendar.NOVEMBER, 6); 
		Date date = cal.getTime();
		
		/*This variable is used to store the boolean value returned by the placeBets method
		 * which specifies whether the bet is placed on the particular event passed.
		 * The function return true if the bet is successfully placed and false otherwise.
		 */
		boolean status;
		
		//creates a new event using Event class
		Event event1=new Event("event1",date);
		
		//To store the event in the database and hr is made to participate in the event
		me.addingEventToDatabase("event1", date,hr);
		
		//Because date of the event has passed, the HostelRepresentative should not be able to place a bet.
		status=hr.placeBets(event1);
		if(status==true)
			fail("Shouldn't have been able to place the bet");
		else
			assertTrue(true);
		
		cal.set(2014, Calendar.DECEMBER,1);
		date=cal.getTime();
		
		//To make a new event and store in the database and hr is made to participate in the event.
		Event event2=new Event("event2",date);
		me.addingEventToDatabase("event2", date,hr);
		
		//Since date of the event is yet to come, the HostelRepresentative should be able to place a bet.
		status=hr.placeBets(event2);
		if(status==false)
			fail("Should have been able to place the bet");
		else
			assertTrue(true);
		
		//Since bet has been already placed above, the following should give an error message.
		status=hr.placeBets(event2);
		if(status==false)
			assertTrue(true);
		else
			fail("Should have given an error message since bet has already been placed");
		
		//Here we are only creating an event, without adding it in the database.
		Event event3=new Event("event3",date);
		
		//Should give an error message as there is no such event stored in the database.
		status=hr.placeBets(event3);
		if(status==true)
			fail("should have given an error message,since event is not in database");
		else
			assertTrue(true);
		 
		//Event is created and stored in the database, but the hostel represented by the hr is not participating in that event
		Event event4=new Event("event4",date);
		me.addingEventToDatabase("event4",date);
		
		//Should give an error message since the hostel is not participating
		status=hr.placeBets(event4);
		if(status==true)
			fail("Should have failed, since hostel is not participating in the event");
		if(status==false)
			assertTrue(true);
	}
}
class MockEvent
{
	/*function where event is created and stored in the database.
	 * and the hostel participation in the event is set to true by the EventHead.
	 */
	public void addingEventToDatabase(String name,Date date,HostelRepresentative hr)
	{
		EventHaed eventHead=new EventHead("username","password");
		eventHead.addEvent(name,date);
		eventHead.setParticipation(hr,name,true);
	}
	
	//function where event is created and stored in the database.
	public void addingEventToDatabase(String name,Date date)
	{
		EventHaed eventHead=new EventHead("username","password");
		eventHead.addEvent(name,date);
	}
}
