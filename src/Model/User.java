/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Login;

/**
 *
 * @author hazemsalah
 */
public class User {
    private String UserName;
    private int UserId;
    private String UserType;
    private int UserPass;
    private String email;

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setUserPass(int UserPass) {
        this.UserPass = UserPass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getUserName() {
        return UserName;
    }

    public int getUserId() {
        return UserId;
    }

    public int getUserPass() {
        return UserPass;
    }

    public String getUserType() {
        return UserType;
    }

    public String getEmail() {
        return email;
    }

    public Login getLogin() {
        return login;
    }

    public User(String UserName, int UserId, String UserType, int UserPass, String email, Login login) {
        this.UserName = UserName;
        this.UserId = UserId;
        this.UserType = UserType;
        this.UserPass = UserPass;
        this.email = email;
        this.login = login;
    }

    
    
    public Login login;

            
    
}
