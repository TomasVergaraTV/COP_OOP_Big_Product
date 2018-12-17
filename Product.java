/*
Tomas Vergara
November 5, 2018
Product.java is an abstract class that implements from the Item.java interface. It overrides the
interface's methods and variables. This class is made as a blueprint for other classes (specific
products) to derive from. (Ex. AudioPlayer, MoviePlayer)
 */

import java.time.LocalDateTime;
import java.util.Date;

// Can't make object of this class because it is abstract
public abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer;
  // Why do we have to set this in the abstract class if we already have a constant in interface?
  // OKAY! String manufacturer = Item.manufacturer; <----
  Date manufacturedOn;
  String name;

  // Static because need to keep track of how many objects are being created
  static int currentProductionNumber = 1;

  public void setProductionNumber(int productNum) {
    currentProductionNumber = productNum;
  }

  public void setName(String name) {
    this.name = name; // gives name to object
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  // creates formatted description of object (product) created
  public String toString() {
    return "\nManufacturer : " + manufacturer + "\nSerial Number : " + getSerialNumber() +
        "\nDate : " + getManufactureDate() + "\nName : " + getName();
  }

  // Constructor
  Product(String productName) {
    manufacturer = Item.manufacturer;
    name = productName;
    serialNumber = currentProductionNumber;
    // Increments whenever new Product is instantiated. This is the serial number.
    currentProductionNumber++;
    // sets to current date every time new object created
    manufacturedOn = new Date();
  }

  // CompareTo needed to sort. Compares different objects by their name in order to sort
  @Override
  public int compareTo(Product product) {
    return this.name.compareTo(product.name);
  }
}
