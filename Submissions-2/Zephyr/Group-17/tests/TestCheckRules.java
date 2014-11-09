import junit.framework.TestCase;
import java.io.*;

public class TestCheckRules extends TestCase {
	TestCheckRules(String message)
	{
		super(message);
	}
	void TestCaseOne()
	{
		try
		{
			checkRules();
		
		}
		catch (FileNotFoundException f)
		{
			//if the file hasnt been uploaded or is being modified at the moment,an exceotion is thrown
			System.out.println("The rules havent been uploaded yet");					
		}
		
	}
	void TestCaseTwo()
	{
		//if the rules are read, ie. the file opens successfully, a string is returned which declares successful reading
		HostelMember HM=new HostelMember("somename","somehostel");//the constructor takes in the name of the member and the hostel name as parameters
		assertEquals("Rules read successfully",checkRules());
	}
}

