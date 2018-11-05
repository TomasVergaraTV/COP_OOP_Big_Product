/*
Tomas Vergara
November 5, 2018
Item.java includes field and methods that will be required by, and overwritten by implementing
classes
 */

import java.util.Date;

public interface Item {

  // sets default manufacturer
  final String manufacturer = new String("OracleProduction");

  // all these methods and variables become requirements for implementing classes
  void setProductionNumber(int productNum);

  void setName(String nameStr);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
