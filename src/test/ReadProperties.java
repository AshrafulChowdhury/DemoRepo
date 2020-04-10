package test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadProperties {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver;	
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Mehir\\eclipse-workspace\\TestNGTutorial\\config.properties");
		prop.load(ip);
		System.out.println("browser");
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehir\\eclipse-workspace\\JetBlue\\Driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		else if(browserName.equals("FireFox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
			
		}
		else {
			System.out.println("");
			
		}
	}

}
