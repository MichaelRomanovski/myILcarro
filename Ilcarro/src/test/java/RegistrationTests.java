import Models.User;
import lombok.Getter;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase
{

            User user=new User()
                    .withName("Andrey")
                    .withLastName("Polakov")
                    .withEmail("andres@def.com")
                    .WithPassword("Dtlmvfr403218@");


    @Test
    public void registrationPositive(){

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
    public void registrationNegativeTests_model(){
User user1=new User()
        .withName("Pavel")
        .withLastName("Polakov")
        .withEmail("andrdef.com")
        .WithPassword("Dtlmvfr403218@");

openRegistrationform();
registration_fields(user1);
clickcheckbox();
Assert.assertTrue(wrongEmail());
pause(3000);
clickcheckbox();





user1.withName("Pavel")
        .withLastName("Polakov")
        .withEmail("andrdef@.")
        .WithPassword("Dtlmvfr403218@");
openRegistrationform();
    registration_fields(user1);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);
clickcheckbox();





user1.withName("Pavel")
        .withLastName("Polakov")
        .withEmail("andrdef@com")
        .WithPassword("Dtlmvfr403218@");
openRegistrationform();
    registration_fields(user1);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);





user1.withName("Pavel")
        .withLastName("Polakov")
        .withEmail("andrdef@com")
        .WithPassword("Dtlmvfr403218@");
openRegistrationform();
    registration_fields(user1);
    pause(1000);
clickcheckbox();

    Assert.assertTrue(wrongEmail());
    pause(3000);















}







}
