package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();
/*driver.get("https://google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
driver.get("https://yahoo.com");
driver.navigate().back();
//driver.navigate().forward();
driver.close();// current window
driver.quit();// all child windows
*/	
driver.get("https://customercentertest.broadridge.net/#/login");	
driver.findElement(By.name("loginId")).sendKeys("bmuneg");
driver.findElement(By.name("password")).sendKeys("Welcome123)(");
driver.findElement(By.xpath("//*[@id=\"loginBox\"]/form/div[3]/button")).click();
//driver.findElement(By.linkText("Forgot password?")).click();
	}

}
