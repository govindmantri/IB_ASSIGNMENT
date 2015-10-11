/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.view;

import java.util.ArrayList;
import javax.swing.event.ListDataListener;

/**
 *
 * @author IB
 */
public class ListModel implements javax.swing.ListModel{
    ArrayList< Person> persons;

    ListModel(ArrayList<Person> persons) {
        this.persons=persons; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSize() {
     return persons.size();
    }

    @Override
    public Object getElementAt(int index) {
       return persons.get(index);
        
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
