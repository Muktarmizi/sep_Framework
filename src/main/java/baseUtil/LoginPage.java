package baseUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[contains (text(), 'Login/Signup')]")
	WebElement logElement;

	@FindBy(id = "id_username")
	WebElement userID;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id='loginBtn']")
	WebElement loginBtn;

	public void loginWebsite() throws InterruptedException {

		logElement.click();
		userID.sendKeys("mizimuktar0@gmail.com");
		password.sendKeys("Password$1");
		Thread.sleep(5000);
		loginBtn.click();
		Thread.sleep(5000);
	}

}
