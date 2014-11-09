package javaapplication2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class cabdetails_testrunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(cab_details_test.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}
