import Manager.NGlistener;
import Models.Car;
import Models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(NGlistener.class)
public class AddNewCarTests extends TestBase {

    @BeforeMethod()
    public void precondition(){

        if(isLogged()==false){
            Login(
                     User.builder().email(getEmail()).password(getPassword())


                             .build()
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
            .carRegNumber("200-500"+i)
            .price("245")
            .about("New car")
            .build();

openCarForm();
fillcarForm(car);
clickSubmit();

}






}
