package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonActions.*;

import java.time.Duration;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	@FindBy(id="login-signup")
	WebElement logElement;

	@FindBy(id = "id_username")
	WebElement userID;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id='loginBtn']")
	WebElement loginBtn;

	public void loginWebsite(){

		clickElement(logElement);
		pause(2000);
		inputText(userID,"saimummaria08@gmail.com");
        pause(2000);
		inputText(password, "388556Bd@");
		pause(2000);
		clickElement(loginBtn);
		pause(2000);
	}

}
