import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class SpecialOrderQueueTest extends TestCase
{
	private SpecialOrderQueue Specialq;
	private MockControl mockSpecialq;
	
	protected void setUp()
	{
		mockSpecialq = MockControl.createControl(SpecialOrderQueue.class);
		Specialq = (SpecialOrderQueue) mockSpecialq.getMock();
	}
	
	public void testSpecialOrderQueueMock()
	{
		Specialq.addOrder(EasyMock.isA(Integer.class));
		mockSpecialq.setReturnValue(true);
		
		Specialq.removeOrder(EasyMock.isA(Integer.class));
		mockSpecialq.setReturnValue(true);
		
		mockSpecialq.replay();
		
		assertTrue(Specialq.addOrder(123));
		assertTrue(Specialq.removeOrder(123));
	}
}