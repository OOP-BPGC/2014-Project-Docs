import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class NCOrderQueueTest extends TestCase
{
	private NCOrderQueue ncq;
	private MockControl mockncq;
	
	protected void setUp()
	{
		mockncq = MockControl.createControl(NCOrderQueue.class);
		ncq = (NCOrderQueue) mockncq.getMock();
	}
	
	public void testNCOrderQueueMock()
	{
		ncq.addOrder(EasyMock.isA(Integer.class));
		mockncq.setReturnValue(true);
		
		ncq.removeOrder(EasyMock.isA(Integer.class));
		mockncq.setReturnValue(true);
		
		mockncq.replay();
		
		assertTrue(ncq.addOrder(123));
		assertTrue(ncq.removeOrder(123));
	}
}