package messmanagement;

public class SwipeIdCard {
	private MessName mMess;
	public SwipeIdCard(MessName m) {mMess = m;}
	
	public boolean onIdCardSwiped(String id) { return false; }
	public boolean checkEaten(String id) { return false; }
	public boolean checkOnLeave(String id) { return false; }
	public boolean checkMessOption(String id) { return false; }
}
