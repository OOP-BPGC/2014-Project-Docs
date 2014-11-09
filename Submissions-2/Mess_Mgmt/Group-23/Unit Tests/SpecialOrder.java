enum Status
{
	APPROVED, DECLINED, PENDING
}

public interface SpecialOrder
{
	public int orderID;
	public String bookingDate;
	public String orderDate;
	public String mealPreferences;
	public int numPersons;
	public Status approvalStatus;
	
	public SpecialOrder();
	public void setOrderID(int i);
	public void setBookingDate(String s);
	public void setOrderDate(String s);
	public void setMealPreferences(String s);
	public void setNumPersons(int n);
	public void setApprovalStatus(Status s);
	public int getOrderID();
	public String getOrderDate();
	public String getBookingDate();
	public String getMealPreferences();
	public int getNumPersons()
	public Status getApprovalStatus();
	public SpecialOrder();
	public void submit();
}