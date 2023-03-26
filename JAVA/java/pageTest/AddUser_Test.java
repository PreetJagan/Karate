package pageTest;

import base.TestBase;
import org.testng.annotations.Test;

public class AddUser_Test extends TestBase {

    @Test(priority = 1)
    public void clickOnAdduser() throws InterruptedException {
        obj.getloginpage().loginPage("Admin","Qedge123!@#");
        obj.getAddUser().clickOnAdduser();




    }
    }
