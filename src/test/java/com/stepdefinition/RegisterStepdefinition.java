package com.stepdefinition;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.base.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepdefinition extends Baseclass{
	static	ExtentTest feature;
	static	ExtentTest scenario;
	@Given("user lands on registration page")
	public void user_lands_on_registration_page() throws ClassNotFoundException, IOException {
	//	report("registration report");
    	
	    feature = extent.createTest(new GherkinKeyword("Feature"), "verify user can register at follo app");
	   scenario = feature.createNode(new GherkinKeyword("Scenario") , "verifying user can register with valid credentials");
             
		
		 browserlaunch("https://test.folloit.com/login");
		WebElement home = driver.findElement(By.xpath("//u[text()='Back to Home Page']"));
		btnclick(home);
		WebElement reg=driver.findElement(By.id("myCheck"));
		btnclick(reg);
		 String currentUrl = driver.getCurrentUrl(); 
		 System.out.println(currentUrl);
			
	   if(currentUrl.equals("https://test.folloit.com/home"))
			{
			  
			   scenario.createNode(new GherkinKeyword("Given"), "user lands on registration page").pass("user lands on registration page successfully").addScreenCaptureFromPath(captureScreenshot("reg", driver));
			}
			else
			{
				
		  scenario.createNode(new GherkinKeyword("Given"), "user lands on registration page").fail("user doesnot lands on incorrect url page").addScreenCaptureFromPath(captureScreenshot("reg", driver));
				
			}
		}
	    

	@When("user enter valid username and mobile number")
	public void user_enter_valid_username_and_mobile_number() throws ClassNotFoundException, IOException {
	
    	//email
 	 
    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

    sendInput(email, "bell466547@yopmail.com");
 //   Random rand = new Random();
 //  sendInput(email,"bell" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");
    String txtemail = email.getAttribute("value");
    System.out.println(txtemail);
    
if(txtemail.contains("bell466547@yopmail.com"))
	{
		 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").pass("user entered valid email credentials").addScreenCaptureFromPath(captureScreenshot("email", driver));
		
		}
	else
	{
			 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").fail("user entered invalid email credentials").addScreenCaptureFromPath(captureScreenshot("email", driver));
		
	}
	
	//mobile number
	
	WebElement mob = driver.findElement(By.xpath("//input[@name='mobile']"));
    sendInput(mob, "2563456895");
    String txtmob2 = mob.getAttribute("value");
    System.out.println(txtmob2);
    
if(txtmob2.equals("2563456895"))
	{
		 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").fail("user entered valid mobile number").addScreenCaptureFromPath(captureScreenshot("mob", driver));
		}
	else
	{
		scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").pass("user entered valid mobile number").addScreenCaptureFromPath(captureScreenshot("mob", driver));
		
	
    }
	    
	}

	@When("user  click submit button")
	public void user_click_submit_button() throws ClassNotFoundException, IOException, InterruptedException {
		 Thread.sleep(2000);

			WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
			btnclick(ele);
			if(ele.isDisplayed()) {
			scenario.createNode(new GherkinKeyword("And"), "user  click submit button").pass("user lands on dashboard screen successfully ").addScreenCaptureFromPath(captureScreenshot("dashboard", driver));
			}
			else {
				scenario.createNode(new GherkinKeyword("And"), "user  click submit button").fail("user failed to lands on dashboard screen ").addScreenCaptureFromPath(captureScreenshot("dashboard", driver));
			}
			
			
		
	}

	@Then("user should navigate to basic details page")
	public void user_should_navigate_to_basic_details_page() throws InterruptedException, ClassNotFoundException, IOException {
		 Thread.sleep(9000);

			WebElement ele = driver.findElement(By.xpath("//input[@formcontrolname='fullName']"));
			if(ele.isDisplayed()) {
			scenario.createNode(new GherkinKeyword("Then"), "user should navigate to basic details page").pass("user lands on basic details page").addScreenCaptureFromPath(captureScreenshot("dashboard56", driver));
			}
			else {
				scenario.createNode(new GherkinKeyword("Then"), "user should navigate to basic details page").fail("user doesnot lands on basic details page").addScreenCaptureFromPath(captureScreenshot("dashboard56", driver));
			}
		
	}
	//invalid cred
	@Given("user land on registration page")
	public void user_land_on_registration_page() throws ClassNotFoundException, IOException {
		
	   scenario = feature.createNode(new GherkinKeyword("Scenario") , "verifying user can register with invalid credentials");
             
		
		 browserlaunch("https://test.folloit.com/login");
		WebElement home = driver.findElement(By.xpath("//u[text()='Back to Home Page']"));
		btnclick(home);
		WebElement reg=driver.findElement(By.id("myCheck"));
		btnclick(reg);
		 String currentUrl = driver.getCurrentUrl(); 
		 System.out.println(currentUrl);
			
	   if(currentUrl.equals("https://test.folloit.com/home"))
			{
			  
			   scenario.createNode(new GherkinKeyword("Given"), "user lands on registration page").pass("user lands on registration page successfully").addScreenCaptureFromPath(captureScreenshot("reg1", driver));
			}
			else
			{
				
		  scenario.createNode(new GherkinKeyword("Given"), "user lands on registration page").fail("user doesnot lands on incorrect url page").addScreenCaptureFromPath(captureScreenshot("reg1", driver));
				
			}
		}
	    

	@When("user enter invalid username and mobile number")
	public void user_enter_invalid_username_and_mobile_number() throws ClassNotFoundException, IOException {
	
    	//email
 	 
    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

    sendInput(email, "bell466547yopmail.com");
 //   Random rand = new Random();
 //  sendInput(email,"bell" + rand.nextInt(1000) + rand.nextInt(1000) + "@yopmail.com");
    String txtemail1 = email.getAttribute("value");
    System.out.println(txtemail1);
    
if(txtemail1.contains("bell466547@yopmail.com"))
	{
		 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").fail("user entered valid email credentials").addScreenCaptureFromPath(captureScreenshot("email1", driver));
		
		}
	else
	{
			 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").pass("user entered invalid email credentials").addScreenCaptureFromPath(captureScreenshot("email1", driver));
		
	}
	
	//mobile number
	
	WebElement mob = driver.findElement(By.xpath("//input[@name='mobile']"));
    sendInput(mob, "562896531");
    String txtmob1 = mob.getAttribute("value");
    System.out.println(txtmob1);
    
if(txtmob1.equals("5628965315"))
	{
		 scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").fail("user entered valid mobile number").addScreenCaptureFromPath(captureScreenshot("mob1", driver));
		}
	else
	{
		scenario.createNode(new GherkinKeyword("When"), "user enter valid username and mobile number").pass("user entered invalid mobile number").addScreenCaptureFromPath(captureScreenshot("mob1", driver));
		
	
    }
	    
	}

	@When("user  clicks submit button")
	public void user_clicks_submit_button() throws ClassNotFoundException, IOException, InterruptedException {
		 Thread.sleep(2000);

			WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
			btnclick(ele);
			if(ele.isDisplayed()) {
			scenario.createNode(new GherkinKeyword("And"), "user  click submit button").pass("user lands on dashboard screen successfully ").addScreenCaptureFromPath(captureScreenshot("dashboard12", driver));
			}
			else {
				scenario.createNode(new GherkinKeyword("And"), "user  click submit button").fail("user failed to lands on dashboard screen ").addScreenCaptureFromPath(captureScreenshot("dashboard12", driver));
			}
			
			
		
	}

	@Then("user should not navigate to basic details page")
	public void user_should_not_navigate_to_basic_details_page() throws InterruptedException, ClassNotFoundException, IOException {
		 Thread.sleep(9000);

			WebElement elem = driver.findElement(By.xpath("//small[text()='Enter valid email address']"));
			if(elem.isDisplayed()) {
			scenario.createNode(new GherkinKeyword("Then"), "user should not navigate to basic details page").pass("user lands on basic details page").addScreenCaptureFromPath(captureScreenshot("dashboard1", driver));
			}
			else {
				scenario.createNode(new GherkinKeyword("Then"), "user should not navigate to basic details page").fail("user doesnot lands on basic details page").addScreenCaptureFromPath(captureScreenshot("dashboard1", driver));
			}
			 Baseclass.extent.flush();
	}
	




}
