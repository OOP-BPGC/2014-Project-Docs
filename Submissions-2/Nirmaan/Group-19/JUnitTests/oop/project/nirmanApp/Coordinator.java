package oop.project.nirmanApp;

import java.sql.Time;
import java.util.Date;

public class Coordinator extends Student
{
	private String password;
	private String userName;
	
	public boolean login(String user,String pass)	
	{
		return false;
	}
	
	public boolean logout()
	{
		return true;
	}
	
	public boolean promoteEvent(Event e)
	{
		/*
		 * if event doesnt exist return false or already promoted maybe
		 * else:
		 */
		return true;
	}
	
	public String search(String s)
	{
		return "searchResult";
	}

	public boolean subscribeToFeed(Feed f)
	{
		//false if already subscribed
		return true;
	}
	
	public boolean postFeed(String msg)
	{
		return true;
	}
	
	public void openEvent(Event e1)
	{
		
	}
	
	public void closeEvent(Event e2)
	{
		
	}

	public boolean scheduleEvent(String name, Date startd,Date endD, String venue)
	{
		//set date and venue to the Event with given name
		//if name doesn't exist create new Event with this name
		return true;
	}
	
	
	public boolean scheduleMeeting(Date d,Time t,Time endT,String venue)
	{//create new Meeting ?????
		//false when ????/
		return true;
	}
	
}

