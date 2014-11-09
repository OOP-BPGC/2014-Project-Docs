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
public class ParticipantTest extends TestCase {
	
	public ParticipantInt p1 = null;
	public UpdateProfileFrameInt p2 = null;
	public DashboardInt p3 = null;
	public Participant pp = null;
	public EventRegInt p4 = null;
	
	
	@Before
	  public void setUp() throws Exception {
	    // NiceMocks return default values for
	    // unimplemented methods
	    p1 = createNiceMock(ParticipantInt.class);
	    p2 = createNiceMock(UpdateProfileFrameInt.class);
	    p3 = createNiceMock(DashboardInt.class);
	    p4 = createNiceMock(EventRegInt.class);
	    pp = new Participant();
	  }
	
	@Test
	  public void testLogOut() {
	    // Setting up the expected value of the method
	    expect(p1.logOut()).andReturn(p1);
	    
	    replay(p1);

	    
	    
	    try {
	      p1.logOut();
	  //    fail("Exception did not occur");
	    } catch (RuntimeException e) {
	    	System.out.println(e.toString());
	    }
	 
	    verify(p1);
	  }
	 
		
	

public void testDisplayDash(){
		replay(p3);
		verify(p3);
	}
	public void testDoEventRegPar(){
		replay(p4);
		verify(p4);
	}
	
	public void testUpdateProfile(){
		replay(p2);
		verify(p2);
	}

}
