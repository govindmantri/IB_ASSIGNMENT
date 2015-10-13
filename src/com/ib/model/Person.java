package com.ib.model;

import com.ib.model.Flat;
import java.util.ArrayList;

public class Person {

    private Flat flat;
    private String personName;
    private String type;

    public String getNameOfPerson() {
        return personName;
    }

    public void setNameOfPerson(String personName) {
        this.personName = personName;
    }

    public String getType() {
        return type;
    }

    public Person(String personName, String type, Flat flat) {
        super();
        this.personName = personName;
        this.type = type;
        this.flat = flat;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return personName;
    }
}
