package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseChromeBrowser { 
	 public static WebDriver driver;

@Test	 
	    public static void Setup(){
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	     
	        driver.get("https://opensource-demo.orangehrmlive.com");
	    }
	    public static void teardown(){
	        driver.close();

	    }

}
 