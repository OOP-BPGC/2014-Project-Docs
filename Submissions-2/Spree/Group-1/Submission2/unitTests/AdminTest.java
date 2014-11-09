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
public class AdminTest extends TestCase {
	

	
	public LogInInt ai1 = null;
	
	private Admin ad = null;
	
	public AccDataInt ai2 = null;
	public boolean True, False;
	@Before
	  public void setUp() throws Exception {
	    // NiceMocks return default values for
	    // unimplemented methods
	    ai1 = createNiceMock(LogInInt.class);
	    ai2 = createNiceMock(AccDataInt.class);
	    ad = new Admin();
	  }
	
	 @Test
	  public void testvalidateLogIn() {
	    // Setting up the expected value of the method
	    expect(ai1.validateLogIn(Argument.ORGANISERLOGIN, Password.P1)).andReturn(True).times(2);
	    expect(ai1.validateLogIn(Argument.EMLOGIN,Password.P2)).andReturn(True);
	    // Setup is finished need to activate the mock
	    replay(ai1);

	    ad.setvalidateLogIn(ai1);
	    
	    
	    try {
	      ad.validateLogIn();
	     
	    } catch (RuntimeException e) {
	    	System.out.println(e.toString());
	    }
	    ad.setArgument(Argument.ORGANISERLOGIN);
	    ad.setPassword(Password.P1);
	    assertEquals(True, ad.validateLogIn());
	    assertEquals(True, ad.validateLogIn());
	    ad.setArgument(Argument.EMLOGIN);
	    ad.setPassword(Password.P2);
	    assertEquals(True, ad.validateLogIn());
	  //  ad.setValidateData(Argument.SURFER);
	    verify(ai1);
	  }
	 
		public void testAddData(){
			 replay(ai2);
			 verify(ai2);
		}
		public void testViewData(){
			replay(ai2);
			verify(ai2);
		};
		public void testModifyData(){
			replay(ai2);
			verify(ai2);
		};
		public void testValidateData(){
			replay(ai2);
			verify(ai2);
		};

	

	
}
