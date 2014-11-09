import java.io.FileNotFoundException;
import junit.framework.*;


public class testreviewHostelVideo extends TestCase
{	public static void main(String args[])
{
	try
	{	reviewreviewHostelVideo();	
    	assertTrue(true);
	}
	catch(FileNotFoundException e)
	{
		fail("No TShirt Found exception should not occur");
	}
	}

}
