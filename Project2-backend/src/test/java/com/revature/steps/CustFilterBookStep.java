package com.revature.steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.revature.pages.SpacePage;
import com.revature.runner.SpaceRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert; 


public class CustFilterBookStep {
	
	public static SpacePage spacePage = SpaceRunner.spacePage;
    public static WebDriver driver = SpaceRunner.driver;
	
	@Given("^Customer is on customer home page$")
	public void customer_is_on_customer_home_page()  {
		driver.get("http://localhost:4200/customerHome");
		driver.manage().window().fullscreen();
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
	}
	
	@When("^Customer fill in required information to filter flights$")
	public void customer_fill_in_required_information_to_filter_flights()  {
		spacePage.departureSpaceport.sendKeys("Titania");
		spacePage.arrivalSpaceport.sendKeys("Lethe");
		spacePage.departureDate.sendKeys("1");
		spacePage.arrivalDate.sendKeys("31");
	    try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	  
	}

	@When("^Customer click on search button$")
	public void customer_click_on_search_button()  {
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		spacePage.search.click();
	    
	}
	
	@Then("^Customer should be able to view filtered flights$")
	public void customer_should_be_able_to_view_filtered_flights()  {
		try {
	           Thread.sleep(4000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   String filterExpected = "Your Filtered Flights";
		   String filterActual = spacePage.filtered.getText();
		   System.out.println(filterActual);
		   Assert.assertEquals(filterExpected, filterActual);
		   
	}
	
	
	@When("^Customer click on book button$")
	public void customer_click_on_book_button()  {
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		spacePage.book1.click();
	    
	}
	
	
	@Then("^Customer should be on ticket page$")
	public void customer_should_be_on_ticket_page()  {
		try {
	           Thread.sleep(4000);
	       } catch (InterruptedException e) {
	           e.printStackTrace();
	       }
		   String headingExpected = "Book Your Ticket";
		   String headingActual = spacePage.headingBook.getText();
		   Assert.assertEquals(headingExpected, headingActual);
		   
	   
	}

	@When("^Customer fills in ticket form$")
	public void customer_fills_in_ticket_form()  {
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		spacePage.passportNo.sendKeys("3456783");
		Select meal = new Select(spacePage.meals);
		meal.getOptions().get(1).click();
		
		Select cabin = new Select(spacePage.cabinClass);
		cabin.getOptions().get(1).click();

		spacePage.expiryDate.sendKeys("3-3-2023");
		spacePage.noOfPassengers.sendKeys("1");
		spacePage.checkedBag.sendKeys("1");
		spacePage.carryOnBag.sendKeys("1");
	    
	   
	}
	
	@When("^Customer click on book ticket button$")
	public void customer_click_on_Book_Ticket_button() {
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		String buttonExpected = "Book Ticket";
		   String buttonActual = spacePage.bookTicket.getText();
		   spacePage.bookTicket.click();
	   
	}
	
	@Then("^Customer should be on confirmed Page$")
	public void customer_should_be_on_Confirmed_Page() {
		driver.manage().window().fullscreen();
		try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    String urlExpected = "http://localhost:4200/confirmed";
	    String urlActual = driver.getCurrentUrl();
	    Assert.assertEquals(urlExpected, urlActual);
	 
	}
}
