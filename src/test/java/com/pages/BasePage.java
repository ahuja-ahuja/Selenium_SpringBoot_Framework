package com.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class BasePage{
    @Autowired
    private WebDriver driver;

    @PostConstruct
    public void init(){
        PageFactory.initElements(driver, this);
    }
}