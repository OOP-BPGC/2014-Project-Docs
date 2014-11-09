package oop.project.nirmanApp;

public class Member extends Student 
{
	private String password;
	private String userName;
	
	//methods
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
	
	public boolean subscribeToFeed(Feed f)
	{
		//false if already subscribed
		return true;
	}
	
	public boolean enrollForEvent(Event.Activity a)
	{
		return true;
	}

}
