package com.revature.pages;
import org.openqa.selenium.WebDriver;     
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpacePage {
	public WebDriver driver;

	//=====================================Customer Home Elements================================
	
	@FindBy(id = "departureSpaceport")
	public WebElement departureSpaceport;
	
	@FindBy(id = "arrivalSpaceport")
    public WebElement arrivalSpaceport;

    @FindBy(id = "departureDate")
    public WebElement departureDate;
    
    @FindBy(id = "arrivalDate")
    public WebElement arrivalDate;
    
    @FindBy(id = "search")
    public WebElement search;
    
    @FindBy(id = "book1")
    public WebElement book1;
    
    @FindBy(id = "filtered")
    public WebElement filtered;
    
    
    //========================================Ticket Form Elements=================================
    
    @FindBy(id = "passportNo")
	public WebElement passportNo;
	
	@FindBy(id = "meals")
    public WebElement meals;

    @FindBy(id = "cabinClass")
    public WebElement cabinClass;
    
    @FindBy(id = "expiryDate")
    public WebElement expiryDate;
    
    @FindBy(id = "noOfPassengers")
    public WebElement noOfPassengers;
    
    @FindBy(id = "checkedBag")
    public WebElement checkedBag;
    
    @FindBy(id = "carryOnBag")
    public WebElement carryOnBag;
    
    @FindBy(id = "bookTicket")
    public WebElement bookTicket;
    
    @FindBy(id = "headingBook")
    public WebElement headingBook;
    
    
    //=======================================Login Elements===========================================
    
  	@FindBy(id = "userInput")
  	public WebElement usernameInput;
  	
  	@FindBy (id = "passwordInput")
  	public WebElement passwordInput;
  	
  	@FindBy(id = "loginButton")
  	public WebElement loginButton;
    
    
    public SpacePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
	

	
	

