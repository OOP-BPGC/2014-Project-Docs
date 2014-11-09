import java.awt.event.ActionEvent;

import org.easymock.EasyMock;

import junit.framework.TestCase;


public class MockConnectToDBTest extends TestCase {
//@Before
	private ConnectToDB testconnecttoDB  = null;
	ConnectToDBInter mockconnect = EasyMock.createStrictMock(ConnectToDBInter.class);
	
	
	public void setUp() throws Exception {

	mockconnect.connect("Priyya");
	EasyMock.expectLastCall();
	EasyMock.replay(mockconnect);
	EasyMock.verify(mockconnect);
}
	
}