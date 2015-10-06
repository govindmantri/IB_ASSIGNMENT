/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.controller;

import com.ib.model.PersonAddress;
import java.awt.TextField;
import javax.swing.JTextField;

/**
 *
 * @author IB
 */
public class Address implements PersonAddress{
static JTextField addressTestField;
    public Address(JTextField addressTextField) {
        this.addressTestField=addressTextField;
    }
    

    @Override
    public  String flatType() {
       if(addressTestField.getText().equals("govind mantri"))
       {
           return "2bhk";
       }
        if(addressTestField.getText().equals("ajit roy"))
       {
           return "2bhk";
       }
          if(addressTestField.getText().equals("gopal sony"))
       {
           return "3bhk";
       }
            if(addressTestField.getText().equals("rajkumar hirani"))
       {
           return "2bhk";
       }
        if(addressTestField.getText().equals("namdeo"))
       {
           return "3bhk"+"";
       }
        else if(addressTestField.getText().equals("manu")||addressTestField.getText().equals("deepak")||addressTestField.getText().equals("praveen"))
        {
            return "3bhk";
        }
            return null;
    }
    public int flatNumber()
    {
        if(addressTestField.getText().equals("govind mantri"))
       {
           return 18;
       }
        if(addressTestField.getText().equals("namdeo"))
       {
           return 15;
       }
        
        
       return 0;  
    }

    @Override
    public String OwnerOrTenants() {
        
     if(addressTestField.getText().equals("govind mantri"))
       {
           return "Owner";
       }
        if(addressTestField.getText().equals("namdeo"))
       {
           return "tenants";
       }
       return null;
    }
    
}
