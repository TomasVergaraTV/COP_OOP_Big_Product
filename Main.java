/*
Tomas Vergara
September 29, 2018
Main.java just includes a class and two of its objects in order to test Item.java and Product.java
 */

public class Main {

  public static void main(String args[]) {
    //System.out.println("Hello World.");
    TestClass testObj = new TestClass("Product ONE");
    System.out.println(testObj.toString());
    TestClass testObj2 = new TestClass("Product TWO");
    System.out.println(testObj2.toString());
  }
}

class TestClass extends Product { // test class that dervies from abstract

  public TestClass(String name) {
    super(name); // this is only field you can set, rest are automatically made
    // manufacturer is already set, so is serial number, and date. You only get to choose the name
  }
}
