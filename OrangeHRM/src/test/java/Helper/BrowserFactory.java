package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	static WebDriver driver;
	protected static PageFactory pageFactory;

	
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		pageFactory = new PageFactory();
		WebDriverManager.chromedriver().setup();
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
//		else (browserName.equalsIgnoreCase("Opera"))
//		{
//			driver=new OperaDriver();
//			
//		}
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		return driver;
		
	}



	
	}


	


