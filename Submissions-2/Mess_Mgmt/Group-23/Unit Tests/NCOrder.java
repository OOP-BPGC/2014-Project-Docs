enum Status
{
	BEING_BUILT, PLACED, READY, DELIVERED
}

public interface NCOrder
{
	public int orderID;
	public String orderTime;
	public Status status;
	public int orderPrice;
	
	public int getOrderID();
	public void setOrderID(int i);
	public void setOrderStatus(Status s);
	public Status getOrderStatus();
	public String getOrderTime();
	public void setOrderTime(String s);
	public NCOrder();
	public int getOrderPrice();
	public void addItem(NCMenuItem i, int quantity);
	public void removeItem(NCMenuItem i, int quantity);
}