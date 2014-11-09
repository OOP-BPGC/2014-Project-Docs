package messmanagement;

import java.util.HashSet;

public class Mess {
	private MessName name;
	private MessManager mgr;
	private FacultyCoordinator fc;
	private HashSet<MessWorker> workers;
	private HashSet<Student> students;
	
	public Mess(MessName name) { this.name = name; }
}
