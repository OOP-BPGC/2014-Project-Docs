import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;


public class TestFinalizeVenue {

	@Test
	public void test() {
		
		EventHead e = new EventHead("2");			
		//make a new EventHead object to test its functions
		
		try
		{
		e.FinalizeVenue("@@");	
		//testing a sample input of venue
		fail("Implemented");	
		//If the venue is available then it prints out this message
		}
		catch(FileNotFoundException e)
		{
			e.getMessage();									
			//If the file to upload these details are not available then this exceptions is caught
		}
		catch(Exception e)
		{
			System.out.println("Venue already Booked");		
			//If venue is already booked, then this message is printed.
		}
	}

}
