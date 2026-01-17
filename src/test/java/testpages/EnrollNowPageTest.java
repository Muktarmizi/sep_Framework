package testpages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class EnrollNowPageTest extends BaseClass {

	@Test
	public void enrollNowWithAutomation() {

		enroll.loginWebsite();
		enroll.navigateToAutomationEnroll();
		enroll.fillEnrollFormAllFields();
	}

	@Test
	public void validation() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");

		enroll.validateFirstName();
		enroll.validateLastName();
		enroll.validateProfession();
		enroll.validateCourse();
	}
	@Test
	public void firstNameValidationTest() throws InterruptedException {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.validateFirstName();
	}

	

	@Test
	public void lastNameValidationTest() throws InterruptedException {

		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.validateLastName();

	}

	@Test
	public void iAmValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.validateProfession();

	}

	@Test
	public void courseValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.validateCourse();

	}

	@Test
	public void phoneNumberValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.phone_number_validation();

	}

	@Test
	public void emailAddressValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.email_validation();

	}

	@Test
	public void passwordValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.validatePassword();

	}

	@Test
	public void genderValidationTest(){
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.gendervalidation();

	}

	@Test
	public void choosePersonalImageValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.choosePersonalImagevalidation();

	}

	@Test
	public void choosePhotoIdValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.choosePhotoIdvalidation();

	}

	@Test
	public void dateOfBirthValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.dateOfBirthValidation();

	}

	@Test
	public void homeAddressValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.homeAddressLine1Validation();
		enroll.homeAddressLine2Validation();

	}

	@Test
	public void cityValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.cityValidation();

	}

	@Test
	public void stateValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.stateValidation();

	}

	@Test
	public void zipCodeValidationTest(){
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.zipCodeValidation();

	}

	@Test
	public void immigrationStatusValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.immigrationValidation();

	}

	@Test
	public void dateOfArrivalValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.dateOfArrivalValidation();

	}

	@Test
	public void emergencyContactValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.emergencyContactValidation();

	}

	@Test
	public void knowAboutUsValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.knowAboutUsValidation();

	}

	@Test
	public void higherEducationValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.higherEducationValidation();

	}

	@Test
	public void oringinCountryValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.originCountryValidation();

	}

	@Test
	public void primaryLanguageValidationTest()  {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.primaryLanguageValidation();
	}

	@Test
	public void signatureValidationTest()  {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.signatureValidation();

	}

	@Test
	public void doubleClickValidationTest()  {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	    enroll.useOfDoubleClickAction();

	}

	@Test
	public void SubmitFormValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		
		enroll.submitvalidation();

	}

	@Test
	public void rightClickBackCancelValidationTest()  {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.rightClickBackCancelValidation();

	}

	@Test
	public void rightClickBackOkValidationTest()  {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.rightClickBackOkValidation();

	}

	@Test
	public void rightClickCancelOkValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
		enroll.rightClickCancelOkValidation();

	}

	@Test
	public void rightClickCancel2ValidationTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
        enroll.rightClickcancel2Validation();

	}

	@Test
	public void happyPathOfSubmitFormTest() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
        enroll.happyPathOfSubmitForm();

	}

}
