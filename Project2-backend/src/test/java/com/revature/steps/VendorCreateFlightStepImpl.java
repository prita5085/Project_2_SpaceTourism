//package com.revature.steps;
//
//import com.revature.pages.SpaceMain;
//import com.revature.runner.SpaceRunner;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class VendorCreateFlightStepImpl {
//
//    public static SpaceMain spaceMain = SpaceRunner.spaceMain;
//    public static WebDriver driver = SpaceRunner.driver;
//
//    @Given("The Vendor is on the vendor-create-flights form Page")
//    public void the_vendor_is_on_the_vendor_create_flights_form_page() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.get("http://localhost:4200/vendorcreateflight");
//        driver.manage().window().fullscreen();
//    }
//
//    @When("The Vendor fills out the form by entering {string}, {string}, {string}, {string},{string}, {string}, {string} and clicks create")
//    public void the_vendor_fills_out_the_form_by_entering_and_clicks_create(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
//        // Write code here that turns the phrase above into concrete actions
//        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        spaceMain.departureDateTime.sendKeys(string);
//        spaceMain.arrivalDateTime.sendKeys(string2);
//        spaceMain.pricePerTicket.sendKeys(string3);
//        spaceMain.flightCost.sendKeys(string4);
//        spaceMain.departureSpaceport.sendKeys(string5);
//        spaceMain.arrivalSpaceport.sendKeys(string6);
//        spaceMain.spaceship.sendKeys(string7);
//        spaceMain.createFlightButton.click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Then("A new flight is created and user is sent to vendorHome page")
//    public void a_new_flight_is_created_and_user_is_sent_to_vendor_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//        String expected = "http://localhost:4200/vendorHome";
//        Assert.assertEquals(expected, driver.getCurrentUrl());
//    }
//
//}
