package nirmaanam;

import static org.junit.Assert.*;
import java.sql.*;
import static org.easymock.EasyMock.*;

class TestEvent extends TestCase{
	
	public void setUp(){
	}
	
	public void tearDown(){
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
		
		Event event= new Event("testEvent","description",new Volunteer("head","headId",2012));
		event.setId(1);
		
		Activity[] eList = event.getActivityList();
		assertEquals("getActivityList failed - getId", eList[0].getId(), 123);
		assertEquals("getActivityList failed - getHeadId", eList[0].getHead().getId(), 456);
	}
	
	
	public void testGetNoticeList(){
		
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
	//	expect(RSMock.getInt("eventId")).andReturn(456);
		expect(RSMock.getString("message")).andReturn("testNotice");
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Event event= new Event("testEvent","description",new Volunteer("head","headId",2012));
		event.setId(1);
		
		Notice[] nList = event.getNoticeList();
		assertEquals("getNoticeList failed - getId", nList[0].getId(), 123);
	}
	
	public void testGetUpdates(){
		
		ResultSet RSMock = createNiceMock(ResultSet.class);
		
		expect(RSMock.getInt("id")).andReturn(123);
	//	expect(RSMock.getInt("eventId")).andReturn(456);
		expect(RSMock.getString("message")).andReturn("testUpdate");
		expect(RSMock.getInt("timeStamp")).andReturn(123456);
		
		replay(RSMock);
		Database.setMock( RSMock );
		
		Event event= new Event("testEvent","description",new Volunteer("head","headId",2012));
		event.setId(1);
		
		EventUpdate[] uList = event.getUpdates();
		assertEquals("getUpdates failed - getId", uList[0].getId(), 123);
	}
	
}