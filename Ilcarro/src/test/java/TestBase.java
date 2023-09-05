import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestBase

{

    WebDriver wd;

@BeforeMethod

public void init(){

           wd=new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/search");
wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }


public void openLog_inForm()
{
    wd.findElement(By.xpath("//*[@href='/login?url=%2Fsearch']")).click();

}


public void fillEmail_Password_fields(String email,String password)
{
  //  WebElement my_email = wd.findElement(By.xpath("//*[@id='email']"));
//my_email.click();
//my_email.clear();
//my_email.sendKeys(email);

type(By.xpath("//*[@id='email']"),email);
type(By.xpath("//*[@id='password']"),password);
    //WebElement my_password = wd.findElement(By.xpath("//*[@id='password']"));
    //my_password.click();
    //  my_password.clear();
    //my_password.sendKeys(password);
}



public void submit_Login_Registration()
{
wd.findElement(By.xpath("//*//*[@type='submit']")).click();
}


public void click(By locator)
{

    wd.findElement(locator).click();

}
public void type(By locator,String text){
    WebElement element = wd.findElement(locator);
    element.click();
element.clear();
element.sendKeys(text);

}
    public boolean isElementPresent(By locator)
    {
        return wd.findElements(locator).size()>0;

    }




    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



 //   @AfterMethod
   // public void close(){

     //  wd.quit();


    //}

}
