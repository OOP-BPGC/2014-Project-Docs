import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
	
public class TestFeedback extends TestCase{
	private Feedback mockFeedback;
	public void setUp() throws Exception {
		mockFeedback = createNiceMock(Feedback.class);
		}
	public void testGiveFeedback(){
		try{
			mockFeedback.giveFeedback(null);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");	
		}
		mockFeedback.giveFeedback("The food should be a bit more spicy");
		}
	public void testGetFeedback(){
		expect(mockFeedback.getFeedback()).andReturn("Lime should be there atleast two days a week");
		replay(mockFeedback);
		assertEquals("Lime should be there atleast two days a week",mockFeedback.getFeedback());
		verify(mockFeedback);
	}
}


