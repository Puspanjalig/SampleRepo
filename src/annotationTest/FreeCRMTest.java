package annotationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCRMTest {
	WebDriver drive;

	@BeforeMethod
	public void launchBrowser() {

		System.setProperty("webdriver.gecko.driver","H:\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		drive=new FirefoxDriver();
		drive.get("https://www.google.com");
	}
	@Test
	public void validation() {
		System.out.println(drive.getTitle());
	}
	@Test
	public void validation2() {
	drive.findElement(By.linkText("Gmail")).click();
	}
	@Test
	public void validation3() {
		System.out.println("ValidationTest");
	}
	
	@AfterMethod
	public void closeBrowser() {
		drive.quit();
	}

}
