public interface NCMenuItem extends MenuItem
{
	public int price;
	public boolean availibility;
	
	public int getPrice();
	public void setPrice(int p);
	public boolean getAvailibility();
	public void setAvailibility(boolean b);
	public NCMenuItem();
	public saveNCMenuItem();
	public deleteNCMenuItem();
}