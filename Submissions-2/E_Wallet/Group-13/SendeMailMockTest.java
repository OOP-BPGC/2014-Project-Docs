import org.easymock.EasyMock;

import junit.framework.TestCase;


public class SendeMailMockTest extends TestCase {
//@Before
	private SendeMail testmail  = null;
	MailInter mockmail = EasyMock.createStrictMock(MailInter.class);

	
	boolean fetch = mockmail.sendeMail("Priyya","Rutuja","OOP_Project");
	public void setUp() throws Exception {
	EasyMock.expect(mockmail.sendeMail("Priyya","Rutuja","OOP_Project"));
	EasyMock.replay(mockmail);
	EasyMock.verify(mockmail);
}
	
	//@Test
	public final void test() {
		assertTrue(mockmail.sendeMail("Priyya","Rutuja","OOP_Project"));
	}
}
