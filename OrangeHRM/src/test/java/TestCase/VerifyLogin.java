package TestCase;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Test.TestBase;

import Pages.LoginPage;


public class VerifyLogin extends TestBase {


    @Test  
    public void login_details() throws InterruptedException{driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	
	driver.findElement(By.id("menu_directory_viewDirectory")).click();
	driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("AdminA");
	driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.id("searchDirectory_job_title")).click();
    driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).clear();
    driver.findElement(By.xpath("//input[@name='personal[txtEmpFirstName]']")).sendKeys("Mike");
    driver.findElement(By.xpath("//input[@name='personal[txtEmpMiddleName]']")).clear();
    driver.findElement(By.xpath("//input[@name='personal[txtEmpMiddleName]']")).sendKeys("Tyson");
    driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).clear();
    driver.findElement(By.xpath("//input[@name='personal[txtEmpLastName]']")).sendKeys("001");
    driver.findElement(By.xpath("//input[@name='personal[txtOtherID]']")).clear();
    driver.findElement(By.xpath("//input[@name='personal[txtOtherID]']")).sendKeys("456789257");
    driver.findElement(By.xpath("//a[contains(text(),'Contact Details')]")).click();
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    driver.findElement(By.xpath("//input[@name='contact[street1]']")).sendKeys("USA");
    driver.findElement(By.xpath("//input[@name='contact[street2]']")).sendKeys("512");
    driver.findElement(By.xpath("//input[@name='contact[city]']")).sendKeys("Vegas");  
    driver.findElement(By.xpath("//input[@name='contact[province]']")).sendKeys("XYZ");
    driver.findElement(By.xpath("//input[@name='contact[emp_zipcode]']")).sendKeys("98724");
    driver.findElement(By.xpath("//input[@name='contact[emp_hm_telephone]']")).sendKeys("32454712635113215");
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
    driver.findElement(By.xpath("//input[@id='btnAddAttachment']")).click();
//    driver.findElement(By.xpath("")).click();
    

    WebElement upload_file = driver.findElement(By.xpath("//input[@id='ufile']"));
//
    upload_file.sendKeys("C:/Users/Jaganpreet/Downloads/Test data for demo/pictures/bunny.gif");
// 
	driver.findElement(By.xpath("//textarea[@id='txtAttDesc']")).sendKeys("Hi Everyone");
//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 	driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click();
//	driver.findElement(By.xpath("attachmentsCheckAll")).click();
//	driver.findElement(By.xpath("//a[@class='editLink']")).click();
//	driver.findElement(By.xpath("//input[@id='btnDeleteAttachment']")).click();
	
	driver.findElement(By.xpath("//a[contains(@id,'menu_leave_viewLeaveModule')]")).click();
	driver.findElement(By.xpath("//img[contains(@class,'ui-datepicker-trigger')]")).click();
	
	
	
	String bookingdate = "21-November-2022";

    String[] temp = bookingdate.split("-");
    String date = temp[0];
    String month1 = temp[1];
    String year1 = temp[2];

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    while (true) {
        if (driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().split("\\ ")[0].equals(month1) && driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText().split("\\ ")[1].equals(year1)) {
            break;
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" "))).click();
            Thread.sleep(500);
        }
    }
		
//  driver.close();	 
	
   
    
    }

    
	
}
	class log extends LoginPage {
    	
    }
