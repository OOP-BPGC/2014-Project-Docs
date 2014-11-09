import junit.framework.TestCase;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;




public class TestMessCustomer extends TestCase {


private MessCustomer MckMessCustomer;
public void setUp(){
MckMessCustomer=createNiceMock(MessCustomer.class);
}
public void testDoCustAuth(){
//A Valid Login	
expect(MckMessCustomer.DoCustAuth("2013a7ps104g", "easytomock")).andReturn(true);	
//An Invalid Login	
expect(MckMessCustomer.DoCustAuth("2013a7ps104g", "wrongpassword")).andReturn(false);
replay(MckMessCustomer);

assertTrue(MckMessCustomer.DoCustAuth("2013a7ps104g", "easytomock"));
assertFalse(MckMessCustomer.DoCustAuth("2013a7ps104g", "wrongpassword"));
verify(MckMessCustomer);
}

public void testGetDues(){
expect(MckMessCustomer.getDues()).andReturn(1711);
replay(MckMessCustomer);
assertEquals(1711,MckMessCustomer.getDues(),0);
verify(MckMessCustomer);
}

public void testGetMenu(){
expect(MckMessCustomer.getMenu(7, 1)).andReturn("Sunday Breakfast Menu:-");
expect(MckMessCustomer.getMenu(2, 2)).andReturn("Tuesday Lunch Menu:-");
expect(MckMessCustomer.getMenu(4, 3)).andReturn("Thursday Dinner Menu:-");
replay(MckMessCustomer);
assertEquals("Sunday Breakfast Menu:-",MckMessCustomer.getMenu(7, 1));
assertEquals("Tuesday Lunch Menu:-",MckMessCustomer.getMenu(2, 2));
assertEquals("Thursday Dinner Menu:-",MckMessCustomer.getMenu(4, 3));
verify(MckMessCustomer);
}

public void testFeedback(){
try{
MckMessCustomer.giveFeedback(null);

}
catch(Exception e){
	fail("Exception should not have occured");
}
MckMessCustomer.giveFeedback("The food should be a bit more spicy");
}

public void testApplyLeave(){
expect(MckMessCustomer.applyLeave(32,10,10)).andThrow(new RuntimeException("StartDate cannot be greater than 31"));
expect(MckMessCustomer.applyLeave(17,13,10)).andThrow(new RuntimeException("Month cannot be greater than 12"));
expect(MckMessCustomer.applyLeave(9, 2, 5)).andReturn(true);
replay(MckMessCustomer);
assertTrue(MckMessCustomer.applyLeave(9, 2, 5));
}

public void testGetMessInfo(){
expect(MckMessCustomer.getMessInfo()).andReturn("MESS DETAILS:-\n Contractor Name:-\n ContactNo:-");
replay(MckMessCustomer);
assertEquals("MESS DETAILS:-\n Contractor Name:-\n ContactNo:-",MckMessCustomer.getMessInfo());
verify(MckMessCustomer);
}
}
