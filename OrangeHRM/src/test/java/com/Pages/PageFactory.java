package com.Pages;

import Pages.AdminPage;
import Pages.LoginPage;

public class PageFactory {
    private LoginPage obj;
    private AdminPage obje;


    public LoginPage getLogIn() {
        if (obj == null) {
            obj = new LoginPage(null);
        }
        return obj;
    }
    public AdminPage getAdmin(){
        if (obje == null){
            obje = new AdminPage(null);
        }
        return obje;
    }

	}
	
	
	

