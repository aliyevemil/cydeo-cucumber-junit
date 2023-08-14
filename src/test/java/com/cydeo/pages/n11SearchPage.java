package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class n11SearchPage {

    public n11SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(className = "btnSignIn")
    public WebElement signIn;


    @FindBy(name = "email")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement loginButton;

@FindBy(className = "dn-slide-deny-btn")
    public WebElement notification;


    @FindBy(xpath = "//span[.='Tümünü Reddet']")
    public WebElement notification2;


/*
    public void login(){
        this.password.sendKeys("n11com");
        this.username.sendKeys("aliyevemil1991@hotmail.com");
     loginButton.click();


    }
public void loginFunction(){
    loginButton.click();
    username.sendKeys(ConfigurationReader.getProperty("web.n11.username"));
    password.sendKeys(ConfigurationReader.getProperty("web.n11.password"));}*/



}
