import Manager.NGlistener;
import Models.User;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(NGlistener.class)
public class RegistrationTests extends TestBase
{




    @Test
    public void registrationPositive(User user){

    //int i=(int)(System.currentTimeMillis()/1000)%3600;


    openRegistrationform();
    registration_fields(user);
clickcheckboxVariant3();
Registration_Button();
pause(3000);
isRegistered();
Ok_registration_button();
logOut();
}

@Test
    public void registrationNegativeTests_model(User user){


openRegistrationform();
registration_fields(user);
clickcheckbox();
Assert.assertTrue(wrongEmail());
pause(3000);
clickcheckbox();






openRegistrationform();
    registration_fields(user);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);
clickcheckbox();





openRegistrationform();
    registration_fields(user);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);
clickcheckbox();

openRegistrationform();
    registration_fields(user);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);
clickcheckbox();














}







}
