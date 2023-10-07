
import Manager.HelperBase;
import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends TestBase
{

    @BeforeMethod
    public void precondition(){

        if(isLogged()){

            logOut();
        }

    }

@Test
    public void PositiveLoginTest()
{
User user=new User();
openLog_inForm();
fill_Login_Email_Password_fields(user.withEmail("miharomanovski1023@gmail.com").WithPassword("dtlmvfr403218@M"));
submit_Login();
Assert.assertTrue(isElementPresent(By.xpath("//h2[@class='message']")));
logOut();

}

    @Test
    public void PositiveLoginTestModel()
    {

User user=new User();
        openLog_inForm();
        fill_Login_Email_Password_fields(user.withEmail("miharomanovski1023gmail.com").WithPassword("dtlmvfr403218@M"));
        submit_Login();
        pause(3000);
logOut();

    }

     @Test
    public void negativeLoginTest(){

         User user=new User().withEmail("miharomanovski1023gmail.com")

                 .WithPassword("dtlmvfr403218@M");
         openLog_inForm();
         fill_Login_Email_Password_fields(user.getEmail(),user.getPassword());
pause(3000);
         Assert.assertTrue(isElementPresent(By.xpath("//div[@class='ng-star-inserted']")));

     }






}
