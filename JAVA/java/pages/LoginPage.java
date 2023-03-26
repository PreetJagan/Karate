package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(xpath ="//input[@name='txtUsername']")
    WebElement username;

    @FindBy(xpath="//input[@name='txtPassword']")
    WebElement passwrd;

    @FindBy(xpath = "//input[@name='Submit']")
    WebElement submitBtn ;

    @FindBy(xpath = "//*[contains(text(),'Admin')]")
    WebElement Admin ;

    @FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
    WebElement Adminname;

    @FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
    WebElement Admintype;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void loginPage(String user, String pass) throws InterruptedException {
        username.sendKeys(user);
        passwrd.sendKeys(pass);

        submitBtn.click();


    }
            public void clickOnAdmin() throws InterruptedException {
            Admin.click();

            Adminname.sendKeys("Mark");

            Admintype.click();

            }

}
