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
//public class VendorRegStep {
//
//    public static SpaceMain wikiMain = SpaceRunner.spaceMain;
//    public static WebDriver driver = SpaceRunner.driver;
//
//    @Given("Guest is on the homepage")
//    public void guest_is_on_the_homepage() {
//        driver.get("http://localhost:4200");
//        driver.manage().window().fullscreen();
//    }
//
//    @When("Guest clicks on book")
//    public void guest_clicks_on_book() {
//        wikiMain.bookButton.click();
//    }
//
//    @Then("Guest will be on Login page")
//    public void guest_will_be_on_Login_page() {
//        String expected = "http://localhost:4200/login";
//        Assert.assertEquals(expected, driver.getCurrentUrl());
//    }
//
//}
