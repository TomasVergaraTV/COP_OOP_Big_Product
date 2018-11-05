/*
Tomas Vergara
September 29, 2018
Item.java includes field and methods that will be required by, and overwritten by implementing
classes
 */

import java.util.Date;

public interface Item {

  final String manufacturer = new String("OracleProduction"); // sets default manufacturer

  void setProductionNumber(int productNum); // all these methods and variables become requirements
  // for implementing classes

  void setName(String nameStr);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
