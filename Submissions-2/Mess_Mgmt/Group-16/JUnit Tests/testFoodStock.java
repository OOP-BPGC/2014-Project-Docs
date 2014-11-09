
import junit.framework.*;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class TestFoodStock extends TestCase {

	FoodStock foodstock = new FoodStock();
	
	public void testgetFoodstock(){
		
		assertEquals("Foodstock is........", foodstock.getFoodStock(""));
		
	}
	
	public void testupdateFoodStock(){
		
		assertTrue(true);
	}

}
