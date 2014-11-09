import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class RequestDatabaseTest {

	@Test
	public void testAdd() 
	{
		RequestDatabase ab=new RequestDatabase();
		Student a=new Student("Adit","1","123");
		Student b=new Student("Rohit","2","1234");
		ArrayList dummy=new ArrayList(Arrays.asList(a,"A201","24-8-2014","1750","for fun"));
		ArrayList dummy2=new ArrayList(Arrays.asList(b,"A201","24-8-2014","1800","for tp"));

		ab.add(a,"A201","24-8-2014","1750","for fun");
		assertEquals(true,ab.requests.contains(dummy));
		assertEquals(false,ab.requests.contains(dummy2));
		
	}

}
