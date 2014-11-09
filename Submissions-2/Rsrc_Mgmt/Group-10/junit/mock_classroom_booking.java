package javaapplication2;

public class mock_classroom_booking 
{           String Strt_time=null;
		    String End_time=null;
		     private String room_no=null;
		     private String purpose;
		    
		   
		    public void setR_no(String room){
		       this.room_no=room;
		    }
		  
		    
		    public String getR_no(){
		        return this.room_no;
		    }
		   
		    
		    
		    
		     public void setS_time(String time){
		       this.Strt_time=time;
		    }
		    
		     public void setE_time(String time){
		       this.End_time=time;
		    }
		     
		      public String getS_time(){
		        return this.Strt_time;
		    }
		    public String getE_time(){
		        return this.End_time;
		    }
		    public void set_purpose(String purpose)
		    {
		 	   this.purpose=purpose;
		    }
		    public String get_purpose()
		    {
		 	   return this.purpose;
		    }


}
