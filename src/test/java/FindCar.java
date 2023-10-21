import Manager.HelperCar;
import Manager.NGlistener;
import Models.Car;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(NGlistener.class)
public class FindCar extends TestBase {

    @Test

    public void FindCar() {


        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        Car car = Car.builder().
                Location_city("Tel Aviv")
                .build();
openFindCar();
findCar(car);


    }

}
