package model.entities;

import java.util.regex.Pattern;
import model.entities.types.*;

public class User extends Person {
    private UserType userType;
    private String email;
    private String password;

    public User() {
        super();
    }

    public User(String name, String lastName, UserType userType, String email, String password) {
        super(name, lastName);
        this.userType = userType;
        this.email = email;
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidEmail(String email) {
        return Pattern.compile("^(.+)@(\\\\S+)$")
                .matcher(email)
                .matches();
    }
}
