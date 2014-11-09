package nirmaanam;

import java.sql.*;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

class TestTimeTable extends TestCase{
		TimeTable tt;
		TimeSlot s1,s2,s3;
	public void setUp(){
		TimeTable tt = new TimeTable();
		s1 = new TimeSlot(Day.MON, 10);
		s2 = new TimeSlot(Day.MON, 14);
		s3 = new TimeSlot(Day.TUE, 15);
		
		tt.busySlots.add(s1);
		tt.busySlots.add(s2);
	}
	
	public void tearDown(){
	}
	
	
	public void testAddSlot(){
		tt.addSlot(s3);
		assertEquals("addSlot failed", tt.busySlots.get(tt.busySlots.size()-1), s3);
	}
	
	public void testForClash(){
		assertEquals("Should have clashed", tt.checkForClash(Day.MON,9,11), true);
		assertEquals("Should not have clashed", tt.checkForClash(Day.MON,20,21), false);
	}
	
	public void testRemoveSlot(){
		TimeTable tt1 = new TimeTable();
		tt1.busySlots.add(s1);
		assertEquals("testRemoveSlot - add failed", tt1.busySlots.get(0), s1);
		tt1.busySlots.remove(s1);
		assertEquals("testRemoveSlot - remove failed", tt1.busySlots.size(), 0);
	}
}