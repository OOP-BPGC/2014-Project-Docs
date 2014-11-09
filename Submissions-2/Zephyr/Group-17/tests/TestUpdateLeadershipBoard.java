import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;


public class TestUpdateLeadershipBoard {

	@Test
	public void test() 
	{
		
		Convener C = new Convener("1");			
		//makes a new Convener object to test the functions
		try
		{
			c.updateLeadershipBoard("Event1","1","2","3");			
			//a test sample to check the working of the function
			fail("Correct");										
			//if no exception occurs it prints the message
		}
		catch(FileNotFoundException e)
		{
			e.getMessage();
		}
		catch(Exception e)
		{
			System.out.println("Wrong Team Name given");			
			//If the name of the given team is wrong according to the list of registered teams, this exception is caught
		}
	}

}
