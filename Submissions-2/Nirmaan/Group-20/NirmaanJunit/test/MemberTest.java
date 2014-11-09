/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Take care to change the username 3rd parameter or member initialisation everytime you run the test
//otherwise test will fail
//method- testRegister()
import java.util.ArrayList;
import junit.framework.TestCase;
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
public class MemberTest extends TestCase{
    
    public MemberTest(String method) {
    super(method);
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of register method, of class Member.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("register");
        Member newmemb= new Member("justawesome","9876543210","justawesome21","seriouslydude?",Designation.GENERAL);
        Member instance = newmemb;
        boolean expResult = true;
        boolean result = instance.register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The Member was registered");
        Member newmemb2= new Member("justawesome","9876543210","justawesome21","seriouslydude?",Designation.PRESIDENT);
        instance = newmemb2;
        expResult = false;
        result = instance.register();
        assertEquals(result,expResult);
        System.out.println("same username existed hence not entered");
        Member Newmember;
        Newmember = new Member("Presinew","9876543432" ,"pres21 ", "IamPresident21",Designation.PRESIDENT);
        instance = Newmember;
        expResult = true;
        result = instance.register();
        assertEquals(result,expResult);
        System.out.println("President also created");
    }
    /**
     * Test of authenticate method, of class Member.
     */
    
    public void testAuthenticate() {
        System.out.println("authenticate");
        Member newmemb2= new Member("testguy1","9876543210","t1guy","seriouslydude?",Designation.PRESIDENT);
        try{
            newmemb2.register();
        }
        catch(Exception E)
                {
                    E.printStackTrace();
                }
        String userName = "t1guy";
        String password = "seriouslydude?";
        boolean expResult = true;
        boolean result = Member.authenticate(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("user authenticated succesfully");
         userName = "t1guy";
         password = "somethingelse";
         expResult = false;
         result = Member.authenticate(userName, password);
         assertEquals(expResult, result);
         System.out.println("password wrong user not authenticated");
         
         
        
    }

    /**
     * Test of search method, of class Member.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Member newmemb2= new Member("testguy1","9876543210","t1guy","seriouslydude?",Designation.PRESIDENT);
        Member newmemb3 = new Member("test2guy2","987656477540","t1guy2","ysosirius",Designation.PRESIDENT);
        try{
            newmemb2.register();
            newmemb3.register();
        }
        catch(Exception E)
                {
                    E.printStackTrace();
                }
        String query = "t1";
        ArrayList<Member> expResult = new ArrayList<Member>();
        expResult.add(newmemb2);expResult.add(newmemb3);
        
        ArrayList<Member> result = Member.search(query);
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("the above members had this name");
    }

    
    
}
