import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class FeedbackTest extends TestCase
{
	private Feedback fb;
	private MockControl mockfb;
	
	protected void setUp()
	{
		mockfb = MockControl.createControl(Feedback.class);
		fb = (Feedback) mockfb.getMock();
	}
	
	public void testFeedbackMock()
	{
		fb.getDescription();
		mockfb.setReturnValue("DS");
		
		fb.setDescription(EasyMock.isA(String.class));
		mockfb.setReturnValue(true);
		
		fb.getTitle();
		mockfb.setReturnValue("Title");
		
		fb.setTitle(EasyMock.isA(String.class));
		mockfb.setReturnValue(true);
		
		fb.getStatus();
		mockfb.setReturnValue("Status");
		
		fb.setStatus(EasyMock.isA(String.class));
		mockfb.setReturnValue(true);
		
		fb.submit();
		mockfb.setReturnValue(true);
		
		mockfb.replay();
		
		assertTrue(fb.setDescription("DS"));
		assertTrue(fb.setTitle("Title"));
		assertTrue(fb.setStatus("Status"));
		assertTrue(fb.submit());
		
		assertEquals(fb.getDescription(),"DS");
		assertEquals(fb.getTitle(),"Title");
		assertEquals(fb.getStatus(),"Status");
	}
}