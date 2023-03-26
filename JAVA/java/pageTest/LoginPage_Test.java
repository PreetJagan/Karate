package pageTest;

import base.TestBase;
import org.testng.annotations.Test;

public class LoginPage_Test extends TestBase {

    @Test(priority = 1)
    public void verifyLoginPage() throws InterruptedException{
    obj.getloginpage().loginPage("Admin","Qedge123!@#");
        obj.getloginpage().clickOnAdmin();

    }


}
