public interface SpecialOrderQueue
{
	public SpecialOrder[] order;
	
	public void addOrder(int ID);
	public void removeOrder(int ID);
	public SpecialOrderQueue();
}