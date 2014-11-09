import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.easymock.MockControl;

public class StockSupplierTest extends TestCase{
	private StockSupplier mockStockSupplier;
	private MockControl mockStockSupplier_control;
	
	protected void setUp(){
		mockStockSupplier_control = MockControl.createControl(StockSupplier.class);
		mockStockSupplier = (StockSupplier) mockStockSupplier_control.getMock();
	}
	
	public void testStockSupplierMock() {
		mockStockSupplier.takeOrder();
		mockStockSupplier_control.setReturnValue(true);
		
		mockStockSupplier.supplyStock();
		mockStockSupplier_control.setReturnValue(true);
		
		mockStockSupplier.getName();
		mockStockSupplier_control.setReturnValue("Sumathi");
		
		mockStockSupplier.setName(EasyMock.isA(String.class));
		mockStockSupplier_control.setReturnValue(true);
		
		mockStockSupplier.getMob();
		mockStockSupplier_control.setReturnValue("9444444444");
		
		mockStockSupplier.setMob(EasyMock.isA(String.class));
		mockStockSupplier_control.setReturnValue(true);
		
		mockStockSupplier_control.replay();
				
		assertTrue(mockStockSupplier.takeOrder());
		assertTrue(mockStockSupplier.supplyStock());
		assertTrue(mockStockSupplier.setName("Sumathi"));
		assertTrue(mockStockSupplier.setMob("9879875465"));
		assertEquals("Sumathi",mockStockSupplier.getName());
		assertEquals("9444444444",mockStockSupplier.getMob());
		
	}
}

