package com.rakuten.pages;

import com.rakuten.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviesPage {
    public MoviesPage(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(className ="round-action__element")
    public WebElement wishlistButton;
}
