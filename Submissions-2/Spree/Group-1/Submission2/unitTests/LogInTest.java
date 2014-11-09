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
public class LogInTest extends TestCase {
	
	public AdminInt ad1 = null;
	public ConvenorProfileFrameInt ad2 = null;
	public ParticipantProfileFrameInt ad3 = null;
	public EMProfileFrameInt ad4 = null;
	public LogIn ll = null;
	public boolean True, False;
	
	@Before
	  public void setUp() throws Exception {
	    // NiceMocks return default values for
	    // unimplemented methods
	    ad1 = createNiceMock(AdminInt.class);
	    ad2 = createNiceMock(ConvenorProfileFrameInt.class);
	    ad3 = createNiceMock(ParticipantProfileFrameInt.class);
	    ad4 = createNiceMock(EMProfileFrameInt.class);
	    
	    ll = new LogIn();
	  }
	
	@Test
	  public void testvalidateLogIn() {
	    // Setting up the expected value of the method
	    expect(ad1.validateLogIn(Argument.ORGANISERLOGIN, Password.P1)).andReturn(True).times(2);
	    expect(ad1.validateLogIn(Argument.EMLOGIN,Password.P2)).andReturn(True);
	    // Setup is finished need to activate the mock
	    replay(ad1);

	    ll.setvalidateLogIn(ad1);
	    
	    
	    try {
	      ll.validateLogIn();
	   //   fail("Exception did not occur");
	    } catch (RuntimeException e) {
	    	System.out.println(e.toString());
	    }
	    ll.setArgument(Argument.ORGANISERLOGIN);
	    ll.setPassword(Password.P1);
	    assertEquals(True, ll.validateLogIn());
	    assertEquals(True, ll.validateLogIn());
	    ll.setArgument(Argument.EMLOGIN);
	    ll.setPassword(Password.P2);
	    assertEquals(True, ll.validateLogIn());
	  //  ad.setValidateData(Argument.SURFER);
	    verify(ad1);
	  }
	
	 public void testCheckUser(){
		 replay(ad2);
		 verify(ad2);
		 replay(ad3);
		 verify(ad3);
		 replay(ad4);
		 verify(ad4);
	 }


}
