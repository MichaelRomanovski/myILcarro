import Models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeRegistration extends TestBase{
    @Test(groups = "{negative}")
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
