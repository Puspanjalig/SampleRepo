package annotationTest;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="Sanity")
	public void test1() {
		System.out.println("SanityTest");
	}
	@Test(groups="Sanity")
	public void test2() {
		System.out.println("SanityTest");
	}
	@Test(groups="Reg")
	public void test3() {
		System.out.println("RegressionTest");
	}
	@Test(groups="Reg")
	public void test4() {
		System.out.println("RegresionTest");
	}
	

}
