import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class testBitsDatabase extends TestCase {
	private BitsDatabase mockBitsDatabase;
	private MessCustomer obj;
	private MessEmployee obj1;
	public void setUp() throws Exception {
		mockBitsDatabase = createNiceMock(BitsDatabase.class);
		}
	public void testGetMess(){
		expect(mockBitsDatabase.getMess()).andReturn("A Mess");
		replay(mockBitsDatabase);
		assertEquals("A Mess",mockBitsDatabase.getMess());
		verify(mockBitsDatabase);
	}
	public void testSetMess(){
		try{
			mockBitsDatabase.setMess(null);
	
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		mockBitsDatabase.setMess("C Mess");
		}
	
	public void testGetStudentList(){
		expect(mockBitsDatabase.getStudentList()).andReturn("John");
		replay(mockBitsDatabase);
		assertEquals("John",mockBitsDatabase.getStudentList());
		verify(mockBitsDatabase);
	}
	
	public void testGetMessEmployeeList(){
		expect(mockBitsDatabase.getMessEmployeeList()).andReturn("Rajesh");
		replay(mockBitsDatabase);
		assertEquals("Rajesh",mockBitsDatabase.getMessEmployeeList());
		verify(mockBitsDatabase);
	}
	public void testAddStudent(){
		try{
			mockBitsDatabase.addStudent(null);

		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		}
	public void testAddEmployee(){
		try{
			mockBitsDatabase.addEmployee(null);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		}
	public void testRemoveStudent(){
		try{
			mockBitsDatabase.removeStudent(null);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		}
	public void testRemoveEmployee(){
		try{
			mockBitsDatabase.removeEmployee(null);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		}
	
}

