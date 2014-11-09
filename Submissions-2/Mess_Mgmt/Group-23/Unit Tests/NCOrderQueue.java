public interface NCOrderQueue
{
	public NCOrder[] order;
	
	public void addOrder(int ID);
	public void removeOrder(int ID);
	public NCOrderQueue();
}