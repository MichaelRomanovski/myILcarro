package Models;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Builder
@ToString
public class User {




    String  name;
    String lastName;
    String email;
    String password;





   // public User withLastName(String lastName) {
     //   this.lastName = lastName;
       // return this;
    //}

    //public User withEmail(String email) {
      //  this.email = email;
        //return this;
    //}

    //public User WithPassword(String password) {
      //  this.password = password;
        //return this;
   // }


}
