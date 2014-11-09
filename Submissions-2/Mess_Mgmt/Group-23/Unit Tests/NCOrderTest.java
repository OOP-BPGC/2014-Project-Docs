import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class NCOrderTest extends TestCase
{
	private NCOrder nc;
	private MockControl mocknc;
	
	protected void setUp()
	{
		mocknc = MockControl.createControl(NCOrder.class);
		nc = (NCOrder) mocknc.getMock();
	}
	
	public void testNCOrderMock()
	{
		nc.getOrderID();
		mocknc.setReturnValue(123);
		
		nc.getOrderTime();
		mocknc.setReturnValue("00:00:00");
		
		nc.getOrderStatus();
		mocknc.setReturnValue(Status.READY);
		
		nc.getOrderPrice();
		mocknc.setReturnValue(123);
		
		nc.setOrderID(EasyMock.isA(Integer.class));
		mocknc.setReturnValue(true);
		
		nc.setOrderTime(EasyMock.isA(String.class));
		mocknc.setReturnValue(true);
		
		nc.setOrderStatus(EasyMock.isA(Status.enum));
		mocknc.setReturnValue(true);
		
		nc.addItem(EasyMock.isA(NCMenuItem.class),EasyMock.isA(Integer.class));
		mocknc.setReturnValue(true);
		
		nc.removeItem(EasyMock.isA(NCMenuItem.class),EasyMock.isA(Integer.class));
		mocknc.setReturnValue(true);
		
		mocknc.replay();
		
		assertTrue(nc.setOrderID(123));
		assertTrue(nc.setOrderStatus(123));
		assertTrue(nc.setOrderTime("00:00:00"));
		assertTrue(nc.addItem(new NCMenuItem,1);
		assertTrue(nc.removeItem(new NCMenuItem,1);
		assertEquals(nc.getOrderTime(),"00:00:00");
		assertEquals(nc.getOrderStatus(),Status.READY);
		assertEquals(nc.getOrderID(),123);
		assertEquals(nc.getOrderPrice(),123);
	}
}