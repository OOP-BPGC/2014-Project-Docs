package zephyr;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import zephyr.Events.venue;

public class EventsTest extends TestCase {
	Events obj;
	Schedule obj1;
	public EventsTest(String n){
		super(n);
	}
	public void setUp(){
		obj=new Events("Futsal");
		obj1=new Schedule();
	}
	public void testgetname(){
		assertEquals("Futsal",obj.getname());
	}
	/*First the fullschedule array of Schedule class is initialised and then setvenuetime method 
	of event class is tested accordingly*/
	public void testsetvenuetime(){
		obj1.fullSchedule[1][2][3]=true;
		int[][] t={{0,1},{1,2},{3,4}};
		assertFalse(obj.setvenuetime(venue.c402, t));
	}
	public void testsetvenuetime2(){
		int[][] t={{0,1},{1,2},{5,6}};
		assertTrue(obj.setvenuetime(venue.c402, t));
		assertEquals(venue.c402,obj.getvenue());
	}
	
	public static Test Suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new EventsTest("testgetname"));
		suite.addTest(new EventsTest("testsetvenuetime"));
		suite.addTest(new EventsTest("testsetvenuetime2"));
		return(suite);
	}
}
