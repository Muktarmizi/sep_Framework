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
	
	@FindBy(xpath = "//a[contains(text(),'Enroll')]")
	WebElement enrollInTab;


	@FindBy(xpath = "//small[@id='id_f_name_error']")
	WebElement fNameRequiredFiledErrorMesssage;


	@FindBy(xpath = "//small[@id='id_m_name_error']")
	WebElement mNameRequiredFiledErrorMesssage;


	@FindBy(xpath = "//small[@id='id_l_name_error']")
	WebElement lNameRequiredFiledErrorMesssage;



	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionlist;

	@FindBy(xpath = "//small[@id='id_i_am_error']")
	WebElement iamRequiredFiledErrorMesssage;


	@FindBy(xpath = "//small[@id='id_course_wish_to_enroll_error']")
	WebElement courseWishRequiredFiledErrorMesssage;

	// phone number
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//small[@id='id_phone_error']")
	WebElement phoneNumberRequiredFiledErrorMesssage;

	// email address
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAdd;

	@FindBy(xpath = "//small[@id='id_email_error']")
	WebElement emailAddressRequiredFiledErrorMesssage;

	// password
	@FindBy(xpath = "//input[@name='password']")
	WebElement pass;

	@FindBy(xpath = "//small[@id='id_password_error']")
	WebElement passwordRequiredFiledErrorMesssage;

	@FindBy(xpath = "//div[@id='password-requirements']")
	WebElement passwordRequirementsMesssage;

	@FindBy(xpath = "//i[@id='togglePwd']")
	WebElement passwordEyeToggle;

	// select gender
	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement selectGender;
	



	@FindBy(xpath = "//option[text()='Female']")
	WebElement enterGender;

	// personal image
	@FindBy(xpath = "//input[@name='image']")
	WebElement chooseImage;

	@FindBy(xpath = "//small[@id='id_image_error']")
	WebElement chooseImageRequiredFiledErrorMesssage;

	// photoId
	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement choosePhotoId;

	@FindBy(xpath = "//small[@id='id_photo_id_error']")
	WebElement choosePhotoIdRequiredFiledErrorMesssage;

	// birth year
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement selectBirthYear;

	@FindBy(xpath = "//small[@id='id_birth_year_error']")
	WebElement birthYearRequiredFiledErrorMesssage;

	// birth month
	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement selectBirthMonth;


	@FindBy(xpath = "//small[@id='id_birth_month_error']")
	WebElement birthMonthRequiredFiledErrorMesssage;
	// birth year
	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement selectBirthDate;

	@FindBy(xpath = "//small[@id='id_birth_date_error']")
	WebElement birthDateRequiredFiledErrorMesssage;
	// home address
	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement homeAdd1;

	@FindBy(xpath = "//small[@id='id_home_address_line_1_error']")
	WebElement homeAdd1RequiredFiledErrorMesssage;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement homeAdd2;
	@FindBy(xpath = "//small[@id='id_home_address_line_2_error']")
	WebElement homeAdd2RequiredFiledErrorMesssage;

	// city
	@FindBy(xpath = "//input[@name='city']")
	WebElement enterCity;

	@FindBy(xpath = "//small[@id='id_city_error']")
	WebElement cityRequiredFiledErrorMesssage;

	// state status
	@FindBy(xpath = "//select[@id='id_state']")
	WebElement selectState;

	@FindBy(xpath = "//select[@id='id_state']/option")
	List<WebElement> selectStateList;

	@FindBy(xpath = "//small[@id='id_state_error']")
	WebElement stateRequiredFiledErrorMesssage;

	// zipcode
	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement enterZipcode;

	@FindBy(xpath = "//small[@id='id_zip_code_error']")
	WebElement zipCodeRequiredFiledErrorMesssage;

	// Immigration status
	@FindBy(xpath = "//select[@id='id_immigration_status']")
	WebElement selectImmigrationStatus;

	@FindBy(xpath = "//select[@id='id_immigration_status']/option")
	List<WebElement> selectImmigrationStatusList;

	// date of arrival
	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement enterDateOfArriVal;

	@FindBy(xpath = "//small[@id='id_arrival_date_error']")
	WebElement dateOfArrivalRequiredFiledErrorMesssage;

	// emergency contact
	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement enterEmergencyContact;

	@FindBy(xpath = "//small[@id='id_emergency_contact_error']")
	WebElement emergencyContactRequiredFiledErrorMesssage;


	@FindBy(xpath = "//small[@id='id_know_us_error']")
	WebElement knowUsRequiredFiledErrorMesssage;

	// higher education
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement selectHigherEducation;

	@FindBy(xpath = "//select[@id='id_highest_education']/option")
	List<WebElement> selectHigherEducationList;

	@FindBy(xpath = "//option[text()='Graduate']")
	WebElement enterHigherEducation;

	// origin of country
	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement selectOriginCountry;

	// primary language
	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement selectPrimaryLanguage;

	@FindBy(xpath = "//div[text()='Bengali']")
	WebElement enterPrimaryLanguage;

	// signature
	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement signatureField;

	@FindBy(xpath = "//small[@id='id_sign_by_name_error']")
	WebElement signatureRequiredFiledErrorMesssage;

	@FindBy(xpath = "//input[@name='is_agree']")
	WebElement doubleclickElement;

	@FindBy(xpath = "//button[@id='acceptButton']")
	WebElement acceptButton;

	@FindBy(xpath = "//a[@id='termsLink']")
	WebElement termsAndConditions;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitButton;

	@FindBy(xpath = "//button[@id='customButton']")
	WebElement rightClickButton;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement rightClickBackButton;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement rightClickCancelButton;
	
	@FindBy(xpath = "//li[onclick='handleCancel()']")
	WebElement rightClickCancel1Button;
	
	@FindBy(xpath = "//form[@id='enrollForm']")
	WebElement enrollForm;

	
	
	
	
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

	public void phone_number_validation() {
		
		verifyLengthOfTheFieldContent(phoneNum, Attribute.MAX_LENGTH, "10");
		pause(3000);
		inputText(phoneNum, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Phone Number is a required field.");
		pause(2000);
		inputText(phoneNum, "&$%*&$#^");

		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Phone Number must be exactly 10 digits.");
		pause(3000);
		clearTextFromTheField(phoneNum);
		pause(3000);
		inputText(phoneNum, "01240000000");

		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNum);
		pause(3000);
		clearTextFromTheField(phoneNum);
		pause(3000);

		inputTextThenClickTab(phoneNum, "9293306564");
		pause(2000);

	}

	public void email_validation() {
		
		verifyLengthOfTheFieldContent(emailAdd, Attribute.MAX_LENGTH, "74");
		pause(3000);
		inputText(emailAdd, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(emailAddressRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Email Address is a required field.");
		pause(2000);
		inputText(emailAdd, "Miurza@gmail");

		pause(3000);
		verifyErrorMessageUnderTheField(emailAddressRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be a valid Email Address.");
		pause(3000);
		clearTextFromTheField(emailAdd);
		pause(3000);

		inputText(emailAdd, "(*&**&fgfh#@@gmail.com");

		pause(3000);

		verifyErrorMessageUnderTheField(emailAddressRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be a valid Email Address.");
		pause(3000);
		clearTextFromTheField(emailAdd);
		pause(3000);
		inputTextThenClickTab(emailAdd, "Mirzashuvo79@gmail.com");
		pause(2000);

	}

	public void validatePassword() {

		elementSelected(pass);
		pause(2000);
		elementDisplayed(passwordRequirementsMesssage);
		inputText(pass, " ");

		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Password is a required field.");
		pause(2000);
		inputText(pass, "4567");

		clickElement(passwordEyeToggle);
		pause(3000);
		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		pause(3000);
		clearTextFromTheField(pass);
		pause(3000);

		inputText(pass, "3456677f");

		clickElement(passwordEyeToggle);
		pause(2000);

		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(3000);
		clearTextFromTheField(pass);
		pause(3000);
		inputText(pass, "3456677fF");

		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(3000);
		clearTextFromTheField(pass);
		pause(3000);
		inputText(pass, "()*<>^9!+ /");
		clickElement(passwordEyeToggle);

		pause(3000);

		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		pause(3000);
		clearTextFromTheField(pass);
		pause(3000);
		inputTextThenClickTab(pass, "63487746fF@$");
		clickElement(passwordEyeToggle);
		pause(2000);

	}

	public void gendervalidation() {

		selectElelementFromDropdownOnebyOne(selectGender, selectGenderList);
		pause(2000);
		selectDropdown(selectGender, "Female");
		pause(2000);

	}

	public void choosePersonalImagevalidation() {
		inputText(chooseImage, " ");
		pause(2000);
		verifyErrorMessageUnderTheField(chooseImageRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Personal Image is a required field.");
		uploadPhotoImage(chooseImage, "./image/personalImage.jpg");
		pause(2000);

	}

	public void choosePhotoIdvalidation() {
		inputText(choosePhotoId, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(choosePhotoIdRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Photo Id is a required field.");
		uploadPhotoImage(choosePhotoId, "./image/photoId.png");
		pause(2000);

	}

	public void dateOfBirthValidation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, submitButton);

		inputText(selectBirthYear, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(birthYearRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Birth Year is a required field.");
		pause(2000);
		selectDropdown(selectBirthYear, "1978");
		pause(2000);

		inputText(selectBirthMonth, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(birthMonthRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Birth Month is a required field.");
		pause(2000);

		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "January");
		pause(2000);

		// selectElelementFromDropdownOnebyOne(selectBirthDate, selectBirthDateList);
		// pause(2000);
		inputText(selectBirthDate, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(birthDateRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Birth Date is a required field.");
		pause(2000);
		selectDropdown(selectBirthDate, "1");
		pause(2000);

	}

	public void homeAddressLine1Validation() {
		verifyLengthOfTheFieldContent(homeAdd1, Attribute.MAX_LENGTH, "60");
		pause(3000);
		 
		inputText(homeAdd1, " ");
		verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Home Address Line 1 is a required field.");
		pause(3000);
		
		inputText(homeAdd1, "&$%*&$#^");

		pause(3000);
		verifyErrorMessageUnderTheField(homeAdd1RequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be alphanumeric characters.");
		pause(3000);
		clearTextFromTheField(homeAdd1);
		pause(3000);

		inputText(homeAdd1, "7405_Lesada, dr"); //
		pause(3000);

	}

	public void homeAddressLine2Validation() {
		verifyLengthOfTheFieldContent(homeAdd2, Attribute.MAX_LENGTH, "65");
		pause(3000);
		
		inputText(homeAdd2, "&$%*&$#^");

		pause(3000);
		verifyErrorMessageUnderTheField(homeAdd2RequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be alphanumeric characters.");
		pause(3000);
		clearTextFromTheField(homeAdd2);
		pause(3000);

		inputText(homeAdd2, "Adsfg123456"); //
		pause(3000);

	}

	public void cityValidation() {
		verifyLengthOfTheFieldContent(enterCity, Attribute.MAX_LENGTH, "30");
		pause(2000);
		inputText(enterCity, " ");
		verifyErrorMessageUnderTheField(cityRequiredFiledErrorMesssage, Attribute.INNER_HTML, "City is a required field.");
		pause(2000);
		inputText(enterCity, "234");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");

		pause(2000);
		clearTextFromTheField(enterCity);
		pause(2000);
		inputText(enterCity, "%^%$$%^");
		pause(2000);
		verifyErrorMessageUnderTheField(cityRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");

		pause(2000);
		clearTextFromTheField(enterCity);
		pause(2000);

		inputText(enterCity, "fsgf'hfh");
		pause(2000);

	}

	public void stateValidation() {

		inputText(selectState, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(stateRequiredFiledErrorMesssage, Attribute.INNER_HTML, "State is a required field.");
		pause(2000);

		selectDropdown(selectState, "Maryland");
		pause(2000);

	}

	public void zipCodeValidation() {
		verifyLengthOfTheFieldContent(enterZipcode, Attribute.MAX_LENGTH, "5");
		pause(2000);
		inputText(enterZipcode, " ");		
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFiledErrorMesssage, Attribute.INNER_HTML, "ZIP Code is a required field.");
		pause(2000);
		inputText(enterZipcode, "abvgh");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");

		pause(2000);
		clearTextFromTheField(enterZipcode);
		pause(2000);
		inputText(enterZipcode, "%^%$$");
		pause(2000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");

		pause(2000);
		clearTextFromTheField(enterZipcode);
		pause(2000);

		inputText(enterZipcode, "23456");
		pause(2000);

	}

	public void immigrationValidation() {
		elementSelected(selectImmigrationStatus);
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectImmigrationStatus, selectImmigrationStatusList);
		pause(2000);
		selectDropdown(selectImmigrationStatus, "Citizen");
		pause(2000);

		inputTextThenClickTab(selectImmigrationStatus, "Citizen");
		pause(2000);
	}

	public void dateOfArrivalValidation() {
		elementSelected(enterDateOfArriVal);
		inputText(enterDateOfArriVal, "=-@$%^Z");
		pause(2000);
		verifyErrorMessageUnderTheField(dateOfArrivalRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Invalid characters.");

		clearTextFromTheField(enterDateOfArriVal);
		pause(2000);
		inputText(enterDateOfArriVal, "10/20/2015");
		pause(2000);

	}

	public void emergencyContactValidation() {
		verifyLengthOfTheFieldContent(enterEmergencyContact, Attribute.MAX_LENGTH, "150");
		pause(2000);

		elementSelected(enterEmergencyContact);
		inputText(enterEmergencyContact, "^-=$$^&");
		pause(2000);
		verifyErrorMessageUnderTheField(emergencyContactRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Invalid characters.");
		pause(2000);
		clearTextFromTheField(enterEmergencyContact);
		pause(2000);
		inputText(enterEmergencyContact, "Sharif");
		pause(2000);

	}

	public void knowAboutUsValidation() {

		verifyLengthOfTheFieldContent(knowAboutUs, Attribute.MAX_LENGTH, "500");
		pause(3000);
		elementSelected(knowAboutUs);
		inputText(middleName, "&$%*&$#^,.");

		pause(3000);
		verifyErrorMessageUnderTheField(knowUsRequiredFiledErrorMesssage, Attribute.INNER_HTML, "");
		pause(3000);
		clearTextFromTheField(knowAboutUs);
		pause(3000);

		inputText(knowAboutUs, "45436");
		pause(3000);
		verifyErrorMessageUnderTheField(knowUsRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(knowAboutUs);
		pause(3000);
		inputText(knowAboutUs, "InterNet'");
		pause(3000);

	}

	public void higherEducationValidation() {

		elementSelected(selectHigherEducation);
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectHigherEducation, selectHigherEducationList);
		pause(2000);
		selectDropdown(selectHigherEducation, "MS");
		pause(2000);

	}

	public void originCountryValidation() {

		inputTextThenClickTab(selectOriginCountry, "Bangladesh");
		pause(2000);

	}

	public void primaryLanguageValidation() {

		afterHoverOverClickToAnEelement(driver, selectPrimaryLanguage, enterPrimaryLanguage);
		pause(2000);
	}

	public void signatureValidation() {
		verifyLengthOfTheFieldContent(signatureField, Attribute.MAX_LENGTH, "150");
		inputText(signatureField, " ");
		verifyErrorMessageUnderTheField(signatureRequiredFiledErrorMesssage, Attribute.INNER_HTML, "Signature is a required field.");
		pause(2000);
		inputText(signatureField, "abvgh hkjh");
		pause(2000);
		verifyErrorMessageUnderTheField(signatureRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Please provide your full name as above");

		pause(2000);
		clearTextFromTheField(signatureField);
		pause(2000);
		inputText(signatureField, "%^%$$");
		pause(2000);
		verifyErrorMessageUnderTheField(signatureRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Please provide your full name as above");
		pause(2000);
		clearTextFromTheField(signatureField);
		pause(2000);

		inputText(firstName, "Tania");
		inputText(lastName, "Sultana");
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, signatureField);
		inputText(signatureField, "Tania Sultana");
		pause(2000);

	}

	public void useOfDoubleClickAction() {

		Actions actions = new Actions(driver);
		actions.doubleClick(termsAndConditions).build().perform();
		pause(2000);

		clickElement(acceptButton);
		pause(2000);
		clickElement(doubleclickElement);
		pause(2000);

	}

	public void submitvalidation() {
		clickElement(submitButton);
		pause(2000);
		verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				" First Name is a required field. ");
		pause(3000);
		verifyErrorMessageUnderTheField(lNameRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				" Last Name is a required field. ");
		pause(3000);
		verifyErrorMessageUnderTheField(iamRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"I'm is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(courseWishRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Course wish to enroll is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(emailAddressRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Email Address is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(passwordRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Password is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(chooseImageRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(choosePhotoIdRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Photo Id is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(birthYearRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(birthMonthRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(birthDateRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(homeAdd1RequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(cityRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"City is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(stateRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"State is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(zipCodeRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(signatureRequiredFiledErrorMesssage, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(3000);

	}

	public void rightClickBackCancelValidation() {
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		pause(2000);
		
		actions.contextClick(rightClickBackButton).click().perform();

		
		Alert alert = driver.switchTo().alert();
		pause(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		alert.dismiss();
		pause(2000);
		clickElement(enrollForm);
		pause(2000);
	}
	public void rightClickBackOkValidation() {
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		pause(2000);
		
		actions.contextClick(rightClickBackButton).click().perform();

		
		Alert alert = driver.switchTo().alert();
		pause(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		alert.accept();
		pause(2000);
		
		
		
	}
	
	public void rightClickCancelOkValidation() {
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		pause(2000);
		
		actions.contextClick(rightClickCancel1Button).click().perform();

		
		Alert alert = driver.switchTo().alert();
		pause(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		alert.accept();
		pause(2000);
		
		
	}
	public void rightClickcancel2Validation() {
		Actions actions = new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		pause(2000);
		
		actions.contextClick(rightClickCancel1Button).click().perform();

		
		Alert alert = driver.switchTo().alert();
		pause(3000);
		System.out.println("The text present in the alert is: " + alert.getText());
		
		
		alert.dismiss();
		
		pause(1000);
	}

	public void happyPathOfSubmitForm() {
		clickElement(firstName);

		inputTextThenClickTab(firstName, "Tania");
		pause(2000);
		inputTextThenClickTab(middleName, "");
		inputTextThenClickTab(lastName, "Sultana");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionlist);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "6467342981");
		pause(2000);
		inputTextThenClickTab(emailAdd, "jarinabibi18@gmail.com");
		pause(2000);
		inputTextThenClickTab(pass, "Tansul1971@");
		pause(2000);

		selectElelementFromDropdownOnebyOne(selectGender, selectGenderList);
		pause(2000);
		selectDropdown(selectGender, "Female");
		pause(2000);
		uploadPhotoImage(chooseImage, "./image/personalImage.jpg");
		pause(2000);
		uploadPhotoImage(choosePhotoId, "./image/photoId.png");
		pause(2000);

		scrollIntoViewTheElementUsingJavascriptExecutor(driver, submitButton);

		// (selectBirthYear, selectBirthYearList);
		pause(2000);
		selectDropdown(selectBirthYear, "1978");
		pause(2000);

		selectElelementFromDropdownOnebyOne(selectBirthMonth, selectBirthMonthList);
		pause(2000);
		selectDropdown(selectBirthMonth, "January");
		pause(2000);

		// selectElelementFromDropdownOnebyOne(selectBirthDate, selectBirthDateList);
		// pause(2000);
		selectDropdown(selectBirthDate, "1");
		pause(2000);

		inputTextThenClickTab(homeAdd1, "7405 Lesada drive");
		pause(2000);
		inputTextThenClickTab(homeAdd2, "");
		pause(2000);
		inputTextThenClickTab(enterCity, "Windsor Mill");
		pause(2000);

		inputTextThenClickTab(selectState, "Maryland");
		pause(2000);
		inputTextThenClickTab(enterZipcode, "21244");
		pause(2000);
		inputTextThenClickTab(selectImmigrationStatus, "Citizen");
		pause(2000);
		inputTextThenClickTab(enterDateOfArriVal, "10/20/2015");
		pause(2000);
		inputTextThenClickTab(enterEmergencyContact, "Sharif");
		pause(2000);

		inputTextThenClickTab(knowAboutUs, "Facebook");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectHigherEducation, selectHigherEducationList);
		pause(2000);
		selectDropdown(selectHigherEducation, "MS");
		pause(2000);
		inputTextThenClickTab(selectOriginCountry, "Bangladesh");
		pause(2000);

		afterHoverOverClickToAnEelement(driver, selectPrimaryLanguage, enterPrimaryLanguage);
		pause(2000);

		inputTextThenClickTab(signatureField, "Tania Sultana");
		pause(2000);
		Actions actions = new Actions(driver);
		actions.doubleClick(termsAndConditions).build().perform();
		pause(2000);

		clickElement(acceptButton);
		pause(2000);
		clickElement(doubleclickElement);
		pause(2000);

		clickElement(submitButton);

	}
	
}
