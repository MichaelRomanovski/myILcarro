import Manager.Application_manager;
import Manager.HelperBase;
import Manager.HelperCar;
import Manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase implements HelperUser, HelperCar

{

    WebDriver wd;

@BeforeSuite
public void setup(){
pause(5000);
    init();

}

    @AfterSuite
    public  void close(){
//pause(5000);
   // tearDown();

    }




}
