/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.model;

import java.util.ArrayList;

/**
 *
 * @author IB
 */
public class InformationModel {

    private ArrayList<Person> persons;
    private ArrayList<Person> flatList;

    public ArrayList personList() {
        Street street1 = new Street(1, "Talegaon");
        Street street2 = new Street(2, "OLD GOA");
        Street street3 = new Street(3, "NEW GOA");

        Building b1 = new Building(1, "Shiv towers", street1);
        Building b2 = new Building(2, "leandra Complex", street2);
        Building b3 = new Building(3, "Sandra residency", street2);
        Building b4 = new Building(3, "Sandra residency", street3);
        Building b5 = new Building(3, "Sandra residency", street1);

        Flat flat1 = new Flat(10, "A1", "1bhk", b1);
        Flat flat2 = new Flat(20, "A2", "2bhk", b2);
        Flat flat3 = new Flat(10, "A3", "1bhk", b1);
        Flat flat4 = new Flat(30, "B1", "1bhk", b3);
        Flat flat5 = new Flat(10, "B2", "1bhk", b2);
        Flat flat6 = new Flat(30, "A1", "3bhk", b4);
        Flat flat7 = new Flat(30, "A1", "3bhk", b3);
        Flat flat8 = new Flat(40, "A1", "3bhk", b5);
        Flat flat9 = new Flat(10, "A1", "3bhk", b1);
        Flat flat10 = new Flat(30, "A1", "3bhk", b3);
        Flat flat11 = new Flat(10, "A1", "3bhk", b1);

        Person person1 = new Person("Govind", "owner", flat1);
        Person person2 = new Person("Ramlal", "owner", flat2);
        Person person3 = new Person("Babulal", "tenant", flat3);
        Person person4 = new Person("Bunty", "tenant", flat1);
        Person person5 = new Person("Bubly", "tenant", flat2);
        Person person6 = new Person("Raju", "owner", flat5);
        Person person7 = new Person("Ravan", "owner", flat6);
        Person person8 = new Person("Buban", "tenant", flat1);
        Person person9 = new Person("jaideep", "tenant", flat2);
        Person person10 = new Person("Rajan", "owner", flat5);
        Person person11 = new Person("test1", "owner", flat6);
        Person person12 = new Person("test2", "owner", flat6);
        Person person13 = new Person("test3", "owner", flat6);
        Person person14 = new Person("test4", "owner", flat6);
        Person person15 = new Person("test5", "owner", flat6);
        Person person16 = new Person("test6", "owner", flat6);
        Person person17 = new Person("terst7", "owner", flat6);
        Person person18 = new Person("test8", "owner", flat6);
        Person person19 = new Person("saikumaar", "owner", flat6);
        Person person20 = new Person("saikumaar", "owner", flat6);
        Person person21 = new Person("saikumaar", "owner", flat6);
        Person person22 = new Person("saikumaar", "owner", flat6);
        Person person23 = new Person("saikumaar", "owner", flat6);
        Person person24 = new Person("saikumaar", "owner", flat6);
        Person person25 = new Person("saikumaar", "owner", flat6);

        persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
        persons.add(person11);
        persons.add(person12);
        persons.add(person13);
        persons.add(person14);
        persons.add(person15);
        persons.add(person16);
        persons.add(person17);
        persons.add(person18);
        persons.add(person19);
        persons.add(person20);
        persons.add(person21);
        persons.add(person22);
        persons.add(person23);
        persons.add(person24);
        persons.add(person25);
        return persons;
    }
}
