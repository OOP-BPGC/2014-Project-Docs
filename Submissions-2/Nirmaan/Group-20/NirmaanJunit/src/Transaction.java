
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sreejith
 */

public class Transaction implements Serializable{
    private String userName;
    private String reason;
    private double amount;
    private static Funds funds;
    private boolean approved;
    Transaction(String userName,String reason,double amount)
    {
        this.userName=userName;// while creating a transaction in the main code pass the member object's 
        this.reason=reason;//user name attribute there.to avoid repetition of code
        this.amount=amount;
        this.approved=false;
            }
    
    private void modifyFunds(double Funddeduct)
    {      boolean done ;
        if(this.approved)
        {done = funds.deduct(Funddeduct);
            if(!done)
            {
                System.out.println("Transaction cant modify funds disapproving it");
                this.approved=false;
            }
        }
    }
    public static void setFunds(Funds f)
    {
        funds=f;
    }
    public static void ApproveTransaction(Transaction E)
    {
        E.approved=true;
        E.modifyFunds(E.getamount());
            }
    public String getuser()
    {
        return this.userName;
    }
    public String getreason()
    {
        return this.reason;
        
    }
    public double getamount()
    {
        return this.amount;
        
    }
    public boolean checkapproval()
    {
        return this.approved;
    }
    
    public boolean registertransaction()
    {
        ArrayList<Transaction> trans = new ArrayList<Transaction>();
        trans = (ArrayList<Transaction>)Utility.deserialize("/home/sreejith/NetBeansProjects/NirmaanJunit/src/Transactions.ser");
        if(trans==null)
        {
        trans=new ArrayList<Transaction>();
        }
        try
        {trans.add(this);
        Utility.serialize(trans, "/home/sreejith/NetBeansProjects/NirmaanJunit/src/Transactions.ser");
        return true;
        }
        catch(Exception E)
        {
            return false;
                    }
        
        
        }
    public static ArrayList<Transaction> getPending()
    {
        ArrayList<Transaction> trans = new ArrayList<Transaction>();
        trans = (ArrayList<Transaction>)Utility.deserialize("/home/sreejith/NetBeansProjects/NirmaanJunit/src/Transactions.ser");
        ArrayList<Transaction> temp = new ArrayList<Transaction>();
       try
       {for(Transaction tr : trans)
        {   if(!tr.checkapproval())
            {
                temp.add(tr);
            }
                
        }
       }
       catch ( NullPointerException e)
       {
           
       }
        return temp;
        
        
    }
    
    
    
    
    
}
