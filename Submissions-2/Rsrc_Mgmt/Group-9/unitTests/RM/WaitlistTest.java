package RM;

import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

public class WaitlistTest extends TestCase {
	private static WaitlistTestMethods test;
	
	protected void setUp() {
		WaitlistTest.test = createNiceMock(WaitlistTestMethods.class);
		
	}

	public void testIsClash(){
	
		expect(test.isClash(new Booking(), new Booking())).andReturn(false);
		replay();
		
		Waitlist.setUpWaitlistTestMethods(test);
		
		assertEquals(false, Waitlist.isClash(new Booking(), new Booking()));
	}
}
