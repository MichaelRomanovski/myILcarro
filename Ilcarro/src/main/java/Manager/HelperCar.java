package Manager;

import Models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface HelperCar extends HelperBase
{

    default void clickSerialNumber(String text){
        Rectangle rect=wd.findElement(By.id("serialNumber")).getRect();
     int x=rect.getX()+rect.getWidth()*7/11;
     int y=rect.getY()+rect.getHeight()/2;

        Actions action=new Actions(wd);
        action.moveByOffset(x, y).click().perform();
    }
default void openCarForm(){
    pause(5000);
    click(By.xpath("//a[.=' Let the car work ']"));

}

default void fillcarForm(Car car){
    if(isCarFormPresent()==false){
        return;
    }
    typeLocation(car.getLocation());
    type(By.id("make"),car.getManufacturer());
    type(By.id("model"),car.getModel());
    type(By.id("year"),car.getYear());

    type(By.id("seats"),car.getSeats());
    type(By.id("class"),car.getCarClass());
    //type(By.id("serialNumber"),car.getCarRegNumber());
    clickSerialNumber(car.getCarRegNumber());
    type(By.id("price"), car.getPrice());
    type(By.id("about"), car.getAbout());

}
default void typeLocation(String location){
    pause(3000);
    type(By.id("pickUpPlace"), location);
    click(By.className("pac-item"));
}




default boolean isCarFormPresent(){

    return new WebDriverWait(wd,18)
            .until(ExpectedConditions
                    .textToBePresentInElement(wd.findElement(By.cssSelector("h2")),"details"));


}


default void clickSubmit(){
        click(By.xpath("//button[@type='submit']"));



}


}
