import junit.framework.TestCase;

//Tests registerTeam() function
public class downloadTest extends TestCase {
	public downloadTest()
	{
		super();
	}
	
	// Checks if a name field is not filled
	public void noName()
	{
		HostelRepresentative hr = new HostelRepresentative("Name", "AH-7");
		try {
			hr.registerTeam("TMNT","Mike", "Raph", "Leo", "");
			System.out.println("Should have raised NameNotFilledException");
		}
		catch(NameNotFilledException e) {
			assertTrue(true);
		}		
	}
	
	// Checks if the Team Name is not filled
	public void noTeamName()
	{
		HostelRepresentative hr = new HostelRepresentative("Name", "AH-7");
		try {
			hr.registerTeam("","Mike", "Raph", "Leo", "Don");
			System.out.println("Should have raised TeamNameNotFilledException");
		}
		catch(TeamNameNotFilledException e) {
			assertTrue(true);
		}		
	}
	
	// Affirmative test case
	public void everythingWorks()
	{
		HostelRepresentative hr = new HostelRepresentative("Name", "AH-7");
		boolean valid = hr.registerTeam("TMNT", "Mike", "Raph", "Leo", "Don");
		assertTrue(valid);
	}
}
