import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class SpecialOrderTest extends TestCase
{
	private SpecialOrder sc;
	private MockControl mocksc;
	
	protected void setUp()
	{
		mocksc = MockControl.createControl(SpecialOrder.class);
		sc = (SpecialOrder) mocksc.getMock();
	}
	
	public void testSpecialOrderMock()
	{
		sc.setOrderID(EasyMock.isA(Integer.class));
		mocksc.setReturnValue(true);
		
		sc.setBookingDate(EasyMock.isA(String.class));
		mocksc.setReturnValue(true);
		
		sc.setOrderDate(EasyMock.isA(String.class));
		mocksc.setReturnValue(true);
		
		sc.setMealPreferences(EasyMock.isA(String.class));
		mocksc.setReturnValue(true);
		
		sc.setNumPersons(EasyMock.isA(Integer.class));
		mocksc.setReturnValue(true);
		
		sc.setApprovalStatus(EasyMock.isA(Status.enum));
		mocksc.setReturnValue(true);
		
		sc.getOrderID();
		mocksc.setReturnValue(123);
		
		sc.getBookingDate();
		mocksc.setReturnValue("1/1/1");
		
		sc.getOrderDate();
		mocksc.setReturnValue("1/1/1");
		
		sc.getMealPreferences();
		mocksc.setReturnValue("MP");
		
		sc.getNumpersons();
		mocksc.setReturnValue(123);
		
		sc.getApprovalStatus();
		mocksc.setReturnValue(Status.APPROVED);
		
		mocksc.replay()
		
		assertTrue(sc.setOrderID(123));
		assertTrue(sc.setOrderDate("1/1/1/"));
		assertTrue(sc.setBookingDate("1/1/1/"));
		assertTrue(sc.setMealPreferences("MP"));
		assertTrue(sc.setNumPersons(123));
		assertTrue(sc.setApprovalStatus(Status.APPROVED));
		
		assertEquals(sc.getOrderID(),123);
		assertEquals(sc.getOrderDate(),"1/1/1");
		assertEquals(sc.getBookingDate(),"1/1/1");
		assertEquals(sc.getMealPreferences(),"MP");
		assertEquals(sc.getNumPersons(),123);
		assertEquals(sc.getOrderStatus(),Status.APPROVED);
	}
}	
	