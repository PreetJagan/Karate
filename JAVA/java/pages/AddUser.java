package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AddUser extends TestBase {
    @FindBy(xpath = "//input[@name='btnAdd']")
    WebElement adduser;

    @FindBy(xpath = "//*[contains(text(),'Admin')]")
    WebElement Admin ;

    @FindBy(xpath = "//select[@class='formSelect']")
    WebElement Role ;

    @FindBy(xpath = "//*[contains(text(),'Admin')]")
    WebElement role;


    @FindBy(xpath = "//input[@class='formInputText']")
    WebElement usname;

    @FindBy(xpath = "(//input[@class='formInputText password'])[1]")
    WebElement uspass;

    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement conpass;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement save;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement empname;

    @FindBy(xpath = "//div[contains(text(),'Successfully Saved')]")
    WebElement successfullySaved;

    @FindBy(xpath = "//input[@name='searchSystemUser[userName]']")
    WebElement search;

    @FindBy(xpath = "//input[@class='searchbutton']")
    WebElement click;

    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement reset;

    @FindBy(linkText = "//a[contains(text(),'Aadhya')]")
    WebElement cl;

    @FindBy(xpath = "//input[@class='addbutton']")
    WebElement editbutton;


    public AddUser() {
        PageFactory.initElements(driver, this);
    }


    public void clickOnAdduser() throws InterruptedException {
        Admin.click();

        adduser.click();

        Role.click();

   //     role.click();

        usname.sendKeys("T1edtts111hy00001");

        uspass.sendKeys("aQ--*12345678@@");
        conpass.sendKeys("aQ--*12345678@@");
        Thread.sleep(500);

        empname.sendKeys("Kranthi Maga");

        save.click();
        Thread.sleep(2000);
        String expectedText = driver.findElement(By.xpath("//div[@class='message success fadable']")).getText();
        System.out.println("Text of Successfully Saved message : "+expectedText);

        SoftAssert sf = new SoftAssert();
        sf.assertEquals("Successfully Saved",expectedText,"Title Does Not Match");

      //  driver.navigate().to("https://www.google.co.in/");
        Admin.click();
        Thread.sleep(5000);
        search.sendKeys("Admin");
        click.click();
        reset.click();
        Thread.sleep(3000);
        search.sendKeys("Aadhya");
        click.click();
        Thread.sleep(6000);
        cl.click();
        Thread.sleep(3000);
        editbutton.click();
        Thread.sleep(3000);



}

}

