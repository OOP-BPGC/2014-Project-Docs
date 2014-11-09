import static org.junit.Assert.*; 
import org.junit.Test ; 
import java.sql.* ;
import java.lang.* ; 
public class TestStudent
{
	@Test
		public void testgetCompetitions()
		{
			boolean thrown1 = false;
			boolean thrown2 = false;
			Statement stmt = null ;
			int ID = 1234;																	//random value assigned for checking
			Student p = new Student(ID,"Sumit","Khaitan","CH5","sumuthegreat");								//creating an instance of student with ID = 1234
			Competition cmp = new Competition ( "football", "lt-3", 2015, 7, 17, ID, 0);

                        //array of competitions student is participating in
			ArrayList<Competition> al1= new ArrayList<Competition>();
                        al1.add(cmp)
			try
			{
				Class.forName("org.sqlite.JDBC");
				Connection c = DriverManager.getConnection("jdbc:sqlite:common");
				stmt = c.createStatement() ; 
				
                                assertTrue(al1.equals(p.getCompeititons(stmt)))
                                
			}
			catch(SQLException ex)
			{
				System.out.println("SQL Exception thrown") ;
				thrown1 = true ;
			}
			catch(ClassNotFoundException ex)
			{
				System.out.println("ClassNotFoundException thrown") ; 
				thrown2 = true ; 
			}
			assertEquals(thrown1,false) ; 
			assertEquals(thrown2,false) ; 
		}
} 
