package zephyr;

import junit.framework.TestCase;

public class HostelTest extends TestCase{
	Hostel obj;
	public void setUp(){
		obj=new Hostel();
	}
	public void testgethosteldetails(){
		obj.setpassword(1, "abc");
		Hostel.setHostelname(1, "AH1");
		assertEquals("abc",obj.getHostelDetails(1, 1));
	}
}
