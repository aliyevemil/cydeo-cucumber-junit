package com.cydeo.step_definitions;

import com.cydeo.pages.Deneme1;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Deneme1Step {

    Deneme1 deneme1= new Deneme1();

    @Given("Username and password")
    public void username_and_password() {
        Driver.getDriver().get("https://onedio.com/");
       deneme1.title.click();
    }
    @When("User fill in the username blank")
    public void user_fill_in_the_username_blank() {

     deneme1.testButton.click();

    }
    @When("user fill password blank")
    public void user_fill_password_blank() {
       deneme1.yemek_testleri.click();

    }
    @When("user can click sign button")
    public void user_can_click_sign_button() {
deneme1.forum.click();
    }
    @Then("user see the title on top of the page")
    public void user_see_the_title_on_top_of_the_page() {

    }

}
