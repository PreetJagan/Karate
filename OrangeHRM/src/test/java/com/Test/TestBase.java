package com.Test;

import com.Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


import java.time.Duration;

import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    protected static PageFactory pageFactory;

    public TestBase(){

    }
    @BeforeClass
    public void launch_browser() throws Exception {
            pageFactory = new PageFactory();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
        
}