
public interface BitsDatabase {
 public String getMess();
 public void setMess(String mess);
 public String getStudentList();
 public String getMessEmployeeList();
 public String addStudent(MessCustomer Student);
 public String addEmployee(MessEmployee Employee);
 public String removeStudent(MessCustomer Student);
 public String removeEmployee(MessEmployee Employee);
}
