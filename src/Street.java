import java.io.Serializable;
import java.util.ArrayList;


public class Street implements Serializable{
  private int id;
  private String streetName;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  @Override
  public String toString() {
    return ","+streetName ;
  }
  public Street(int id, String streetName) {
    super();
    this.id = id;
    this.streetName = streetName;
  }
  
 

}
