package javaapplication2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class classroombooking_testrunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(ClassroomBookingTest.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}
