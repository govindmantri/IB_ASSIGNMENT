package com.ib.controller;

import com.ib.model.Flat;
import com.ib.model.Person;
import java.util.ArrayList;

public class ActionController {

    public String searchAddress(ArrayList<Person> person, String name) {

        String address = "";

        for (Person p : person) {

            if (p.getNameOfPerson().equals(name)) {
                if (address.equals("")) {
                    address = p.getFlat().toString();
                    address = address + "" + p.getFlat();
                } else {
                    address = address + " and " + p.getFlat().toString();
                }
            }
        }

        return address;
    }

    public String findTypeOfFlat(ArrayList<Flat> flat, String name) {

        String type = "";

        for (Flat f : flat) {

            if (f.getFlatName().equals(name)) {
                if (type.equals("")) {
                    type = f.getType();
                }

            }
        }

        return type;
    }

    public int findNoOfFlatsOwned(ArrayList<Person> person, String name) {
        int noOfFlats = 0;

        for (Person p : person) {
            if (p.getNameOfPerson().equals(name) && p.getType().equals("owner")) {
                noOfFlats++;
            }
        }

        return noOfFlats;
    }

    public float findArea(ArrayList<Person> person) {

        float area = 0;

        for (Person p : person) {
            if (p.getType().equals("tenant")) {
                Flat flat = p.getFlat();
                if (area == 0) {
                    area = flat.getArea();
                } else {
                    area = area + flat.getArea();
                }

            }
        }
        return area;
    }

}
