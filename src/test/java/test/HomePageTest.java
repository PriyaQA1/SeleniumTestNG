package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class HomePageTest {
  @Test
  public void myMethod() {
	  System.out.println("My Method");
  }
  @BeforeClass
  public void launchUrl() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Test");
  }
  

}
