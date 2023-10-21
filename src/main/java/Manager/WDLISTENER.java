package Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WDLISTENER extends AbstractWebDriverEventListener implements HelperBase {

    public WDLISTENER() {
        super();
    }


    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        super.onException(throwable, driver);
        logger.info("Something went wrong");
        logger.info(throwable.getMessage());
        logger.info(throwable.fillInStackTrace().toString());
        int i=(int)System.currentTimeMillis()/1000%3600;
        String link="src/test/screenshots/screenshot-" + i + ".png";
        takeScreenShot(link);
        logger.info("Here is the path to screenshot with error>" + link);



    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        super.beforeFindBy(by, element, driver);
        logger.info("Start searching element by locator "  +by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        super.afterFindBy(by, element, driver);
        logger.info(" Element by locator "  +by +" is found");

    }



}
