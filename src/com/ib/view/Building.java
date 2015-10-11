package com.ib.view;

import java.io.Serializable;


public class Building implements Serializable{
  private int bId;
  private String bName;
  Street street;
  public int getbId() {
    return bId;
  }
  public void setbId(int bId) {
    this.bId = bId;
  }
  public String getbName() {
    return bName;
  }
  public void setbName(String bName) {
    this.bName = bName;
  }
  public Street getStreet() {
    return street;
  }
  public void setStreet(Street street) {
    this.street = street;
  }
  @Override
  public String toString() {
    return ","+ bName + street.toString();
  }
  public Building(int bId, String bName, Street street) {
    super();
    this.bId = bId;
    this.bName = bName;
    this.street = street;
  }
  

}
