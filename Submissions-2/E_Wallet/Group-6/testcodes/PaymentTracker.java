import java.util.*;

public class PaymentTracker {
	
	String inp;
	int balance;
	
	public PaymentTracker(){
		this.balance = 0;
	}
	
	public String createLog(Date start, Date end, int amount,int balance){
		
			String s =	"Date: "+ start + "Date :" + end + "Amount spent: " + amount + "Balance in a/c: " + balance ;
			return s;
	
	}
	public void displayTransactionDetails(){
		
	}
	public void initateTransaction(){
	
	}
	public void initiateRecharge(){
	
	}
}

