
public interface MessManager {
	public String getName();
	public boolean setName(String name);
	public String getMob();
	public boolean setMob(String mob);
	public int getBalance();
	public boolean paySalary(Employee e);
	public boolean putOnLeave(Employee e);
	public boolean doTransaction(int m);
}
