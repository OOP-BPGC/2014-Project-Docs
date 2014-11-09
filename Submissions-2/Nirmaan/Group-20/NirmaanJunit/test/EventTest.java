/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sreejith
 */
public class EventTest {
    private static Event instance;
    
    public EventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Setup");
        Date start= new Date(2014, 11, 21);
        Date end = new Date(2014,11,29);
        instance = new Event("testevent", start,end);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ApproveEvent method, of class Event.
     */
    @Test
    public void testApproveEvent() {
        System.out.println("ApproveEvent");
        Event.ApproveEvent(instance);
        boolean result=instance.checkapproval();
        boolean expected=true;
        assertEquals(result,expected);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEvent method, of class Event.
     */
    @Test
    public void testGetEvent() {
        
        String expResult = "testevent";
        String result = instance.getEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getStartDate method, of class Event.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        
        Date expResult = new Date(2014, 11, 21);
        
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO reviewt the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEndDate method, of class Event.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        
        Date expResult = new Date(2014, 11, 29);
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkapproval method, of class Event.
     */
    @Test
    public void testCheckapproval() {
        System.out.println("checkapproval");
       Event.ApproveEvent(instance);
        boolean expResult = true;
        boolean result = instance.checkapproval();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerEvent method, of class Event.
     */
    @Test
    public void testRegisterEvent() {
        System.out.println("registerEvent");
        Date sd = new Date(2014, 1, 28);
        Date ed = new Date(2014,2,1);
        Event e = new Event("testevent3",sd,ed);
        boolean expResult = true;
        boolean result = e.registerEvent();
        assertTrue(result);
        sd = new Date(2014, 1, 27);
         ed = new Date(2014,1,31);
        e = new Event("testevent2",sd,ed);
        expResult=false;
        result=e.registerEvent();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPending method, of class Event.
     */
    @Test
    public void testGetPending() {
        System.out.println("getPending");
        Date sd = new Date(2014, 7, 28);
        Date ed = new Date(2014,8,1);
        Event e = new Event("testevent3",sd,ed);
        e.registerEvent();
        ArrayList<Event> result = Event.getPending();
        System.out.println(result.size());
        
         boolean found1=false;
                      for(Event tar : result)
        {   
            if(tar.getEvent().equals(e.getEvent()))
              found1=true;
            
        }
         
        assertEquals(found1, true);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
