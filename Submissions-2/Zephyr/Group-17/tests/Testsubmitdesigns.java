import junit.framework.TestCase;


public class submitdesignsTest extends TestCase {

	submitdesigns sd = new submitdesigns();
	
	public void testsubmitdesign(){
		try{
			sd.submit("filename.txt");
			assertTrue(true);
		}catch(Exception e){
			assertFalse(true);
		}
	}
	public void testsubmitdesignwrong(){
		try{
			sd.submit("wrongfilename.txt");
			assertTrue(false);
		}catch(filedoesntexistexception e){
			assertFalse(false);
		}
	}
}
