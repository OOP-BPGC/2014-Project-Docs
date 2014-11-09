import junit.framework.TestCase;


public class submitResultstest extends TestCase {

	submitEventScores sd = new submitEventScores();
	//tests for right file
	public void testsubmitEventScores(){
		try{
			sd.submit("filename.txt");
			assertTrue(true);
		}catch(Exception e){
			assertFalse(true);
		}
	} 
	//tests for wrong file
	public void testsubmitEventScoreswrong(){
		try{
			sd.submit("wrongfilename.txt");
			assertTrue(false);
		}catch(filedoesntexistexception e){
			assertFalse(false);
		}
	}
}
