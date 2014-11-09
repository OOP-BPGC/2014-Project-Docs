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
public class EventManagerTest extends TestCase {

	EventManager eh;
	InventoryInt i;
	SubmitResultFrameInt s;
	SendMessageFrameInt s1;
	SchedulingInt s2;
	SubmitScheduleFrameInt s3;
	DashboardFrameInt d;
	ViewResultsFrameInt v;
	
	public void setUp(){
		   i  = createNiceMock(InventoryInt.class);
		   s=createNiceMock(SubmitResultFrameInt.class);
		   s1=createNiceMock(SendMessageFrameInt.class);
		   s2=createNiceMock(SchedulingInt.class);
		   s3=createNiceMock(SubmitScheduleFrameInt.class);
		   d=createNiceMock(DashboardFrameInt.class);
		   v=createNiceMock(ViewResultsFrameInt.class);
		    eh = new EventManager();
		    
	}
	public void testViewInventory() {
	
		replay(i);
		verify(i);
		
		
	}

	
	public void testSetResult() {
		replay(s);
		verify(s);
		
	}

	

	
	public void testSendMessage() {
		
		eh.setSendMessageFrame(s1);
		expect(s1.sendMessage()).andReturn(true);
		replay(s1);
		assertEquals(eh.sendMessage(),true);
		verify(s1);
		
		
		
	}


	public void testViewDetails() {
		replay(v);
		verify(v);
		
	}
	
	public void testRequestSchedule(){
	
		replay(s2);
		
		
		verify(s2);
		
		
		
	}
	
   
	public void viewDashboard(){
		replay(d);
		verify(d);
		
	}
	
	
	

}
