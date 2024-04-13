package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class demong {
  @Test
  public void test1() {
System.out.println("test1"); 
  }
  

  @BeforeTest
  public void test3() { 
	 System.out.println("before test");
}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
 System.out.println("after method");
  }
  @BeforeClass
  public void beforeclass() {
System.out.println("before class"); 
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("after class");
  }
  @AfterTest
  public void aftertest() {
	 System.out.println("after test");
  }

  

}
