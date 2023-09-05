import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase
{




@Test
    public void PositiveLoginTest(){
openLog_inForm();
fillEmail_Password_fields("miharomanovski1023@gmail.com","dtlmvfr403218@M");
    pause(3000);
submit_Login();
    Assert.assertTrue(isElementPresent(By.xpath("//*[.='Logged in']")));
logOut();



    }












}
