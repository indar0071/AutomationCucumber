package stepsDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithSingledata {
	WebDriver driver;

@Given("^i launch url in chrome url$")
public void i_launch_url_in_chrome_url() throws Throwable {
     driver= new ChromeDriver();
    driver.get("http://orangehrm.qedgetech.com/");
    driver.manage().window().maximize();
}

@When("^i enter username and password in textbox$")
public void i_enter_username_and_password_in_textbox() throws Throwable {
   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
}

@When("^i click on login button$")
public void i_click_on_login_button() throws Throwable {
	driver.findElement(By.id("btnLogin")).click();
	   
}

@Then("^verify the url$")
public void verify_the_url() throws Throwable {
    if(driver.getCurrentUrl().contains("dash"))
    {
    	System.out.println("login success");
    }
    else
    {
        	System.out.println("login failed");
        
    }
}


}
