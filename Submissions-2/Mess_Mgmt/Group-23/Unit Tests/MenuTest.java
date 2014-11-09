import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class MenuTest extends TestCase
{
	private Menu mu;
	private MockControl mockmu;
	
	protected void setUp()
	{
		mockmu = MockControl.createControl(Menu.class);
		mu = (Menu) mockmu.getMock();
	}
	
	public void testMenuMock()
	{
		mu.displayMessMenu();
		mockmu.setReturnValue(true);
		
		mu.displayNCMenu();
		mockmu.setReturnValue(true);
		
		mu.updateMenu();
		mockmu.setReturnValue(true);
		
		mu.addMessItem(EasyMock.isA(MenuItem.class));
		mockmu.setReturnValue(true);
		
		mu.removeMessItem(EasyMock.isA(MenuItem.class));
		mockmu.setReturnValue(true);
		
		mu.addNCItem(EasyMock.isA(NCMenuItem.class));
		mockmu.setReturnValue(true);
		
		mu.removeNCItem(EasyMock.isA(NCMenuItem.class));
		mockmu.setReturnValue(true);
		
		mockmu.replay()
		
		assertTrue(mu.displayMessMenu());
		assertTrue(mu.displayNCMenu());
		assertTrue(mu.updateMenu());
		assertTrue(mu.addMessItem(new MenuItem));
		assertTrue(mu.removeMessItem(new MenuItem));
		assertTrue(mu.addNCItem(new NCMenuItem));
		assertTrue(mu.removeNCItem(new NCMenuItem));
	}
}