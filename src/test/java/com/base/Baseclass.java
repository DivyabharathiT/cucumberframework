package com.base;

   import java.io.File;


	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Baseclass {
		
	

		public static WebDriver driver;
		public 	static ExtentReports extent;
		
		public static void browserlaunch(String url) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			}
		
		public void sendInput(WebElement e,String text) 
		{
			e.sendKeys(text);

		}
		public static void btnclick(WebElement e) {
			e.click();

		}
		public static String captureScreenshot(String name,WebDriver driver) throws IOException {
			TakesScreenshot screen=(TakesScreenshot)driver;
			File src = screen.getScreenshotAs(OutputType.FILE);
			String dest="C:\\Users\\Divya Bharathi\\Desktop\\workspace\\Projcucumber\\"+ name +".png";
			File target =new File(dest);
			FileUtils.copyFile(src, target);
			return dest;
			
			}
			
			public static void report(String name) {
				String path=System.getProperty("user.dir")+"\\ExtentReports\\" + name +".html";
				ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
				reporter.config().setDocumentTitle("TestReport");
				reporter.config().setReportName("follo Test");
				extent =new ExtentReports();
				extent.attachReporter(reporter);
				


		}

	}



