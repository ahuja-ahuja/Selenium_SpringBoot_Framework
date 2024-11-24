package com.pages;

import com.extensions.UIElementExtensions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage{

    //Locators for Login
    @FindBy(linkText = "Login")
    private WebElement lnkLogin;

    @FindBy(linkText = "Employee List")
    private WebElement lnkEmployeeList;

    public void clickLogin() {
        UIElementExtensions.performClick(lnkLogin);
    }

    public void clickEmployeeList(){
        lnkEmployeeList.click();
    }

}
