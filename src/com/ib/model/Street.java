package com.ib.model;
public class Street {

    private int id;
    private String streetName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getStreetName() {
        return streetName;
    }

    private void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "," + streetName;
    }

    public Street(int id, String streetName) {
        this.id = id;
        this.streetName = streetName;
    }

}
