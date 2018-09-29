/*
Tomas Vergara
September 29, 2018
Product.java is an abstract class that implements from the Item.java interface. It overrides the
interface's methods and variables. This class is made as a blue print for other classes (specific
products) to derive from.
 */

import java.time.LocalDateTime;
import java.util.Date;

public abstract class Product implements Item {

  int serialNumber;
  //String manufacturer;
  // Why do we have to set this in the abstract class if we already have a constant in interface?
  Date manufacturedOn;
  String name;

  static int currentProductionNumber;
  // Static because need to keep track of how many objects are being created

  @Override
  public void setProductionNumber(int productNum) {
    currentProductionNumber = productNum;
  }

  @Override
  public void setName(String name) {
    this.name = name; // gives name to object
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  public String toString() { // creates formatted description of object (product) created
    return "\nManufacturer: " + manufacturer + "\nSerial Number: " + serialNumber +
        "\nDate: " + this.manufacturedOn + "\nName: " + this.name;
  }

  Product(String productName) { // constructor
    name = productName; // set object name
    serialNumber = currentProductionNumber; // serial num is basically how many objects are created+
    currentProductionNumber++; // increments static variable once for every object created
    manufacturedOn = new Date(); // sets to current date every time new object created
  }
}
