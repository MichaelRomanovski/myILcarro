
import Manager.HelperBase;
import Manager.NGlistener;
import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(NGlistener.class)

public class LoginTest extends TestBase
{

    @BeforeMethod()
    public void precondition(){

        if(isLogged()){

            logOut();
        }

    }

@Test(groups = {"positive","smoke"})
    public void PositiveLoginTestwithProperties() {

openLog_inForm();
fill_Login_Email_Password_fields(getEmail(),getPassword());
submit_Login();
pause(5000);
Assert.assertTrue(isElementPresent(By.xpath("//h2[@class='message']")));

}

}
