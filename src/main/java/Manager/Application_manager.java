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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public interface Application_manager  {

    EventFiringWebDriver wd = System.getProperty("browser", BrowserType.CHROME)
            .equals(BrowserType.FIREFOX) ?
            new EventFiringWebDriver(new FirefoxDriver()) :
            new EventFiringWebDriver(new ChromeDriver());
Logger logger=LoggerFactory.getLogger(Application_manager.class);
    Properties properties = new Properties();



//WebDriver wd=new ChromeDriver();

    default void init() throws IOException {
        String target = System.getProperty("target", "preproduction");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        String link = properties.getProperty("webBaseUrl");
        wd.navigate().to(link);
            wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            wd.register(new WDLISTENER());
        }



    default void tearDown()
        {
        wd.quit();



logger.info("Test completed");
    }

    default String getEmail(){
        return properties.getProperty("webemail");
    }
    default String getPassword() {
        return properties.getProperty("webpassword");
    }
}
