/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.entities;

/**
 *
 * @author itssh
 */
public class User {
     private String emailAddress,password,firstName,lastName;    

 

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

 

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

 

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

 

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

 

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

 

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

 

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

 

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
