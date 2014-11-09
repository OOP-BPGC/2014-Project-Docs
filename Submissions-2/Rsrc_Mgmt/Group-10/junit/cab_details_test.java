package javaapplication2;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class cab_details_test {

	
	 mock_cab_details  m=new mock_cab_details();
	 @Test
     public void testgetplace()
     {
	   String testplace="xyz";
       m.set_place(testplace);
       assertEquals(m.get_place(),testplace);
     }
	 @Test
     public void testgetE_time()
     {String test_Etime="12:00";
	  m.setE_time(test_Etime);
      assertEquals(m.getE_time(),test_Etime); 
     }
    	
	 @Test
     public void testget_Stime()
     {
	  String test_Stime="12:00";
	  m.setS_time(test_Stime);
      assertEquals(m.getS_time(),test_Stime); 
     }
	 @Test
     public void testget_No_of_Passengers()
     {
	  int test_no=2;
	  m.set_No_of_passengers(test_no);
      assertEquals(m.get_No_of_Passengers(),test_no); 
     }
	 
	 
}
