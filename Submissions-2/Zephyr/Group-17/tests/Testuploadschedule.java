import junit.framework.TestCase;


public class uploadscheduleTest extends TestCase {

	uploadschedule sd = new uploadschedule();
	
	public void testuploadschedule(){
		try{
			sd.submit("filename.txt");
			assertTrue(true);
		}catch(Exception e){
			assertFalse(true);
		}
	}
	public void testuploadschedulewrong(){
		try{
			sd.submit("wrongfilename.txt");
			assertTrue(false);
		}catch(filedoesntexistexception e){
			assertFalse(false);
		}
	}
}
