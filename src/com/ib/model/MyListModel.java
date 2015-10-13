/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.model;

import com.ib.controller.*;
import java.util.ArrayList;
import javax.swing.event.ListDataListener;

/**
 *
 * @author IB
 */
public class MyListModel implements javax.swing.ListModel {

   private ArrayList< Person> persons;

    public MyListModel(ArrayList<Person> persons) {
        this.persons = persons; 
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
