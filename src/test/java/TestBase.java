import Manager.*;
import Models.Car;
import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase   implements HelperUser
        , HelperCar


{





@BeforeSuite(alwaysRun = true)
public void setup() throws IOException {

    init();

}

    @AfterSuite(alwaysRun = true)
    public  void close_Browser(){
//pause(5000);
   tearDown();

    }



}
