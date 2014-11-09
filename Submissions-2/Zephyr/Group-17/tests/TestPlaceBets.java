package testcases;

import junit.framework.TestCase;

public class TestPlaceBets extends TestCase {
	public TestPlaceBets(String str)
	{
		super(str);
	}
	public void testPlaceBets()
	{
		/* The function placeBets() displays the list of events in which the HR has participated in
		 * the user then selects from the list of events and selects 'Submit' to submit the betting details.
		 * Any error like file not found error will be handled by the function itself.
		 * This test case is used to catch any other exceptions thrown and print it.
		 */
		try
		{
			//creating a new object of HostelRepresentive with a known user name and password
			HostelRepresentative hr=new HostelRepresentative("user name","password");
			hr.placeBets(); 
		}catch(Exception e)
		{
			fail(e.getMessage());	
		}
		assertTrue(true);
	}
}
