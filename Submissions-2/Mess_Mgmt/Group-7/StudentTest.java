
	import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

	public class StudentTest extends TestCase{
		private Student mockStudent;
		private MockControl mockStudent_control;
		
		protected void setUp(){
			mockStudent_control = MockControl.createControl(Student.class);
			mockStudent = (Student) mockStudent_control.getMock();
		}
		
		public void testGuestMock() {
			mockStudent.printBill();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.chooseMess();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.eat();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.checkMenu();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.giveFeedback();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.getDues();
			mockStudent_control.setReturnValue(true);
			
			mockStudent.getName();
			mockStudent_control.setReturnValue("Sumathi");
			
			mockStudent.getMob();
			mockStudent_control.setReturnValue("9444444444");
			
			mockStudent.getID();
			mockStudent_control.setReturnValue("2012B3A7777G");
			
			mockStudent.searchStudent(EasyMock.isA(String.class));
			mockStudent_control.setReturnValue(true);
			
			mockStudent.SWDLogin(EasyMock.isA(String.class),EasyMock.isA(String.class));
			mockStudent_control.setReturnValue(true);
			
			mockStudent_control.replay();
					
			assertTrue(mockStudent.printBill());
			assertTrue(mockStudent.chooseMess());
			assertTrue(mockStudent.eat());
			assertTrue(mockStudent.checkMenu());
			assertTrue(mockStudent.giveFeedback());
			assertTrue(mockStudent.getDues());
			assertTrue(mockStudent.SWDLogin("2012B3A7777G", "AAAA"));
			assertTrue(mockStudent.searchStudent("2012B3A7777G"));
			assertEquals("Sumathi",mockStudent.getName());
			assertEquals("9444444444",mockStudent.getMob());
			assertEquals("2012B3A7777G",mockStudent.getID());
			
		}
	}

