package nirmaanam;

import static org.junit.Assert.*;
import java.sql.*;
import static org.easymock.EasyMock.*;
import nirmaanam.Activity.Availability;


class TestActivity{
	
	public void setUp(){
	}
	
	public void tearDown(){
	}
	
	
	public void testGetAssignees(){
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
		expect(RSMock.getString("name")).andReturn("abc");
		expect(RSMock.getString("bitsId")).andReturn("YYYYBBBBIIIC");
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Activity activity = new Activity("testActivity","description",new Volunteer("head","headId",2012));
		//Setup a new dummy Volunteer
		
		Volunteer[] aList = activity.getAssignees();
		assertEquals("getAssignees failed", aList[0].getId(), 123);
		
	}
	
	public void testAddAttendee(){
		Activity activity = new Activity("testActivity","description",new Volunteer("head","headId",2012));
		//Setup a new dummy Volunteer
		Volunteer invited = new Volunteer("abc","YYYYBBBBIIIC", 2012);
		invited.setId(1);
		
		activity.addAttendee(invited);
		Volunteer[] aList = activity.getAssignees();
		assertEquals("AddAttendee failed", aList[aList.size()-1].getId(), invited.getId());
	}
	
	public void testGetAvailability(){
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("available")).andReturn(1);
		expect(RSMock.getInt("available")).andReturn(2);
		expect(RSMock.getInt("available")).andReturn(0);
		replay(RSMock);
		
		Database.setMock( RSMock );
		
		Activity activity = new Activity("testActivity","description",new Volunteer("head","headId",2012));
		Volunteer v1 = new Volunteer("abc","YYYYBBBBIIIC", 2012);
		v1.setId(1);
		
		assertEquals("Expected 1, Didn\'t get",activity.getAvailability(v1), 1);
		assertEquals("Expected 1, Didn\'t get",activity.getAvailability(v1), 2);
		assertEquals("Expected 1, Didn\'t get",activity.getAvailability(v1), 0);
		
	}
	
	public void testConfirmAvailability(){
			Activity activity = new Activity("testActivity","description",new Volunteer("head","headId",2012));
			//Setup a new dummy Volunteer
			Volunteer v1 = new Volunteer("abc","YYYYBBBBIIIIC", 2012);
			v1.setId(1);
			Volunteer v2 = new Volunteer("pqr","YYYYBBBBIIIIC", 2012);
			v1.setId(2);
			
			Activity activity = new Activity("testActivity","description",new Volunteer("head","headId",2012));
			
			activity.confirmAvailability(v1, Availability.AVAILABLE);
			assertEquals("Confirm availability ( true ) failed ", activity.getAvailability(v1), Availability.AVAILABLE);
			
			activity.confirmAvailability(v2, Availability.UNAVAILABLE);
			assertEquals("Confirm availability ( false ) failed ", activity.getAvailability(v2), Availability.UNAVAILABLE);
	}
}