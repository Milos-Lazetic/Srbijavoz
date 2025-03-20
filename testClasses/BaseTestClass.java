package testClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import pageClasses.HomePage;
import pageClasses.LoginPage;

public class BaseTestClass {
	
	public WebDriver driver;
	public LoginPage login; //objekat za svaku page klasu
	public HomePage home;
	//String driverPath = "C:\\Users\\Dell\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	public String baseURL = "https://webapi1.srbvoz.rs/ekarta/app/#!/login";
	public String baseURL1 = "https://webapi1.srbvoz.rs/ekarta/app/#!/home";
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	

	@BeforeTest
	public void initialization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		//System.setProperty("webdriver.chrome.driver", driverPath);
		
		//inicijalizacija objekta
		login = new LoginPage(driver);
		home = new HomePage(driver);
	}
}
