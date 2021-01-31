package com.rakuten.pages;

import com.rakuten.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "search__box__input")
    public WebElement searchButton;

}
