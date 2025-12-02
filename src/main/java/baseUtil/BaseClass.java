package baseUtil;

import java.security.PublicKey;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public LoginPage loginPage;

	@BeforeMethod

	public void setUp() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mizi\\Downloads\\chromedriver-win64\\chromedriver-win64");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://enthrallit.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		loginPage = new LoginPage(driver);
		

	}

	@AfterMethod

	public void tearUp() {

		driver.quit();
	}

}
