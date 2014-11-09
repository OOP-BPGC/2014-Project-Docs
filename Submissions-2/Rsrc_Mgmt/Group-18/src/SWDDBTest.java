import static org.junit.Assert.*;

import org.junit.Test;


public class SWDDBTest {

	@Test
	public void testWithdraw() 
	{
		SWDDB a=new SWDDB();
		assertEquals(true,a.withdraw(0, 5));
		assertEquals(false,a.withdraw(1, 30.5));
		
	}

}
