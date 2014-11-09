import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class LeaveTest extends TestCase
{
	private Leave lv;
	private MockControl mocklv;
	
	protected void setUp()
	{
		mocklv = MockControl.createControl(Leave.class);
		lv = (Leave) mocklv.getMock();
	}
	
	public void testLeaveMock()
	{
		lv.getStartDate();
		mocklv.setReturnValue("1/1/1");
		
		lv.getEndDate();
		mocklv.setReturnValue("1/1/1");
		
		lv.setStartDate(EasyMock.isA(String.class));
		mocklv.setReturnValue(true);
		
		lv.setEndDate(EasyMock.isA(String.class));
		mocklv.setReturnValue(true);
		
		lv.validate();
		mocklv.setReturnValue(true);
		
		lv.submit();
		mocklv.setReturnValue(true);
		
		mocklv.replay()
		
		assertTrue(lv.setStartDate("1/1/1"));
		assertTrue(lv.setEndDate("1/1/1"));
		assertTrue(lv.submit());
		assertTrue(lv.validate());
		assertEquals(lv.getStartDate(),"1/1/1");
		assertEquals(lv.getEndDate(),"1/1/1");
	}
}