package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginUsingTest_testcase7 {
	WebDriver driver;
	@BeforeTest()
	public void openbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test(priority=1)
	public void StartTestStep2() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
}
