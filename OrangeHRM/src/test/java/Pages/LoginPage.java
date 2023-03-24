package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Pages.PageFactory;





public class LoginPage extends PageFactory {
	
	 WebDriver driver;
	 

	 public LoginPage(WebDriver Cdriver)
	 {
		 this.driver=Cdriver;
		 
	 }
	 

	    @FindBy(name="txtUsername")
	    private WebElement enterUsername;

	    @FindBy(name="txtPassword")
	    private WebElement enterPassword;

	    @FindBy(name="Submit")
	    private WebElement LoginButton;

	    @FindBy(id="welcome")
	    private WebElement Profile;
	    
	    @FindBy(partialLinkText="Logout")
	    private WebElement logout;
	    
	    public LoginPage(){
	      //  PageFactory.initElements(driver, this);
	    }


	    public void login_HRM(String Admin ,String admin123)
	    {
	    	enterUsername.sendKeys(Admin);
	    	enterPassword.sendKeys(admin123);
	    	LoginButton.click();
	    }
	    
	    }

