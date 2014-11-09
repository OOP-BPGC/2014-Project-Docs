import static org.junit.Assert.*;

import org.junit.Test;


public class LoginTest {

	@Test
	public void testReturnType() 
	{
		
		Login a=new Login("Aditya","abc");
		Login b=new Login("Aditya","123");
		Login c=new Login("Mohan","abc");
		assertEquals(a.flag,false);
		assertEquals(b.flag,true);		
		assertEquals(c.flag,true);		
		assertEquals(a.uType,null);
		assertEquals(Type.Student,b.ReturnType());		
		assertEquals(Type.CabAdmin,c.ReturnType());		
		

	}

}
