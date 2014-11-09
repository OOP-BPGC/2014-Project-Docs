package RM;

import junit.framework.TestCase;

public class DetailsTest extends TestCase {
	Details details;
	protected void setUp() throws Exception {
		details = new Details();
		details.setUserID("121");
		details.setDestination("Bogmalo");
	}
	
	public void testSetTime(){
		String time = "123asa";
		try{
			details.setStartTime(time);
			fail();
		}catch(InvalidTimeException e){
			
		}finally{
			time = "12:50";
			try {
				details.setStartTime(time);
			} catch (InvalidTimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				assertEquals("12:50",details.getStartTime());
			}
		}
	}
	
}
