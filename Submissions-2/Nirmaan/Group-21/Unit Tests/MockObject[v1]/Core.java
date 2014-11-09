
public interface Core extends Person{
	public boolean createMember(Person p);
	public boolean modifyMember(Person old, Person p);
	public boolean createEvent(String s);
	public boolean createAndBroadcastMessage();
}
