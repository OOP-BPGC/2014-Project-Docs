/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.TestCase;
import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sreejith
 */
public class UtilityTest extends TestCase{
    
    public UtilityTest(String method) {
        super(method);
    }
    
       
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deserialize method, of class Utility.
     */
    @Test
    public void testDeserialize() {
        System.out.println("deserialize");
        String name = "People.ser";
        Member newmemb= new Member("sasi","098765432","sassy","newkid",Designation.GENERAL);
        Member newmemb2= new Member("sasimon","09898765432","notsassy","notanewone",Designation.GENERAL);
        ArrayList<Member> Lis= new ArrayList<Member>();
        Lis.add(newmemb);
        Lis.add(newmemb2);
        Utility.serialize(Lis, name);
        ArrayList<Member> result = (ArrayList<Member>)Utility.deserialize(name);
        
            assertTrue("the list got decoded",result.size()==Lis.size());
                           
                // TODO review the generated test code and remove the default call to fail.
        System.out.println("the List was successfully decoded");
    }

    /**
     * Test of serialize method, of class Utility.
     */
    @Test
    public void testSerialize() {
        System.out.println("serialize");
        String name = "People.ser";
        Member newmemb= new Member("sasi","098765432","bodhgai","high",Designation.PRESIDENT);
         Member newmemb2= new Member("sasimon","09898765432","hahaha",":\"",Designation.PRHEAD);
        ArrayList<Member> result= new ArrayList<Member>();
        result.add(newmemb);
        result.add(newmemb2);
        Utility.serialize(result, name);
        ArrayList<Member> Lis = (ArrayList<Member>)Utility.deserialize(name);
        
        assertTrue("the list got serialised",result.size()==Lis.size());
        
        
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("the List was successfully coded");
    }
    
}
