package org.step.asmap;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDeffAsMap1DClass {
WebDriver driver;
@Given("User is on the AdactingHotel page")
public void user_is_on_the_AdactingHotel_page() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com/");
	 driver.manage().window().maximize();
		
}

@When("User should enter Username and Password and Click login button")
public void user_should_enter_Username_and_Password_and_Click_login_button(io.cucumber.datatable.DataTable dataTable) {
WebElement txtuserName = driver.findElement(By.id("username"));
Map<String, String> map=dataTable.asMap(String.class, String.class);
String username = map.get("username");
txtuserName.sendKeys(username);
WebElement txtpass = driver.findElement(By.id("password"));
String password = map.get("password");
txtpass.sendKeys(password);
	

}

@When("User should click on login Button")
public void user_should_click_on_login_Button() {
	WebElement btnclick = driver.findElement(By.id("login"));
	btnclick.click();
	
}

@Then("User should verify the Success message")
public void user_should_verify_the_Success_message() {
}




}
