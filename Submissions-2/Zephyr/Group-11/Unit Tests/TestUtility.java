import static org.junit.Assert.assertEquals ; 
import org.junit.Test ; 
import java.sql.* ;
import java.lang.* ; 
public class TestCase
{
	@Test
		public void testLoginCorrect()
		{
			int id = 13018 ; 
			String pass = "yoyo" ; 
			Statement stmt = null ;	
			Utility ut = new Utility() ; 
			boolean thrown1 = false, thrown2 = false, thrown3=false  ; 
			try
			{
				ut.loginCorrect(id, pass, stmt) ;
			}
			catch(NullPointerException ex)
			{
				thrown1 = true ; 
			}
			catch(SQLException ex)
			{
				thrown2 = true;  
			}
			assertEquals(thrown1, true) ; 
			try
			{
				thrown2 = false ; 
				Class.forName("org.sqlite.JDBC");
				Connection c = DriverManager.getConnection("jdbc:sqlite:common");
				stmt = c.createStatement() ; 
				assertEquals(ut.loginCorrect(13019,"yoyo",stmt), true) ; 
				assertEquals(ut.loginCorrect(13019, "yoyoy", stmt), false) ; 
			}
			catch(SQLException ex)
			{
				thrown2 = true ;
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("Exception thrownn...") ; 
				thrown3 = true ; 
			}
			assertEquals(thrown2,false) ; 
			assertEquals(thrown3, false) ; 
		}
} 
