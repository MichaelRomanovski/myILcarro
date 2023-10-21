package Manager;

import Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.interactions.Actions;

import javax.xml.namespace.QName;

public interface HelperUser extends HelperBase

{
    default void openLog_inForm()
    {
        wd.findElement(By.xpath("//*[@href='/login?url=%2Fsearch']")).click();

    }

    default void fill_Login_Email_Password_fields(String email,String password)
    {


        type(By.xpath("//*[@id='email']"),email);
        type(By.xpath("//*[@id='password']"),password);


    }default void fill_Login_Email_Password_fields(User user)
    {


        type(By.xpath("//*[@id='email']"), user.getEmail());
        type(By.xpath("//*[@id='password']"),user.getPassword());


    }
    default void registration_fields(User user)
    {
pause(3000);

        type(By.id("name"),user.getName());
        type(By.id("lastName"),user.getLastName());
type((By.id("email")),user.getEmail());
type(By.id("password"),user.getPassword());




    }

    default void logOut(){
        click(By.xpath("//*[.=' Logout ']"));


    }
default boolean isRegistered(){

        return isElementPresent(By.xpath("//*[@type='button']"));


}

    default boolean wrongEmail(){
        return isElementPresent(By.xpath("//*[.='Wrong email format']"));
    }



    default void submit_Login()
    {
        pause(3000);
        click(By.xpath("//*[@type='submit']"));
        click(By.xpath("//*[@type='button']"));
    }

    default void  openRegistrationform(){
        click(By.xpath("//*[.=' Sign up ']"));

    }




    default void Registration_Button(){
pause(5000);
        click(By.xpath("//button[@type='submit']"));
//click(By.xpath("//*[@type='button']"));

    }
    default boolean isLogged(){
        return isElementPresent(
                By.xpath("//*[.=' Logout ']"));
    }
default void Ok_registration_button(){

        click(By.xpath("//*[@type='button']"));

}


default void clickcheckbox(){
       // click(By.cssSelector("label[for='terms-of-use']"));
    JavascriptExecutor js = (JavascriptExecutor)wd;
    js.executeScript("document.querySelector('#terms-of-use').click();");

}

default void clickcheckboxVariant3(){

    Rectangle rect = (Rectangle) wd.findElement(By.cssSelector("label[for='terms-of-use']")).getRect();



int x=rect.getX()+rect.getWidth()*7/8;
int y=rect.getY()+rect.getHeight()/2;
    Actions actions=new Actions(wd);
actions.moveByOffset(x,y).click().perform();
}



default void Login(User user){
        openLog_inForm();
        fill_Login_Email_Password_fields(user);
        submit_Login();



}



}
