import Models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeLoginTest extends TestBase {
    @BeforeMethod(alwaysRun = true)
    public void precondition(){

        if(isLogged()){

            logOut();
        }

    }


    @Test(groups = {"smoke","negative"})
    public void negativeLoginTest(User user){
         User.builder().email("miharomanovski1023gmail.com").password("dtlmvfr403218@M").build();
        openLog_inForm();
        fill_Login_Email_Password_fields(getEmail(),getPassword());

        pause(3000);
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='ng-star-inserted']")));

    }

    @Test(groups = {"smoke","negative"})
    public void negativeLoginTestWithProperties(){
        openLog_inForm();
        fill_Login_Email_Password_fields(getEmail(),getPassword());

        pause(3000);
        Assert.assertTrue(isElementPresent(By.xpath("//div[@class='ng-star-inserted']")));

    }



}
