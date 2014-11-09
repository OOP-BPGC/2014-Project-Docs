package oop.project.nirmanApp;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Event
{
	protected String nameOfEvent;
	protected ArrayList<Activity> listOfActivities = new ArrayList<Activity>();
	protected Date startDate;
	
	public class Activity	//has to be public
	{
		private String name;
		private Date onDate;
		private Time startTime;
	}
	
	public boolean schedulActivity(String name,Date start,Date end)
	{
		//check dates and decide return value
		return true;
	}
	
}
