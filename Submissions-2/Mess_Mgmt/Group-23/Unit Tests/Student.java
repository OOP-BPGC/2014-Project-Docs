public interface Student
{
	public char messOption;
	public String ID;
	public String name;
	public String email;
	public boolean hasEaten;
	public String password;
	
	
	public String getID();
	public String getName();
	public String getEmail();
	public char getMessOption();
	public boolean getHasEaten();
	public String getPassword();
	
	public void setMessOption(char c);
	public void setID(String s);
	public void setName(String s);
	public void sendFeedback(Feedback f);
	public void setEmail(String s);
	public void setHasEaten(boolean b);
	public void setPassword(String s);
	
	public void login();
	public void logout();
	public void resetPassword();
	public void applyForLeave();
	public void bookSpecialMeal();
	public void bookNCMeal();
	public void viewOrderStatus();
	public void viewMenu();
	public void viewSpecialOrderStatus();

	public Student();
}