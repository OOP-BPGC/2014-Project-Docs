import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;


public class TestMess extends TestCase {
private Mess MockMess;
	protected void setUp() throws Exception {
		MockMess=createNiceMock(Mess.class);
	}
	public void testSetMenu(){
		MockMess.setMenu(1, 3);
	}
	public void testGetMenu(){
		expect(MockMess.getMenu(1, 3)).andReturn("Monday Dinner Menu:-");
		replay(MockMess);
		assertEquals("Monday Dinner Menu:-",MockMess.getMenu(1, 3));
	}
	/*public void testGetInfo(){
		expect(MockMess.getInfo(messemployee)).andReturn("Employee Name:-\n Employee ID:-");
		replay(MockMess);
		assertEquals("Employee Name:-\n Employee ID:-",MockMess.getInfo(messemployee));
	}*/
	
}
