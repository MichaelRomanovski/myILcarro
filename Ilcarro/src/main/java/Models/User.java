package Models;






public class User {
    String  name;
    String lastName;
    String email;
    String password;

public User(){};
    public void setName(String name)
    {
        if(name != null){
            return;}

        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public void setPassword(String password) {
        this.password = password;
    }
    public User withName(String name) {
        this.name = name;
        return this;
    }

    public User withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User WithPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
