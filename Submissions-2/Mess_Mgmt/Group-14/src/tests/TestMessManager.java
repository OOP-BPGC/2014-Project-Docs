package tests;

import messmanagement.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMessManager {
	private MessManager m;
	private DatabaseManager db;
	private final String WORKERS_TABLE = "t";
	
	public void setUp() throws Exception {
		m = new MessManager();
		db = new DatabaseManager(WORKERS_TABLE);
	}
	
	@Test
	public void testAddRemoveWorker() {
		final String testName = "john";
		assertEquals(null, db.getFromDatabase(testName));
		MessWorker mw = new MessWorker(testName);
		m.addWorker(mw);
		assertEquals(testName, db.getFromDatabase(testName));
		m.removeWorker(mw);
		assertEquals(null, db.getFromDatabase(testName));
	}
}
