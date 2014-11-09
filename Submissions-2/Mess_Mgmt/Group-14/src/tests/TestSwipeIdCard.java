package tests;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.ArrayList;

import messmanagement.MessName;
import messmanagement.Student;
import messmanagement.SwipeIdCard;

public class TestSwipeIdCard {
	private Student s1, s2, s3;
	private SwipeIdCard sic;
	
	public TestSwipeIdCard() {
		s1 = new Student("tom", "1");
		s2 = new Student("dick", "2");
		s3 = new Student("harry", "3");
		sic = new SwipeIdCard(MessName.A);
	}
	
	public void doTest() {
		s1.setMessOption(MessName.A);
		s2.setMessOption(MessName.A);
		s3.setMessOption(MessName.C);
		
		assertEquals(false, sic.checkMessOption(s1.getId()));
		assertEquals(false, sic.checkMessOption(s2.getId()));
		assertEquals(true, sic.checkMessOption(s3.getId()));
		
		assertEquals(false, sic.onIdCardSwiped(s3.getId()));
		
		assertEquals(false, sic.checkEaten(s1.getId()));
		assertEquals(false, sic.checkEaten(s2.getId()));
		assertEquals(false, sic.checkEaten(s3.getId()));
		
		assertEquals(true, sic.onIdCardSwiped(s1.getId()));
		assertEquals(true, sic.checkEaten(s1.getId()));
		assertEquals(false, sic.onIdCardSwiped(s1.getId()));
		
		ArrayList<Date> leaveDates = new ArrayList<Date>();
		leaveDates.add(new Date());
		s2.applyForLeave(leaveDates);
		assertEquals(true, sic.checkOnLeave(s2.getId()));
		assertEquals(false, sic.onIdCardSwiped(s2.getId()));
	}
}
