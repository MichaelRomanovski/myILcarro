package Manager;

import Models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface HelperCar extends HelperBase
{

    default void clickSerialNumber(String text){
       // Rectangle rect=wd.findElement(By.id("serialNumber")).getRect();

     //int x=rect.getX()+rect.getWidth()*7/8;
   //  int y=rect.getY()+rect.getHeight()/2;
WebElement element =wd.findElement(By.id("serialNumber"));

        Actions action=new Actions(wd);
        //action.moveByOffset(x, y).click().sendKeys(text).perform();
        //wd.switchTo().activeElement().sendKeys(text);
        action.moveToElement(element).click().perform();
        element.clear();
        element.sendKeys(text);
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
select(By.id("fuel"),car.getFuel());
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
default void typeLocationCity(String location){
    pause(3000);
    type(By.xpath("//input[@id='city']"), location);
    click(By.className("pac-item"));
}
default void typedates(){
    click(By.xpath("//input[@id='dates']"));
    pause(3000);
    click(By.xpath("//div[.=' 17 ']"));
click(By.xpath("//div[.=' 31 ']"));
click(By.xpath("//button[@type='submit']"));
pause(3000);
}




default boolean isCarFormPresent(){

    return new WebDriverWait(wd,18)
            .until(ExpectedConditions
                    .textToBePresentInElement(wd.findElement(By.cssSelector("h2")),"details"));
}


default void clickSubmit(){
        click(By.xpath("//button[@type='submit']"));


}

default void select(By locator,String option){
         new Select(wd.findElement(locator)).selectByValue(option);


}

default void openFindCar(){
    click(By.xpath("//a[@href='/search']"));

}


default void findCar(Car car){
typeLocationCity(car.getLocation_city());
typedates();

}




}
