//package com.revature.steps;
//
//import com.revature.pages.SpaceMain;
//import com.revature.runner.SpaceRunner;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.WebDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class VendorStepImpl {
//
//    public static SpaceMain spaceMain = SpaceRunner.spaceMain;
//    public static WebDriver driver = SpaceRunner.driver;
//
//    @Given("The user is on the log in page")
//    public void the_user_is_on_the_log_in_page() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.get("http://localhost:4200/login");
//        driver.manage().window().fullscreen();
//    }
//    @When("the user logs in with valid credentials, {string},{string}")
//    public void the_user_logs_in_with_valid_credentials(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        spaceMain.usernameInput.sendKeys(string);
//        spaceMain.passwordInput.sendKeys(string2);
//        spaceMain.loginButton.click();
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//    }
//
//    @Then("the vendor will be taken to vendorHome page")
//    public void the_vendor_will_be_taken_to_vendor_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
////        String expected = "http://localhost:4200/vendorHome";
//    }
//    @When("the Vendor clicks on view flight for a particular flight")
//    public void the_vendor_clicks_on_view_flight_for_a_particular_flight() {
//        // Write code here that turns the phrase above into concrete actions
//        spaceMain.viewFlightButton.click();
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("The user will be taken to vendorflightview")
//    public void the_user_will_be_taken_to_vendorflightview() {
//        // Write code here that turns the phrase above into concrete actions
//        String expected = "http://localhost:4200/vendorflightview";
//        Assert.assertEquals(expected, driver.getCurrentUrl());
//    }
//
//}