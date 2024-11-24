package com.example.main_learning;

import com.pages.CreateEmployeePage;
import com.pages.EmployeeListPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import selenium.libraries.WebDriverConfig;

@SpringBootTest
@Import(WebDriverConfig.class)
@ComponentScan(basePackages = "com.pages")
@ActiveProfiles("dev")
class SeleniumSpringTest {

	@Autowired
	private WebDriver driver;

	@Autowired
	private HomePage homePage;

	@Autowired
	private CreateEmployeePage createEmployeePage;

	@Autowired
	private EmployeeListPage employeeListPage ;

	@Autowired
	private LoginPage loginPage;

	@Test
	void contextLoads() {
		//3. Navigate to a specific URL
		driver.navigate().to("http://eaapp.somee.com");

		//POM Code
		homePage.clickLogin();
		loginPage.performLogin("admin", "password");
	    homePage.clickEmployeeList();
		employeeListPage.clickCreateNew();
		createEmployeePage.createNewEmployee("AutoUser2", "22222", "autotestuser2@gmail.com", "20000", "Middle");


	}

}
