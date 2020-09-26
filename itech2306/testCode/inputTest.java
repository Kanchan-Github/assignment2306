package testCode;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class inputTest {

}

//command line testing
Result result = JUnitCore.runClasses(MyClassTest.class);
for (Failure failure : result.getFailures()) {
  System.out.println(failure.toString());
}


// Test Case: 1 
String str1 = "Henry"; 
System.out.println(isValidUsername(str1)); 

// Test Case: 2 
String str3 = "1HEnry"; 
System.out.println(isValidUsername(str3)); 

// Test Case: 3 
String str5 = "H"; 
System.out.println(isValidUsername(str5)); 
