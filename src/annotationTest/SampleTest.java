package annotationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void test() {
		System.out.println("before testtype");
		
	}	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method test");
	}
}