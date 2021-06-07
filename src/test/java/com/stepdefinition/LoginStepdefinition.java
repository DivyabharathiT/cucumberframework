
	package com.stepdefinition;

	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
    import org.testng.Assert;
   import org.testng.annotations.Listeners;
   import org.testng.annotations.Test;

  import com.aventstack.extentreports.ExtentTest;
  import com.aventstack.extentreports.GherkinKeyword;
  import com.aventstack.extentreports.Status;
 import com.aventstack.extentreports.model.Log;
 import com.base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


	


	public class LoginStepdefinition extends Baseclass {
	static	ExtentTest feature;
	static	ExtentTest scenario;
	//valid
		
		    @Given("user is on follo login  page")
		    
			public void user_is_on_follo_login_page() throws IOException, ClassNotFoundException {
		    	report("aym report");
		    	
		    feature = extent.createTest(new GherkinKeyword("Feature"), "verify follo login details");
		   scenario = feature.createNode(new GherkinKeyword("Scenario") , "verifying login details with vaild credentails");
                 
			
			 browserlaunch("https://test.folloit.com/login");
			 String currentUrl = driver.getCurrentUrl(); 
			 System.out.println(currentUrl);
				
		   if(currentUrl.equals("https://test.folloit.com/login"))
				{
				  
				   scenario.createNode(new GherkinKeyword("Given"), "user is on follo login  page").pass("user lands on login page successfully").addScreenCaptureFromPath(captureScreenshot("launch", driver));
				}
				else
				{
					
			  scenario.createNode(new GherkinKeyword("Given"), "user is on follo login  page").fail("user doesnot on incorrect url page").addScreenCaptureFromPath(captureScreenshot("launch", driver));
					
				}
			}

		    @When("i  enter username and password")
		    
			public void i_enter_username_and_password() throws IOException, ClassNotFoundException {
		   	
		    	//username
		 	 
		    WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
		    sendInput(user, "accpa01@yopmail.com");
		    String email = user.getAttribute("value");
		    System.out.println(email);
		    
		if(email.equals("accpa01@yopmail.com"))
			{
				 scenario.createNode(new GherkinKeyword("When"), "i  enter username and password").pass("user entered valid username credentials").addScreenCaptureFromPath(captureScreenshot("user credentials", driver));
				
				}
			else
			{
					 scenario.createNode(new GherkinKeyword("When"), "i  enter username and password").fail("user entered invalid username credentials").addScreenCaptureFromPath(captureScreenshot("user credentials", driver));
				
			}
			
			//password
			
			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		    sendInput(password, "Test@123");
		    String txtpass = password.getAttribute("value");
		    System.out.println(txtpass);
		    
		if(txtpass.equals("Test@123"))
			{
				 scenario.createNode(new GherkinKeyword("When"), "i  enter username and password").pass("user entered valid password credentials").addScreenCaptureFromPath(captureScreenshot("user credentials", driver));
				}
			else
			{
				scenario.createNode(new GherkinKeyword("When"), "i  enter username and password").fail("user entered invalid password credentials").addScreenCaptureFromPath(captureScreenshot("user credentials", driver));
				
			}
		    }
		    @When("i  click login button")
		    
			public void i_click_login_button() throws IOException, ClassNotFoundException {
		    	
		    WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
			btnclick(click);
			if(click.isDisplayed()) {
			 scenario.createNode(new GherkinKeyword("And"), "i  click login button").pass("user clicks login button ").addScreenCaptureFromPath(captureScreenshot("login button", driver));
			
				}
			else {
				 scenario.createNode(new GherkinKeyword("And"), "i  click login button").fail("user can't able to click login button ").addScreenCaptureFromPath(captureScreenshot("login button", driver));
				}
			}

		    @Then("i should able to login sucessfully")
		    
			public void i_should_able_to_login_sucessfully() throws InterruptedException, IOException, ClassNotFoundException {
		    	
		    Thread.sleep(9000);

			WebElement ele = driver.findElement(By.xpath("//span[text()=' Settings ']"));
			if(ele.isDisplayed()) {
			scenario.createNode(new GherkinKeyword("Then"), "i should able to login sucessfully").pass("user lands on dashboard screen successfully ").addScreenCaptureFromPath(captureScreenshot("dashboard", driver));
			}
			else {
				scenario.createNode(new GherkinKeyword("Then"), "i should able to login sucessfully").fail("user failed to lands on dashboard screen ").addScreenCaptureFromPath(captureScreenshot("dashboard", driver));
			}
			
			
		}
		    //invalid  
		    
		   @Given("user is on login page")
		  		    
		  			public void user_is_on_login_page() throws IOException, ClassNotFoundException {
		  		    
		  		    	
		  		   
		  		   scenario = feature.createNode(new GherkinKeyword("Scenario") , "verifying login details with invaild credentails");
		                   
		  			
		  			 browserlaunch("https://test.folloit.com/login");
		  			 String currentUrl = driver.getCurrentUrl(); 
		  			 System.out.println(currentUrl);
		  				
		  		   if(currentUrl.equals("https://test.folloit.com/login"))
		  				{
		  				  
		  				   scenario.createNode(new GherkinKeyword("Given"), "user is on login  page").pass("user lands on login page successfully").addScreenCaptureFromPath(captureScreenshot("launch1", driver));
		  				}
		  				else
		  				{
		  					
		  			  scenario.createNode(new GherkinKeyword("Given"), "user is not on login  page").fail("user doesnot login on correct url page").addScreenCaptureFromPath(captureScreenshot("launch1", driver));
		  					
		  				}
		  			}

		  		    @When("i  enter invalid username and password")
		  		    
		  			public void i_enter_invalid_username_and_password() throws IOException, ClassNotFoundException {
		  		   	
		  		    	//username
		  		 	 
		  		    WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
		  		    sendInput(user, "accpa01yopmail.com");
		  		    String email = user.getAttribute("value");
		  		    System.out.println(email);
		  		    
		  		if(email.equals("accpa01@yopmail.com"))
		  			{
		  				 scenario.createNode(new GherkinKeyword("When"), "i  enter valid  username and password").fail("user entered valid username credentials").addScreenCaptureFromPath(captureScreenshot("user invalid credentials", driver));
		  				
		  				}
		  			else
		  			{
		  					 scenario.createNode(new GherkinKeyword("When"), "i  enter invalid  username and password").pass("user entered invalid username credentials").addScreenCaptureFromPath(captureScreenshot("user credentials", driver));
		  				
		  			}
		  			
		  			//password
		  			
		  			WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		  		    sendInput(password, "Test123");
		  		    String txtpass = password.getAttribute("value");
		  		    System.out.println(txtpass);
		  		    
		  		if(txtpass.equals("Test@123"))
		  			{
		  				 scenario.createNode(new GherkinKeyword("When"), "i  enter username and password").fail("user entered valid password credentials").addScreenCaptureFromPath(captureScreenshot("user credentials1", driver));
		  				}
		  			else
		  			{
		  				scenario.createNode(new GherkinKeyword("When"), "i  enter invalid  username and password").pass("user entered invalid password credentials").addScreenCaptureFromPath(captureScreenshot("user credentials1", driver));
		  				
		  			}
		  		    }
		  		    
		  		    @When("i  click log button")
		  		    
		  			public void i_click_log_button() throws IOException, ClassNotFoundException {
		  		    	
		  		    WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		  			btnclick(click);
		  			if(click.isDisplayed()) {
		  			 scenario.createNode(new GherkinKeyword("And"), "i  click login button").pass("user clicks login button ").addScreenCaptureFromPath(captureScreenshot("logn btn",driver));
		  			
		  		}
		  			 
		  				else {
		  					 scenario.createNode(new GherkinKeyword("And"), "i  click login button").fail("user can't able to click login button ").addScreenCaptureFromPath(captureScreenshot("login button", driver));
		  					}
		  				}

		  			    @Then("i should not able to login sucessfully")
		  			    
		  				public void i_should_not_able_to_login_sucessfully() throws InterruptedException, IOException, ClassNotFoundException {
		  			    	
		  			    Thread.sleep(9000);
		  			 
		 			 String currentUrl = driver.getCurrentUrl(); 
		 			 System.out.println(currentUrl);
		 				
		 		   if(currentUrl.equals("https://test.folloit.com/login"))
		 				{
		 			

		  			//	WebElement ele = driver.findElement(By.xpath("//span[text()=' Settings ']"));
		  			//	if(ele.isDisplayed()) {
		  				scenario.createNode(new GherkinKeyword("Then"), "i should not able to login sucessfully").pass("user failed to lands on dashboard screen ").addScreenCaptureFromPath(captureScreenshot("dashboard", driver));
		  				}
		  				else {
		  					scenario.createNode(new GherkinKeyword("Then"), "i should  able to login sucessfully").fail("user lands on dashboard screen ").addScreenCaptureFromPath(captureScreenshot("dashboard1", driver));
		  				}
		  				
		  			//  Baseclass.extent.flush();
		  			}
		  		
		  	
	

	}
