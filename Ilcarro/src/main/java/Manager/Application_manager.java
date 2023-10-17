package Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public interface Application_manager  {

    EventFiringWebDriver wd = new EventFiringWebDriver(new ChromeDriver());

    Logger logger = LoggerFactory.getLogger(Application_manager.class);

    String browser =System.getProperty("browser", BrowserType.FIREFOX);





//WebDriver wd=new ChromeDriver();

    default void init() {
        String link = "https://ilcarro.web.app/search";
            wd.navigate().to(link);
            wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            wd.register(new WDLISTENER());
        }



    default void tearDown()
        {
        wd.quit();



logger.info("Test completed");
    }




}
