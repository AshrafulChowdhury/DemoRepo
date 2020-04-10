package test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		OpenBrowser();
		Screenshot();
		NumberofiFrame();
		BrowserClose();
		//iFrameTest();
		
	}

	
	  public static void OpenBrowser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehir\\eclipse-workspace\\JetBlue\\Driver\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.saksfifthavenue.com");
	      	    		  String url = driver.getCurrentUrl();
	      if(url.equalsIgnoreCase("https://www.saksfifthavenue.com/Entry.jsp")){
				System.out.println("Home page Displayed Successfully");
			}else {
				System.out.println("Home page not displayed");
			}  
	  }

	  public static void Screenshot() throws IOException {
		  //TAke screenshot and store it as a file format.
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  //Copy the screenshot to desired location using copy file method.
		  FileUtils.copyFile(src,new File("C:/Users/Mehir/Desktop/screen.png"));
		  }
	  
	  public static void  NumberofiFrame() {
		  int numofFrame = driver.findElements(By.tagName("iframe")).size();
		  System.out.println("Number of Frame Found:"+ numofFrame);
		  for(int i=1;i<=numofFrame;i++){
			  System.out.println("Switch to Frame : " +i);
		  }
			   }
		  public static void  BrowserClose() {
			  driver.close();
			  System.out.println("Browser Close Successfully");
		  }
  
		  


	  
	  
		  
}
