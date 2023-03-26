package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pageFactory.ObjectFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {


    public static Properties prop ;
    public static WebDriver driver ;
    protected static ObjectFactory obj ;

    public TestBase()  {
        try{
            prop = new Properties();
            FileInputStream ip = new FileInputStream("System.getProperty(user.dir)+//IdeaProjects//untitled2//src//test//java//config//Config.properties");
            prop.load(ip);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    @BeforeClass
    public void intialization()  {

        obj = new ObjectFactory();
//        String browsername = prop.getProperty("browser");
//        if(browsername.equals("chrome")){
            driver =    WebDriverManager.chromedriver().create();

//        }else if(browsername.equals("FireFox")){
//            driver =    WebDriverManager.firefoxdriver().create();
//        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
    }

}
