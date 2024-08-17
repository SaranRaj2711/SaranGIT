package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class GoogleStefDef {
	public WebDriver driver;
	public String actT;
	
	@Given("Open the Google application")
	public void openapp() {
	WebDriver driver = new ChromeDriver();
	driver.get("https:www.google.com");
	}

	@When("User captures current page title")
	public void verification() {
		String expT = "Google";
		String actT = driver.getTitle();
	}

	@Then("Title should match")
	public void validation() {
		Assert.assertTrue(actT.contains("Google"),"Title is Matched");
		Reporter.log("Title is Matched TC is passed");
	}
}
