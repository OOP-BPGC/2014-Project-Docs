package zephyr;

import junit.framework.TestCase;

public class UserTest extends TestCase{
	User obj;
	public void setUp(){
		obj=new User();
	}
	public void testconvenerlogin(){
		obj.setconvenerpassword("abc");
		assertTrue(obj.convenerLogin("abc"));
	}
	public void testconvenerlogin2(){
		obj.setconvenerpassword("abcd");
		assertFalse(obj.convenerLogin("abc"));
	}
}
