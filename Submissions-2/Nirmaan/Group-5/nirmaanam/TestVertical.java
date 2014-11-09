package nirmaanam;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import java.sql.*;

class TestVertical extends TestCase{
	
	public void setUp(){
	}
	
	public void tearDown(){
	}
	
	public void testGetVolunteerList(){
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
		expect(RSMock.getString("name")).andReturn("abc");
		expect(RSMock.getString("bitsId")).andReturn("YYYYBBBBIIIC");
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Vertical vertical = new Vertical("testActivity","description",new Volunteer("head","headId",2012));
		vertical.setId(1);
		
		Volunteer[] vList = vertical.getVolunteerList();
		assertEquals("getVolunteerList failed", vList[0].getId(), 123);
	}
	
	public void testGetEventList(){
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
		expect(RSMock.getInt("head")).andReturn(456);
		expect(RSMock.getString("name")).andReturn("testEvent");
		expect(RSMock.getString("description")).andReturn("testDescription");
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Vertical vertical = new Vertical("testActivity","description",new Volunteer("head","headId",2012));
		vertical.setId(1);
		
		Event[] eList = vertical.getEventList();
		assertEquals("getEventList failed", eList[0].getId(), 123);
		assertEquals("getEventList failed", eList[0].getHead().getId(), 456);
	}
	
	
	public void testGetActivityList(){
		
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
		expect(RSMock.getInt("head")).andReturn(456);
		expect(RSMock.getString("name")).andReturn("testActivity");
		expect(RSMock.getString("description")).andReturn("testDescription");
		expect(RSMock.getString("report")).andReturn("testReport");
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Vertical vertical = new Vertical("testActivity","description",new Volunteer("head","headId",2012));
		vertical.setId(1);
		
		Activity[] eList = vertical.getActivityList();
		assertEquals("getActivityList failed - getId", eList[0].getId(), 123);
		assertEquals("getActivityList failed - getHeadId", eList[0].getHead().getId(), 456);
		
	}
	
}
	
	