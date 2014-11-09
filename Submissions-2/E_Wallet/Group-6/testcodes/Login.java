
public class Login {
	
	String studentID;
	String pass;
	boolean result;

	public Login(String studentID){
		this.studentID=studentID;
	}
	
	public String printstudentID (){
		System.out.println(this.studentID);
		
		return studentID;
	}
	
	public boolean login(){
		//Take student ID as input
		//Take password as input
		//Verify from the functions in database class
		return result;
	}
	
	
}

