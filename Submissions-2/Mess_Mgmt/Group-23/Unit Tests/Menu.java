public interface Menu
{
	public MenuItem[] MenuItems;
	public NCMenuItem[] NCItems;

	public Menu();
	public void displayMessMenu();
	public void displayNCMenu();
	public void updateMenu();
	public void addNCItem(NCMenuItem m);
	public void addMessItem(MenuItem m);
	public void removeNCItem(NCMenuItem m);
	public void removeMessItem(MenuItem m);
}	