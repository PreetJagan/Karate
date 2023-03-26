package pageFactory;

import pages.AddUser;
import pages.LoginPage;

public class ObjectFactory {

    private LoginPage loginpage ;
    private AddUser addUser;

    public LoginPage getloginpage(){
    if(loginpage==null){
        loginpage = new LoginPage();
    }
    return loginpage;
    }

    public AddUser getAddUser(){
        if(addUser==null){
            addUser = new AddUser();
        }
        return addUser;
    }


}
