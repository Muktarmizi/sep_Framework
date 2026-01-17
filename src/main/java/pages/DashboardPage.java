
package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.CommonActions.*;

import java.time.Duration;

	public class DashboardPage {

	    WebDriver driver;
	    WebDriverWait wait;
	    LoginPage loginPage;
	    
	    

	    public DashboardPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        loginPage = new LoginPage(driver);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }


	    // Dashboard is usually already open after login
	    @FindBy(xpath = "//*[@href='/dashboard']")
	    WebElement dashboardElement;

	    @FindBy(xpath = "//*[normalize-space()='View Course Materials']")
	    WebElement viewCourseMaterialsElement;

	    @FindBy(xpath = "//*[normalize-space()='Automation']")
	    WebElement automationElement;

	    @FindBy(xpath = "(//*[contains (text(),'Enroll')]) [1]")
	    WebElement enrollNowElement;
	    
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
	    public void navigateToAutomationEnroll() {

//	        clickElement(dashboardElement);
//	        pause(2000);

	        clickElement(viewCourseMaterialsElement);
	       // pause(2000);

	        clickElement(automationElement);
	       // pause(2000);

	        clickElement(enrollNowElement);
	        pause(2000);
	    }
	}


