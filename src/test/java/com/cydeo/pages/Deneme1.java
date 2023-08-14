package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deneme1{

    public Deneme1() {
        PageFactory.initElements(Driver.getDriver(), this);




    }
    @FindBy(xpath = "//button[@title='Gündem']")
    public WebElement title;

    @FindBy(xpath = "//button[@title='Test']")
    public WebElement testButton;
    @FindBy(xpath = "//a[@title='Yemek Testleri']")
    public WebElement yemek_testleri;

    @FindBy(xpath = "//h3[@title='Seçtiğin Meyvelere Göre Nasıl Bir Enerji Yaydığını Söylüyoruz!']")
    public WebElement forum;


}