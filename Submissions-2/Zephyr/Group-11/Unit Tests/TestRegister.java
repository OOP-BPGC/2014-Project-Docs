import static org.junit.Assert.assertEquals ; 
import org.junit.Test ; 
import java.sql.* ;
import java.lang.* ; 
public class TesRegister
{
    @Test
    public void testccheckIfAlreadyPresent()
    {
        Student s1 = new Student(123, "Jayanti","J","AH1", "inkypinky");  //creating an object of student			
        Register r = new Register(s1);
			
        s1.registerStudent();	//manually registering the student in the db;	
        assertTrue(r.checkIfAlreadyPresent());	//checking the method
    }
} 
