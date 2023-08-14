package com.cydeo.step_definitions;

import com.cydeo.pages.n11SearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class n11_StepDefinitions {


    n11SearchPage n11SearchPage = new n11SearchPage();

    @Given("User information")
    public void userInformation() {
    }

    @When("go to page n11")
    public void go_to_page_n11() {
        Driver.getDriver().get("https://www.n11.com/");
        n11SearchPage.signIn.click();


    }

    @When("user enters  username")
    public void user_enters_username() {
        n11SearchPage.username.sendKeys("aliyevemil1991@hotmail.com");


    }

    @When("user enters password")
    public void user_enters_password() {
        n11SearchPage.password.sendKeys("n11com");

    }

    @When("user should see the account on the screen")
    public void user_should_see_the_account_on_the_screen() {
        n11SearchPage.notification.click();
       n11SearchPage.notification2.click();

n11SearchPage.loginButton.click();


    }

    @When("{string} is searched on the page")
    public void is_searched_on_the_page(String string) {
       // Object scroll;



    }

    @When("added to favorites")
    public void added_to_favorites() {

    }

    @When("removed from favorites")
    public void removed_from_favorites() {

    }

    @Then("user log out the page")
    public void user_log_out_the_page() {


    }


}