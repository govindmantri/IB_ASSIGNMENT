package com.ib.model;

public class Building{
  private String buildingName;
  Street street;
 
  public String getbName() {
    return buildingName;
  }
  public void setbName(String bName) {
    this.buildingName = bName;
  }
  public Street getStreet() {
    return street;
  }
  public void setStreet(Street street) {
    this.street = street;
  }
  @Override
  public String toString() {
    return ","+ buildingName + street.toString();
  }
  public Building(int bId, String bName, Street street) {
    this.buildingName = bName;
    this.street = street;
  }
  

}
