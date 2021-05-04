package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg.LearnTestNg.class)
public class LearnTestNg implements ITestListener {

	public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
	public WebDriver driver;
	public String value = "//*[@id='content']/div/div[1]/h1";
	public String PIMvalue = "//*[@id='menu_pim_viewPimModule']/b";

	@BeforeSuite
	public void launchBrowser(ITestContext arg0) {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Login(ITestContext arg0) {

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		System.out.println(driver.getTitle());
	}

	@Test(priority = 2)
	public void TITLE(ITestContext arg0) {
		java.util.List<WebElement> a1 = driver.findElements(By.id("mainMenu"));
		for (WebElement webElement : a1) {
			System.out.println(webElement.getText());
		}
	}
	@Test(priority = 3)
	public void PIMvalidate(ITestContext arg0) {
		driver.findElement(By.xpath("menu_pim_viewPimModule")).click();
		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Linda Anderson");
	}
	@Test(priority = 4)
	public void Heading(ITestContext arg0) {
		System.out.println(driver.findElement(By.xpath(value)).getText());
	}

	

}
