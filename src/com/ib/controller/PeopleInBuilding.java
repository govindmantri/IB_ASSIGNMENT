/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.controller;

import com.ib.model.BuildingNumber;
import com.ib.model.PersonAddressPojo;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

/**
 *
 * @author IB
 */
public class PeopleInBuilding extends PersonAddressPojo{
    static Vector peopleInBuildingNumber100=new Vector();
    static Vector peopleInBuildingNumber101=new Vector();
    static JList list;
    private static int setHouseNuber;
    static int HouseNumber[]={1,2,3,4,5,6,7};
   static BuildingNumber buildingNumber1;
   
    public static void peopleName(BuildingNumber buildingNumber,JList list)
    {
        buildingNumber1=buildingNumber;
         peopleInBuildingNumber100.add("rajkumar hirani");
            peopleInBuildingNumber100.add("gopal sony");
            peopleInBuildingNumber100.add("govind mantri");
            peopleInBuildingNumber100.add("ajit roy");
            peopleInBuildingNumber101.add("deepak");
            peopleInBuildingNumber101.add("manu");
            peopleInBuildingNumber101.add("parveen");
            peopleInBuildingNumber101.add("namdeo");
        System.out.println(buildingNumber);
        
        if(buildingNumber.toString().equals("100"))
        {
       peopleInBuildingNumber101.clear();
       list.setListData(peopleInBuildingNumber100);
           
        
            System.out.println(peopleInBuildingNumber100);
            list.setListData(peopleInBuildingNumber100);
        }
        if(buildingNumber.toString().equals("101"))
        {
            peopleInBuildingNumber100.clear();
        
            System.out.println(peopleInBuildingNumber101);
            list.setListData(peopleInBuildingNumber101);
        }
     
    }
    public static void showPeopleAddress()
    {
       
    }

    public PeopleInBuilding(String name, String street, int houseNuber) {
        super(name, street, houseNuber);
    }
}
