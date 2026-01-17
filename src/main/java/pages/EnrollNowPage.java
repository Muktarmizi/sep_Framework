package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;

import static common.CommonActions.*;

import java.security.KeyStore.PasswordProtection;
import java.time.Duration;
import java.util.List;

public class EnrollNowPage {

	WebDriver driver;
	LoginPage loginPage;
	WebDriverWait wait;
	DashboardPage dash;

	public EnrollNowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		loginPage = new LoginPage(driver);
		dash = new DashboardPage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	// ---------- Name Fields ----------
	@FindBy(xpath = "//*[@id='id_f_name']")
	WebElement firstName;

	@FindBy(xpath = "//*[@id='id_m_name']")
	WebElement middleName;

	@FindBy(xpath = "//*[@id='id_l_name']")
	WebElement lastName;

	@FindBy(name = "profession")
	WebElement profession;

	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;

	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']/option") //// select[@id='id_course_wish_to_enroll']/option
	List<WebElement> selecProfessionList;

	@FindBy(id = "id_course_wish_to_enroll")
	WebElement selectCourse;

	@FindBy(xpath = "//*[@name='course_wish_to_enroll' and @class='form-control']/option")
	List<WebElement> selectCourseList;

	@FindBy(name = "course")
	WebElement courseWish;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "id_password")
	WebElement password1;

	@FindBy(xpath = "//select[@name='gender']/option")
	List<WebElement> selectGenderList;

	@FindBy(name = "gender")
	WebElement gender;

	@FindBy(id = "id_image")
	WebElement personalImage;

	@FindBy(id = "id_photo_id")
	WebElement photoID;

	@FindBy(id = "id_birth_year")
	WebElement birthYear;

	@FindBy(xpath = "//select[@id='id_birth_month']/option")
	List<WebElement> selectBirthMonthList;

	@FindBy(id = "id_birth_month")
	WebElement birthMonth;

	@FindBy(id = "id_birth_date")
	WebElement birthDate;

	@FindBy(id = "id_home_address_line_1")
	WebElement addressLine1;

	@FindBy(id = "id_home_address_line_2")
	WebElement addressLine2;

	@FindBy(id = "id_city")
	WebElement city;

	@FindBy(id = "id_state")
	WebElement state;

	@FindBy(id = "id_zip_code")
	WebElement zipCode;

	@FindBy(id = "id_immigration_status")
	WebElement immigrationStatus;

	@FindBy(id = "id_arrival_date")
	WebElement arrivalDate;

	@FindBy(id = "id_emergency_contact")
	WebElement emergencyContact;

	@FindBy(id = "id_know_us")
	WebElement knowAboutUs;

	@FindBy(id = "id_highest_education")
	WebElement highestEducation;

	@FindBy(id = "id_country_of_origin")
	WebElement countryOrigin;

	@FindBy(id = "id_primary_language")
	WebElement primaryLanguag;

	@FindBy(xpath = "//input[@id='id_sign_by_name' and @name='sign_by_name']")
	WebElement signature;

	@FindBy(xpath = "//a[@id='termsLink']")
	WebElement termsAndCondition;

	@FindBy(xpath = "//input[@type='checkbox' and contains(@name,'terms')]")
	WebElement checkBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	WebElement successMessage;

	// Dashboard is usually already open after login
	@FindBy(xpath = "//*[@href='/dashboard']")
	WebElement dashboardElement;

	@FindBy(xpath = "//*[normalize-space()='View Course Materials']")
	WebElement viewCourseMaterialsElement;

	@FindBy(xpath = "//*[normalize-space()='Automation']")
	WebElement automationElement;

	@FindBy(xpath = "(//*[contains (text(),'Enroll')]) [1]")
	WebElement enrollNowElement;

	@FindBy(id = "login-signup")
	WebElement logElement;

	@FindBy(id = "id_username")
	WebElement userID;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//*[@id='loginBtn']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[@id='acceptButton']")
	WebElement acceptElement;

	@FindBy(id = "id_is_agree")
	WebElement checkBoxagree;

	@FindBy(xpath = "(//*[contains (text(),'Enroll')]) [1]")
	WebElement enroll;

	@FindBy(xpath = "//a[text()='Enroll in New Tab']")
	WebElement enrollInNewTab;

	@FindBy(xpath = "//input[@value = 'English']")
	WebElement english;

	@FindBy(xpath = "//div[contains(@class,'language')]//span[normalize-space()='English']")
	WebElement englishOption;

	@FindBy(xpath = "//a[text()='Login Page']")
	WebElement returnloginPage;

	@FindBy(xpath = "//a[@id='termsLink']")
	WebElement termsAndConditions;

	@FindBy(xpath = "//button[@id='acceptButton']")
	WebElement acceptButton;

	@FindBy(xpath = "//input[@name='is_agree']")
	WebElement doubleclickElement;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

	@FindBy(xpath = "//*[@id='id_f_name_error']")
	public WebElement firstNameError;

	@FindBy(xpath = "//*[@id='id_l_name_error']")
	public WebElement lastNameError;
	
	
	@FindBy(xpath = " //*[@id='id_i_am_error']")
	WebElement iamrequiredfield;
	
	@FindBy(xpath = "//*[@id='id_course_wish_to_enroll_error']")
    WebElement courseError;
	
	@FindBy(xpath = "//*[@id='id_phone_error']")
	WebElement phoneError;

	@FindBy(xpath = "//*[@id='id_email_error']")
	WebElement emailRequiredField;
	
	@FindBy(xpath = "//*[@id='password-requirements']")
	WebElement passErrorRequired;
	
	
	@FindBy(xpath = "//*[@id='id_image_error']")
	WebElement chooseFileRequiredField;
	
	@FindBy(xpath = "//*[@id='id_photo_id_error']")
	WebElement choosePhotoRequiredField;
	
	
	@FindBy(xpath = "//*[@id='id_birth_year_error']")
	WebElement birthYearRequiredFieldElement;
	
	@FindBy(xpath = "//*[@id='id_birth_month_error']")
	WebElement  birthMonthRequiredFieldElement;
	
	@FindBy(xpath = "//*[@id='id_birth_date_error']")
	WebElement birthDayRequiredFieldElement;

	
	
	
	
	public void loginWebsite() {

		clickElement(logElement);
		pause(2000);
		inputText(userID, "saimummaria08@gmail.com");
		pause(2000);
		inputText(password, "388556Bd@");
		pause(2000);
		clickElement(loginBtn);
		pause(2000);
	}

	public void navigateToAutomationEnroll() {

		clickElement(viewCourseMaterialsElement);

		clickElement(automationElement);
		pause(2000);

		afterHoverOverClickToAnEelement(driver, enroll, enrollInNewTab);

		switchToChildWindow(driver, enrollInNewTab);
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		pause(2000);
		verifyTitle(driver, "Enthrall");
	}

	public void fillEnrollFormAllFields() {

		pause(2000);
		verifyTitle(driver, "Enthrall");

		inputText(firstName, "Shuvo");
		pause(500);

		inputText(middleName, "M");
		pause(500);

		inputTextThenClickTab(lastName, "Mirza");
		pause(500);

		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(1000);

		selectDropdown(selectProfession, "a Student");
		pause(1000);

		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);

		selectDropdown(selectCourse, "Python");

		inputTextThenClickEnter(phone, "9293306564");
		pause(500);

		inputTextThenClickTab(email, "MirzaShuvo79@gmail.com");
		pause(500);

		inputText(password1, "Muktar2024$");
		pause(500);

		selectDropdown(gender, "Male");
		pause(500);

		uploadPhotoImage(personalImage, "C:\\Users\\Mizi\\OneDrive\\Pictures");
		pause(500);

		uploadPhotoImage(photoID, "C:\\Users\\Mizi\\OneDrive\\Desktop");
		pause(500);

		selectDropdown(birthYear, "1987");
		pause(500);

		selectDropdown(birthMonth, "December");
		pause(500);

		selectDropdown(birthDate, "16");
		pause(500);

		inputTextThenClickTab(addressLine1, "2268 Seward Ave");
		pause(500);

		inputTextThenClickTab(addressLine2, "Apt 3");
		pause(500);

		inputTextThenClickTab(city, "Bronx");
		pause(500);

		selectDropdown(state, "New York");
		pause(500);

		inputTextThenClickTab(zipCode, "10473");
		pause(500);

		selectDropdown(immigrationStatus, "Citizen");
		pause(500);

		inputTextThenClickTab(arrivalDate, "24th Jan 2013");
		pause(500);

		inputTextThenClickTab(emergencyContact, "9293306564");
		pause(500);

		inputTextThenClickTab(knowAboutUs, "Friends");
		pause(500);

		selectDropdown(highestEducation, "Graduate");
		pause(500);

		selectDropdown(countryOrigin, "Bangladesh");
		pause(500);

		// clickElementThenTab(english);

		inputTextThenClickTab(signature, "Shuvo M Mirza");
		pause(1000);
		Actions actions = new Actions(driver);
		actions.doubleClick(termsAndConditions).build().perform();
		pause(3000);

		clickElement(acceptButton);
		pause(3000);
		clickElementThenTab(doubleclickElement);
		clickElement(submitButton);

		pause(2000);

//		verifyCurrentUrl(driver,"https://enthrallit.com/course/dashboard/enrolls/");
//
//		verifyTextOfTheWebElement(successMessage, "Enrollment success message NOT displayed");
//		pause(3000);

	}

//	*********************************Enroll_NOW Page_Validation*******************************************************
//

	public void validateFirstName() {
		pause(2000);

		verifyLengthOfTheFieldContent(firstName, Attribute.MAX_LENGTH, "25");

		inputTextThenClickTab(firstName, " ");
		verifyErrorMessageUnderTheField(firstNameError, Attribute.INNER_HTML, " First Name is a required field. ");
		clearTextFromTheField(firstName);

		inputTextThenClickTab(firstName, "1223456678898");
		verifyErrorMessageUnderTheField(firstNameError, Attribute.INNER_HTML, " Must be alphabetic characters. ");

		inputTextThenClickTab(firstName, "21221$$%$%$%%%");
		verifyErrorMessageUnderTheField(firstNameError, Attribute.INNER_HTML, " Must be alphabetic characters. ");

		inputText(firstName, "Shuvo");

	}

	public void validateLastName() {
		pause(2000);

		verifyLengthOfTheFieldContent(lastName, Attribute.MAX_LENGTH, "30");

		inputTextThenClickTab(lastName, " ");
		verifyErrorMessageUnderTheField(lastNameError, Attribute.INNER_HTML, " Last Name is a required field. ");
		clearTextFromTheField(lastName);

		inputTextThenClickTab(lastName, "1223456678898");
		verifyErrorMessageUnderTheField(lastNameError, Attribute.INNER_HTML, " Must be alphabetic characters. ");

		inputText(lastName, "Mirza");

	}


	public void validateProfession() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selecProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "Select Profession");
		pause(2000);
		clickElementThenTab(selectProfession);
		pause(2000);
		verifyErrorMessageUnderTheField(iamrequiredfield, Attribute.INNER_HTML, "I'm is a required field.");
		pause(2000);

	}

	public void validateCourse() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Select Course");
		pause(2000);
		clickElementThenTab(selectCourse);
		pause(2000);
		verifyErrorMessageUnderTheField(courseError, Attribute.INNER_HTML,
				"Course wish to enroll is a required field.");
		pause(2000);
	}

	public void validatePhoneNumber() {
		
		
		pause(2000);
		verifyLengthOfTheFieldContent(phone, Attribute.MAX_LENGTH, "10");
		pause(2000);
		
		inputTextThenClickTab(phone," ");
		verifyErrorMessageUnderTheField(phoneError,Attribute.INNER_HTML,"Phone Number is a required field.");
		
		inputTextThenClickTab(phone, "000000");
		pause(2000);
		verifyErrorMessageUnderTheField(phoneError, Attribute.INNER_HTML, "Phone Number must be exactly 10 digits.");
		pause(2000);
		
		clearTextFromTheField(phone);
		inputText(phone,"9293306564");
		
		
	}
	public void validateEmail() {

		verifyLengthOfTheFieldContent(email, Attribute.MAX_LENGTH, "74");
		pause(2000);
		inputTextThenClickTab(email, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(emailRequiredField, Attribute.INNER_HTML, "Must be a valid Email Address.");
		pause(2000);
	}

	public void password_validation() {

		pause(2000);
//		verifyLengthOfTheFieldContent(password, Attribute.MAX_LENGTH, "74");
//		pause(2000);
		inputTextThenClickTab(password, "$#@%$#$^%$&^$&$^&^");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "aBcds"); // Minimum of 8 characters.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(2000);
		inputTextThenClickTab(password, "shuvoMirza"); // Password cann't contain First and last name.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "aaaaaaaaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		pause(2000);
		inputTextThenClickTab(password, "JHDJLFNDSJLNFKLDSNFKSNKSLNGSKNGKF");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Mirzashuvo79"); // Password cann't contain part of the Email.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Mirzashuvo79aaaaaaaaaa");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "821371029379102T*&%&*%&*");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Mirzashuvo790");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "121837892748913743");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Appleorange");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Appleorange^(^*^**");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "Appleorange5234354364");
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(2000);
		inputTextThenClickTab(password, "shuvoMirza#1");// Password cannot contain First Name, Last Name, or email.
		pause(2000);
		verifyErrorMessageUnderTheField(passErrorRequired, Attribute.INNER_HTML,
				"Password cannot contain First Name, Last Name, or email.");
		pause(2000);

	}

	public void choose_file_validation() {
		pause(2000);
		clickElement(submitButton); 
		pause(2000);
		verifyErrorMessageUnderTheField(chooseFileRequiredField, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(2000);
	}

	public void choose_photo_validation() {

		pause(2000);
		clickElement(submitButton);
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoRequiredField, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(2000);
	}

	public void birth_year_validation() {

		pause(2000);
		selectDropdown(birthYear, "Select Birth Year");
		pause(2000);
		clickElementThenTab(birthYear);
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(2000);

	}

	public void birth_month_validation() {

		pause(2000);
		selectElelementFromDropdownOnebyOne(birthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(birthMonth, "Select Birth Month");
		pause(2000);
		clickElementThenTab(birthMonth);
		pause(2000);
		verifyErrorMessageUnderTheField(birthMonthRequiredFieldElement, Attribute.INNER_HTML,
			"Birth Month is a required field.");
		pause(2000);
	}

	public void birth_day_validation() {

		pause(2000);
		selectDropdown(birthDate, "Select Birth Date");
		pause(2000);
		clickElementThenTab(birthDate);
		pause(2000);
		verifyErrorMessageUnderTheField(birthDayRequiredFieldElement, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(2000);
}
	
	
}
