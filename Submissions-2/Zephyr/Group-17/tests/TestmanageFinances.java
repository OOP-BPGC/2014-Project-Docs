import junit.framework.*;
import java.io.*;

public class testmanageFinances extends TestCase
{   public static void main(String args[])
	{	FinanceHead f = new FinanceHead;
		boolean result,res;
	    
		result=f.manageFinances();		//assuming 2 vars expenditure,avail_finance
	     if(f.expenditure>f.avail_finance)
	     res=true;
	     else
	     res=false;
	     assertTrue(res=result);
		
		
	}

}
