package messmanagement;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	private String mName;
	private String ID;
	
	public Student(String name, String id) {
		mName = name;
		ID = id;
	}
	
	public String getId() { 
		return ID;
	}
	
	// Adds leave for all dates in list
	public void applyForLeave(ArrayList<Date> d) {}
	
	public void setMessOption(MessName m) {}
}
