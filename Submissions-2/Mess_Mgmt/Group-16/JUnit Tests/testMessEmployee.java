

import junit.framework.*;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class testMessEmployee extends TestCase{
	
	private MessEmployee employee;
	private MessCustomer student;
	private BitsDatabase data;
	public void setUp() throws Exception {
		employee = createNiceMock(MessEmployee.class);
		student = createNiceMock(MessCustomer.class);
		data = createNiceMock(BitsDatabase.class);
		}
	
	public void testDoEmployeeAuth(){
		
		expect(employee.DoEmployeeAuth("username", "truepwd")).andReturn(true);
		expect(employee.DoEmployeeAuth("username", "falsepwd")).andReturn(false);
		replay(employee);
		
		assertEquals(true, employee.DoEmployeeAuth("username", "truepwd"));
		assertEquals(false, employee.DoEmployeeAuth("username", "falsepwd"));
		verify(employee);
		
	}
	
	public void testsetMenu(){
		int day,time;
		try{
			employee.setMenu(0,0,null);
	}
		catch (Exception e){
			
		}
		employee.setMenu(3, 3, "new_menu");
	}
	
	public void testGetMenu(){
		
		expect(employee.getMenu(7, 1)).andReturn("Sunday Breakfast Menu:-");
		expect(employee.getMenu(2, 2)).andReturn("Tuesday Lunch Menu:-");
		expect(employee.getMenu(4, 3)).andReturn("Thursday Dinner Menu:-");
		replay(employee);
		
		assertEquals("Sunday Breakfast Menu:-",employee.getMenu(7, 1));
		assertEquals("Tuesday Lunch Menu:-",employee.getMenu(2, 2));
		assertEquals("Thursday Dinner Menu:-",employee.getMenu(4, 3));
		verify(employee);
		
		}
	
	public void testgetShift(){
		
		expect(employee.getShift(employee)).andReturn("mwf morning");
		replay(employee);
		
		assertEquals("mwf morning", employee.getShift(employee));
		verify(employee);
		
	}
	
	public void testsetShift(){
		try{
			employee.setShift(null,null);
	
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		
	}
	
	public void testgetStudentList(){
		
		expect(employee.getStudentList()).andReturn(data);
		replay(employee);
		
		assertEquals(data, employee.getStudentList());
		verify(employee);
		
	}
	
	public void testgetMessworkerList(){

		expect(employee.getMessworkerList()).andReturn(data);
		replay(employee);
		
		assertEquals(data, employee.getMessworkerList());
		verify(employee);
		
	}
	
	public void testgetFeedback(){
		
		expect(employee.getFeedback()).andReturn("Feedback is .....");
		replay(employee);
		
		assertEquals("Feedback is .....", employee.getFeedback());
		verify(employee);
		
	}
	
	public void testupdateFoodstock(){
		
		try{
			employee.updateFoodstock(0,null);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		
		
	}

	public void testgetFoodstock(){
		
		expect(employee.getFoodstock()).andReturn("Foodstock is .....");
		replay(employee);
		
		assertEquals("Foodstock is .....", employee.getFoodstock());
		verify(employee);
		
	}
	
	public void testapproveLeave(){
		
		expect(employee.approveLeave()).andReturn(true);
		replay(employee);
		
		assertEquals(true, employee.approveLeave());
		verify(employee);
		
	}
	
	public void testchangeShift(){
		
		expect(employee.changeShift(employee)).andReturn(true);
		replay(employee);
		
		assertEquals(true, employee.changeShift(employee));
		verify(employee);
		
	}
	
	public void testupdateStudentDatabse(){
		
		try{
			employee.updateStudentDatabse(null,false);
		
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
	
		
}
	
	public void testupdateEmployeedatabase(){
		
		try{
			employee.updateEmployeedatabase(null,false);
		}
		catch(Exception e){
			fail("Exception should not have occured");
		}
		
	}

}
