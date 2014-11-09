import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MenuItemTest extends TestCase
{
	private MenuItem mi;
	private MockControl mockmi;
	
	protected void setUp()
	{
		mockmi = MockControl.createControl(MenuItem.class);
		mi = (MenuItem) mockmi.getMock();
	}
	
	public void testMenuItemMock()
	{
		mi.getName();
		mockmi.setReturnValue("name");
		
		mi.setName(EasyMock.isA(String.class));
		mockmi.setReturnValue(true);
		
		mi.saveMenuItem();
		mockmi.setReturnValue(true);
		
		mi.deleteMenuItem();
		mockmi.setReturnValue(true);
		
		mockmi.replay();
		
		assertTrue(mi.setName("name"));
		assertTrue(mi.saveMenuItem());
		assertTrue(mi.deleteMenuItem());
		assertEquals(mi.getName(),"name");
	}
}