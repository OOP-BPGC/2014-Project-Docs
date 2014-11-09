package spree;
import junit.framework.TestCase;

import org.easymock.*;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class ConvenorTest extends TestCase {

	public AccData ai=null;
	
	private Convenor convenor=null;
	
	
	  public void setUp() throws Exception {
		  
		    ai = createNiceMock(AccData.class);
		    convenor = new Convenor();
		    
		  }
	  
		 public void testViewDepartmentDetails(String DeptName){
			 replay(ai);
			 verify(ai);
			 
		 }
		public void testViewFinances(){
			
			
			convenor.setAccData(ai);
			 
			 expect(ai.viewFinances()).andReturn(0);
			 replay(ai);
			 assertEquals(convenor.viewFinances(),0);
			 
			 verify(ai);
		 }

}
