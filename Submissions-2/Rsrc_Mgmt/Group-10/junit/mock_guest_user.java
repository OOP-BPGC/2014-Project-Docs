package javaapplication2;

public class mock_guest_user{
	
		  private static String auth="no";
		  private String Name=null;
		  private String Contact_no=null;
	    public void setname(String name){
	        this.Name=name;
	    }
	    public void setnumber(String number){
	        this.Contact_no=number;
	    }
	    public String getname(){
	        return this.Name;
	    }
	    public String getContact_no(){
	        return this.Contact_no;
	    }

}
