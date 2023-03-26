package pageFactory;

import pages.LoginPage;

public class ObjectFactory {

    private LoginPage loginpage ;

    public LoginPage getloginpage(){
    if(loginpage==null){
        loginpage = new LoginPage();
    }
    return loginpage;
    }


}
