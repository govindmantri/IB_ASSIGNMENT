package com.ib.model;

import com.ib.model.Building;

public class Flat {

    private int area;
    private String flatName;
    private String type;
    private Building build;

    public Flat(int area, String flatName, String type, Building build) {
        this.area = area;
        this.flatName = flatName;
        this.type = type;
        this.build = build;
    }

    @Override
    public String toString() {
        return flatName + build.toString();
    }

    public int getArea() {
        return area;
    }

    private void setArea(int area) {
        this.area = area;
    }

    public String getFlatName() {
        return flatName;
    }

    private void setFlatName(String flatName) {
        this.flatName = flatName;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
        System.out.println("hello");
    }

    private Building getBuild() {
        return build;
    }

    private void setBuild(Building build) {
        this.build = build;
    }

}
