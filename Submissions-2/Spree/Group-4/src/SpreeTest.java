import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.Before;
import junit.framework.*;
import java.io.*;
import org.junit.*;
import net.sourceforge.jwebunit.*;

public class SpreeTest extends TestCase
{
	participant mockParticipant;
	bank mockBank;
	convener mockConvener;
	eventManager mockEM;
	Sport mockSport;
	inventory mockInventory;
	private WebTester tester;
	
	@Before
	public void setup()throws Exception
	{
		mockParticipant=EasyMock.createNiceMock(participant.class);
		mockBank=EasyMock.createNiceMock(bank.class);
		mockConvener=EasyMock.createNiceMock(convener.class);
		mockEM=EasyMock.createNiceMock(eventManager.class);
		mockSport=EasyMock.createNiceMock(Sport.class);
		mockInventory=EasyMock.createNiceMock(inventory.class);
		tester = new WebTester();
        tester.setBaseUrl("http://localhost:8080/test");
	}
	
	@Test
	public void participantTest()throws IOException
	{
		String s;
		EasyMock.expect(mockParticipant.cancelReg(mockSport)).andReturn("Cancelled");
		EasyMock.expect(mockParticipant.payment()).andReturn("Paid");
		EasyMock.replay(mockParticipant);
		
		s=mockParticipant.cancelReg(mockSport);
		assertEquals("Cancelled",s);
		s=mockParticipant.payment();
		assertEquals("Paid",s);
		
	}
	public void checkSlotsTest()throws IOException
	{
		int v;
		EasyMock.expect(mockSport.checkSlots()).andReturn(1);
		EasyMock.expect(mockSport.checkSlots()).andReturn(0);
		EasyMock.replay(mockSport);
		
		v=mockSport.checkSlots();
		assertEquals(1,v);
		v=mockSport.checkSlots();
		assertEquals(0,v);
		
	}
	public void EMTest()throws Exception
	{
		String s;
		EasyMock.expect(mockEM.scheduleUpdate(mockSport)).andReturn("Updated Schedule");
		EasyMock.expect(mockEM.scoreUpdate(mockSport)).andReturn("Updated Score");
		EasyMock.expect(mockEM.standings(mockSport)).andReturn("Updated Standings");
		mockEM.getFromInventory(mockSport);
		EasyMock.expectLastCall();
		mockEM.returnToInventory(mockSport);
		EasyMock.expectLastCall();
		
		EasyMock.replay(mockEM);
		s=mockEM.scheduleUpdate(mockSport);
		assertEquals("Updated Schedule",s);
		s=mockEM.scoreUpdate(mockSport);
		assertEquals("Updated Score",s);
		s=mockEM.standings(mockSport);
		assertEquals("Updated Standings",s);
	}
	
	@Test
	public void testLogin()
	{
		tester.beginAt("home.xhtml"); //Open the browser on http://localhost:8080/test/home.xhtml
        tester.clickLink("login");
        tester.assertTitleEquals("Login");
        tester.setTextField("username", "test");
        tester.setTextField("password", "test123");
        tester.submit();
        tester.assertTitleEquals("Welcome, test!");
    }
	
	public void bankTest()throws Exception
	{
		String b;
		//EasyMock.expect(mockConvener.processReimbursement(4355)).andReturn("Approved");
		EasyMock.expect(mockBank.reimbursement(4355)).andReturn("Returned");
		
		EasyMock.replay(mockBank);
		
		b=mockBank.reimbursement(4355);
		assertEquals(b,"Returned");
	
	}
	
	@Ignore
	public void registerCheck()throws Exception
	{
		boolean val;
		EasyMock.expect(mockParticipant.checkEmail("abc@gef.com")).andReturn(true);
		EasyMock.expect(mockParticipant.checkEmail("abcdef")).andReturn(true);
		
		EasyMock.replay(mockParticipant);
		val=mockParticipant.checkEmail("abc@gef.com");
		assertTrue(val);
		val=mockParticipant.checkEmail("abcdef");
		assertTrue(val);
		
		assertNotNull(mockParticipant.name);
		assertNotNull(mockParticipant.college);
		assertNotNull(mockParticipant.mobile);
		assertNotNull(mockParticipant.id);
		assertNotNull(mockParticipant.username);
	}
	
}
