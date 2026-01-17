package testpages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashboardPageTest extends BaseClass {
	
	@Test
	 public void dashboardTest() {
		
		dash.loginWebsite();
		dash.navigateToAutomationEnroll();
		
	}
	
	@Test
	public void enrollnow() {
		dash.navigateToAutomationEnroll();
	}

	
}
