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
public class BuildingNumber {
   String number;

    public BuildingNumber(String number) {
        this.number = number;
    }

    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number ;
    }
   
    
}
