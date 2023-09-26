package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public interface Application_manager
{



    WebDriver wd=new ChromeDriver();



    default void init(){
       // wd=new ChromeDriver();

        wd.navigate().to("https://ilcarro.web.app/search");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       // user=new HelperUser(wd);




    }






    default void tearDown()
    {
        wd.quit();

    }




}
