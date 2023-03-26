package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath ="//input[@name='username']")
    WebElement username;

    @FindBy(xpath="//input[@name='password']")
    WebElement passwrd;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement submitBtn ;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginPage() throws InterruptedException {
        username.sendKeys("Admin");
        passwrd.sendKeys("admin123");
        Thread.sleep(5000);
        submitBtn.click();

    }


}
