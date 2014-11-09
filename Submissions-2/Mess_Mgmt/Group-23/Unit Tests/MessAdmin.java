public interface MessAdmin
{
	public String name;
	public String emailID;
	public String password;
	
	public void resetSystem();
	public void viewFeedback();
	public void swipe(Student s);
	public void changePassword(String s);
	public void editMenu();
	public void updateMenu();
	public void logout();
	public void login();
	public void approveSpecialOrder(SpecialOrder s);
	public void viewNCOrders();
	public void setPassword(String s);
	public void setEmail(String s);
	public String getEmail();
	public String getName();
	public void setName(String s);
	public void getPassword();
	public void setEmail(String s);
	public MessAdmin()
}
	