/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.controller;

import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;

/**
 *
 * @author IB
 */
public class BuildingNumberCombo implements ComboBoxModel{
    Vector buildingNumber;
    Object object;

    public BuildingNumberCombo() {
    }
    
    
    public BuildingNumberCombo(Vector buildingNumber) {
        this.buildingNumber = buildingNumber;
        object="building number";
        
    }
    

    @Override
    public void setSelectedItem(Object anItem) {
        object=  anItem;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getSelectedItem() {
        return object;
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
        return buildingNumber.size();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getElementAt(int index) {
        return buildingNumber.get(index);
      //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addListDataListener(ListDataListener l) {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
