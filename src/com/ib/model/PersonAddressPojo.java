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
public class PersonAddressPojo {
    private String name;
    private String street;
    private int houseNuber;

    public PersonAddressPojo(String name, String street, int houseNuber) {
        this.name = name;
        this.street = street;
        this.houseNuber = houseNuber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNuber() {
        return houseNuber;
    }

    public void setHouseNuber(int houseNuber) {
        this.houseNuber = houseNuber;
    }
    
}
