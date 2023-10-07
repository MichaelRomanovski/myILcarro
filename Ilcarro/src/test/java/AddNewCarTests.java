import Models.Car;
import Models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewCarTests extends TestBase {

    @BeforeMethod
    public void precondition2(){

        if(isLogged()==false){
            Login(
                    new User().withEmail("miharomanovski1023@gmail.com").WithPassword("dtlmvfr403218@M")
            );
        }

    }
@Test
public void addNewCarPossitiveInput()
{
    int i=(int)(System.currentTimeMillis()/1000)%3600;
    Car car= Car.builder()
            .location("Tel Aviv")
            .manufacturer("KIA")
            .model("Mercedes")
            .year("2020")
            .fuel("Petrol")
            .seats("5")
            .carClass("B")
            .carRegNumber("100-200"+i)
            .price("245")
            .about("New car")
            .build();

openCarForm();
fillcarForm(car);
clickSubmit();

}






}
