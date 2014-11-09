import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

public class TestBillingAccount extends TestCase {
	private BillingAccount mockBillingAccount;
	public void setUp()throws Exception {
		mockBillingAccount = createNiceMock(BillingAccount.class);
		}
	public void testGetBalance(){
		expect(mockBillingAccount.getBalance()).andReturn(10000);
		replay(mockBillingAccount);
		assertEquals(10000,mockBillingAccount.getBalance(),0);
		verify(mockBillingAccount);
		}
	public void testAddCredit(int credit){
		mockBillingAccount.AddCredit(15000);
	}
	public void testDebitCredit(int debit){
		mockBillingAccount.AddDebit(10000);
	}
}

