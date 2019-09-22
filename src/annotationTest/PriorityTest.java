package annotationTest;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=-1)
	public void test1() {
		System.out.println("Test1");
		
	}
	
	@Test(priority=2,dependsOnMethods="test3")
	public void qtest2() {
		System.out.println("qTest2");
		
	}
	@Test(priority=0)
	public void rtest3() {
		System.out.println("rTest3");
		
	}
	@Test(priority = 5)
	public void test3() {
		System.out.println("rTest3");
		
	}

}
