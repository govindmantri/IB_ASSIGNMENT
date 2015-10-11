package com.ib.view;

import java.io.Serializable;
import java.util.ArrayList;


public class Person implements Serializable{
  @Override
  public String toString() {
    return getNameOfPerson();
  }
  private String nameOfPerson,type;
 private int id;
 Flat flat;
public String getNameOfPerson() {
  return nameOfPerson;
}
public void setNameOfPerson(String nameOfPerson) {
  this.nameOfPerson = nameOfPerson;
}
public String getType() {
  return type;
}
public Person(String nameOfPerson, String type, int id, Flat flat) {
  super();
  this.nameOfPerson = nameOfPerson;
  this.type = type;
  this.id = id;
  this.flat = flat;
}
public void setType(String type) {
  this.type = type;
}
public int getId() {
  return id;
}
public void setId(int id) {
  this.id = id;
}
public Flat getFlat() {
  return flat;
}
public void setFlat(Flat flat) {
  this.flat = flat;
}
 
}
