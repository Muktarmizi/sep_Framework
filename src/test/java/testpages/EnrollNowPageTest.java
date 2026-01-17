package testpages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;


public class EnrollNowPageTest extends BaseClass{
	
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
		enroll.validatePhoneNumber();
		enroll.validateEmail();
		enroll.password_validation();
		enroll.choose_file_validation();
		enroll.choose_photo_validation();
		enroll.birth_year_validation();
		enroll.birth_day_validation();
		enroll.birth_day_validation();
		
	}
	
//	@Test
//	public void  navigateToAutomationEnrollTest() {
//		enroll.loginWebsite();
//		enroll.navigateToAutomationEnroll();
//		enroll.fillEnrollFormAllFields();
//		
//	}
//	@Test
//	public void enrollnow() {
//		enroll.loginWebsite();
//		enroll.navigateToAutomationEnroll();
//	}
	

}
