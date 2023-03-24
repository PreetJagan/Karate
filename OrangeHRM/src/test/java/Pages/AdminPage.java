package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.Pages.PageFactory;

public class AdminPage extends PageFactory {
	
	WebDriver driver;
	

	
	 public AdminPage(WebDriver Adriver)
	 {
		 this.driver=Adriver;
		 
	 }
	 
	 @FindBy(xpath = "//b[contains(text(),'Admin')]")
	 private WebElement adminpage;
	 
	 public AdminPage(){
	        org.openqa.selenium.support.PageFactory.initElements(driver, this);
	    }
	 
	 public void AdminsPage()
	    
	    {
	    	
		 adminpage.click();
	    	
	    }	
	
}
