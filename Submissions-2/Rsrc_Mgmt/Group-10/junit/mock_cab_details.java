package javaapplication2;

public class mock_cab_details 
{  
	private String place;
	String Strt_time=null;
    String End_time=null;
    private int No_of_Passengers;
   
   
   
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
  
   public void set_place(String place){
       this.place=place;
   }
     
   public String get_place(){
      return this.place;
    
   }
   public void set_No_of_passengers(int No_of_Passengers){
	       this.No_of_Passengers=No_of_Passengers;
	       }
   public int get_No_of_Passengers()
   {
	   return this.No_of_Passengers;
   }
  
} 
