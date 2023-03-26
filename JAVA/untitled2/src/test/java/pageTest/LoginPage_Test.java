package pageTest;

import base.TestBase;
import org.testng.annotations.Test;

public class LoginPage_Test extends TestBase {

    @Test
    public void verifyLoginPage() throws InterruptedException{
    obj.getloginpage().loginPage();
    }

}
