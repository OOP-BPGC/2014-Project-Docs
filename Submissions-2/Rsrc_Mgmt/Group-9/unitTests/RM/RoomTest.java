package RM;

import junit.framework.*;

import static org.easymock.EasyMock.*;



public class RoomTest extends TestCase{
	
	private RoomTestMethods roomTest;
	private Room test;
	
	public void setUp() {
		roomTest = createNiceMock(RoomTestMethods.class);	
		try {
			test = new Room(1);
		} catch (RoomNotAvailableException e) {
			}
	}
	
	public void testIsBooked() {
	
		expect(roomTest.isBooked()).andReturn(true);
		replay(roomTest);
		test.setRoomTestMethods(roomTest);
		try{			
			test.modifyAvailability(false);
			test.isBooked();
			fail();
		}catch(RoomNotAvailableException e){
			assertTrue(true);
		}finally{
			test.modifyAvailability(true);
			try {
				assertTrue(test.isBooked());
			} catch (RoomNotAvailableException e) {				
			}			
		}
	}	
}
