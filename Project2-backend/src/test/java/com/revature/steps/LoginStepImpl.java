package com.revature.steps;
import com.revature.pages.SpacePage;
import com.revature.runner.SpaceRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class LoginStepImpl {

    public static SpacePage spacePage = SpaceRunner.spacePage;
    public static WebDriver driver = SpaceRunner.driver;

    @Given("The User is on the Login Page")
    public void the_user_is_on_the_login_page() {
     
        driver.get("http://localhost:4200/login");
        driver.manage().window().fullscreen();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    @When("The Customer enters a correct {string} and {string} and presses Login")
    public void the_customer_enters_a_correct_and_and_presses_login(String string, String string2) throws InterruptedException {
      
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        spacePage.usernameInput.sendKeys("rose");
        spacePage.passwordInput.sendKeys("rose123");
        spacePage.loginButton.click();


    }
    @Then("The Customer should land on the Customer home page")
    public void the_customer_should_land_on_the_customer_home_page() {
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        String expected = "http://localhost:4200/customerHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());

    }

    @When("The Vendor enters their correct {string} and {string} and presses Login")
    public void the_vendor_enters_their_correct_and_and_presses_login(String string, String string2) throws InterruptedException {
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        spacePage.usernameInput.sendKeys("ir");
        spacePage.passwordInput.sendKeys("1234567");
        spacePage.loginButton.click();



    }
    @Then("The vendor will be on the landing page")
    public void the_vendor_will_be_on_the_landing_page() {
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
        String expected = "http://localhost:4200/vendorHome";
        Assert.assertEquals(expected, driver.getCurrentUrl());

    }
    }
