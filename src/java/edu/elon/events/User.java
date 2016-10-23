/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.events;

/**
 *
 * @author rfeather
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        zipCode="";
    }

    public User(String firstName, String lastName, String email, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getZipCode(){
    return zipCode;
}
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}


