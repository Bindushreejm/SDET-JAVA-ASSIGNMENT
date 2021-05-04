package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class driver {
	static WebDriver driver;
	static LoginPage objLogin;
	static HomePage objHome;
	static DirectoryPage objDir;
	public static void main(String[] args) {
	
		 setup();
		 testDirectoryPage();
	
	}
public static void setup()
{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
}

public static void testDirectoryPage()
	{
		objLogin= new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();
		
		objHome= new HomePage(driver);
		objHome.moveToDirectoryTab();
		
		objDir = new DirectoryPage(driver);
		objDir.setSearchName("peter");
		
		objDir.Searchbuttonclick();
		objDir.Resetbuttonclick();
	}
}
