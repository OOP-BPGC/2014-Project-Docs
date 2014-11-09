package javaapplication2;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class ClassroomBookingTest
{

		mock_classroom_booking  m=new mock_classroom_booking();
		    
		   @Test public void testgetR_no()
		    {	String test_Rno="C401";
		  	  m.setR_no(test_Rno);
		        assertEquals(m.getR_no(),test_Rno);
		    
		    }
		   
		   @Test public void testgetS_time()
		     {
		    	 String test_Stime="12:00";
			  	 m.setS_time(test_Stime);
			     assertEquals(m.getS_time(),test_Stime); 
		     }
		   @Test public void  testgetE_time()
		     {
		    	String test_Etime="1:00";
		  	    m.setE_time(test_Etime);
		        assertEquals(m.getE_time(),test_Etime); 
		     }
           
		   @Test public void testget_purpose()
		   {
			   String purpose="abc";
			   m.set_purpose(purpose);
			   assertEquals(m.get_purpose(),purpose);
		   }

          
 }


