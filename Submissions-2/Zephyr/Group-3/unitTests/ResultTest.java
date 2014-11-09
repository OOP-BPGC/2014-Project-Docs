package zephyr;

import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

public class ResultTest extends TestCase{
	Events obj1;
	Result obj;
	public void setUp() throws FileNotFoundException, ClassNotFoundException, IOException{
		obj1=new Events("ename");
		//obj=new Result(1,2,3);
		Events.addEventFile(obj1);
		Result.addEventResult("ename", 1, 2, 3);
	}
	public void testviewEventResult() throws FileNotFoundException, ClassNotFoundException, IOException{
		int[] res={1,2,3};
		for(int i=0;i<3;i++)
		{
			assertEquals(res[i],Result.viewEventResult("ename")[i]);
		}
		
	}
}
