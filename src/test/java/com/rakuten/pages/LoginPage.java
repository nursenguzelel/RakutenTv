package com.rakuten.pages;

import com.rakuten.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//font[text()='Get in'])[2]")
    public WebElement signIn;

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name ="password")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']/div")
    public WebElement getIn;

}