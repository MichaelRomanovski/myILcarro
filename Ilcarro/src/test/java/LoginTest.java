
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

    @BeforeMethod
    public void precondition(){

        if(isLogged()){

            logOut();
        }

    }

@Test(groups = {"positive"})
    public void PositiveLoginTest() {
User user= User.builder()
        .email("miharomanovski1023@gmail.com")
        .password("dtlmvfr403218@M")

        .build();
openLog_inForm();
fill_Login_Email_Password_fields(user);
submit_Login();
Assert.assertTrue(isElementPresent(By.xpath("//h2[@class='message']")));
logOut();

}



     @Test(groups = {"negative"})
    public void negativeLoginTest(){

        User user= User.builder().email("miharomanovski1023gmail.com").password("dtlmvfr403218@M")

                .build();


         openLog_inForm();
         fill_Login_Email_Password_fields(user);

pause(3000);
         Assert.assertTrue(isElementPresent(By.xpath("//div[@class='ng-star-inserted']")));

     }






}
