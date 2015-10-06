/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.model;

/**
 *
 * @author IB
 */
public class Person {
   private String personName;
   private int    personAge;
   private String personPhoneNumber;

    public Person(String personName, int personAge, String personPhoneNumber) {
        this.personName = personName;
       this.personAge = personAge;
        this.personPhoneNumber = personPhoneNumber;
    }

    public Person(String personName) {
        this.personName=personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    @Override
    public String toString() {
        return personName;
    }
   
   
   
    
    
}
