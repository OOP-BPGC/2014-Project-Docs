import java.io.FileNotFoundException;
import junit.framework.*;

public class testreviewTShirts extends TestCase
{	public static void main(String args[])
	{
	try
	{	reviewTShirts();	
	    assertTrue(true);
	}
    catch(FileNotFoundException e)
    {
    	fail("No TShirt Found exception should not occur");
    }
	}

}
