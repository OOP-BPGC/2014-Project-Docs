import java.util.*;

public class Transaction {
	private int billAmount;
	private Date startTime=new Date();
	private Date endTime=new Date();
	private boolean result;
	private boolean pinVerificationStatus;
	
	public Transaction(int billAmount){
		this.billAmount=billAmount;
	}
	
	public void enterAmount(){
		
	}
	public boolean checkBalance(int billAmount){
		return true;
	}
	public void enterPIN(){
		//Uses Database class to verify
		
	}
	
	public int printAmount(){
		System.out.println(billAmount);
		return billAmount;
	}
}

