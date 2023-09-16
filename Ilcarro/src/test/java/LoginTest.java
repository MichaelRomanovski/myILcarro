
import Models.User;
import org.openqa.selenium.By;
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
openLog_inForm();
fill_Login_Email_Password_fields("miharomanovski1023@gmail.com","dtlmvfr403218@M");

submit_Login_and_ok_button();
    pause(5000);


}

    @Test
    public void PositiveLoginTestModel()
    {
        User user=new User().withEmail("miharomanovski1023@gmail.com")
                .WithPassword("dtlmvfr403218@M");

        openLog_inForm();
        fill_Login_Email_Password_fields(user.getEmail(),user.getPassword());

        submit_Login_and_ok_button();
        pause(5000);


    }








}
