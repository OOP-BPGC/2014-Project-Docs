import static org.junit.Assert.assertEquals ; 
import org.junit.Test ; 
import java.sql.* ;
import java.lang.* ; 
public class TestLogin
{
    @Test
    public void testcheckCredentials()
    {
        Student s1 = new Student(123,"Anurag","R","AH4","password");		//creating an object of student        
        Login l = new Login(s1);			          
        assertTrue(l.checkCredentials());				//checking the method     
     
    }
     
    
} 
