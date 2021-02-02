package com.rakuten.step_definitions;

import com.rakuten.pages.DashboardPage;
import com.rakuten.pages.LoginPage;
import com.rakuten.pages.MoviesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class LoginStepDefs {

    @Given("User should be able to sign in and log in")
    public void user_should_be_able_to_sign_in_and_log_in() {
        LoginPage loginPage = new LoginPage();
        loginPage.signIn.click();
        loginPage.email.sendKeys("username");
        loginPage.password.sendKeys("password");
        loginPage.getIn.click();
    }

    @When("user should be able to Search content & check content detail page")
    public void user_should_be_able_to_Search_content_check_content_detail_page() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.searchButton.sendKeys("Interstellar", Keys.ENTER);
    }

    @Then("user should be able to Add content to whislist")
    public void user_should_be_able_to_Add_content_to_whislist() {

        MoviesPage moviesPage = new MoviesPage();
        moviesPage.wishlistButton.click();
        System.out.println("Nursen");
        System.out.println("guzelel");
        System.out.println("olmuyor");


    }


}
