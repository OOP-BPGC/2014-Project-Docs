import java.io.FileNotFoundException;

import junit.framework.*;
public class testenquire extends TestCase 
{	
	public static void main(String args[])
	{ try
	 {  enquire();
 		fail("it works");
	 }
	 catch(FileNotFoundException e)
	 {
 		assertTrue(false);
	 }
	}
}