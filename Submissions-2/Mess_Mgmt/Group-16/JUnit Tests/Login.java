
	public interface Login {

		//Enum State;
		
		public boolean CustomerAuth(String IDNo, String Password);
		public boolean EmployeeAuth(String Username, String Password);
		public boolean Logout();
		public boolean checkIDcard(String IDNo);
	}