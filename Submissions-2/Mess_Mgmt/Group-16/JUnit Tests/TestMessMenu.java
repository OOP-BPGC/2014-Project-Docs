import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;


public class TestMessMenu extends TestCase {
private MessMenu MockMessMenu;
	protected void setUp() throws Exception {
	MockMessMenu=createNiceMock(MessMenu.class);	
	}
	public void testGetMenu(){
	expect(MockMessMenu.getMenu(1, 3)).andReturn("Monday Dinner Menu:-");
	replay(MockMessMenu);
	assertEquals("Monday Dinner Menu:-",MockMessMenu.getMenu(1, 3));	
	}
	public void testSetMenu(){
		MockMessMenu.setMenu(1, 3, "Monday Dinner Menu:-");
	}

}
