

public interface MessEmployee {

	String username=null;
	String info=null;
	
	public boolean DoEmployeeAuth(String username, String password);
	
	public void setMenu(int day, int time, String menu);
	
	public String getMenu(int day, int time);
	
	public String getShift(MessEmployee messworker);
	
	public void setShift(MessEmployee messworker, String newshift);
	
	public BitsDatabase getStudentList();
	
	public BitsDatabase getMessworkerList();
	
	public String getFeedback();
	
	public void updateFoodstock(int amount, String item);
	
	public String getFoodstock();
	
	public boolean approveLeave();
	
	public boolean changeShift(MessEmployee messworker);
	
	public boolean updateStudentDatabse(MessCustomer student, boolean addorremove);
	
	public boolean updateEmployeedatabase(MessEmployee messemployee, boolean addorremove);
}
