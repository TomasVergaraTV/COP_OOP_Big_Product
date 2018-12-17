/*
Tomas Vergara
December 12, 2018
Creates, stores, and checks validity of employee names and department numbers
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  // STEP 18 Fields
  StringBuilder name;
  String code;
  Scanner userInput = new Scanner(System.in);
  // STEP 19 Fields
  String deptId;

  // STEP 18 Methods ------------------------------------------------------------------------------

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    StringBuilder name = new StringBuilder(inputName());
    // Check to see if formatted correctly
    if (checkName(name) == true) {
      createEmployeeCode(name);
    }
    // If not then just default to "Guest"
    else {
      code = "Guest";
    }
    //System.out.println("Your name is: " + code);
  }

  private void createEmployeeCode(StringBuilder name) {
    // Split String in two when encounters space and place in array
    String[] splitName = name.toString().split(" ");
    // Gets first character of first name
    Character firstNameInitial = splitName[0].charAt(0);
    // Chooses last name (no need for full first name, just first letter above)
    String lastName = splitName[1];
    // Create StringBuilder combining the two
    StringBuilder localCode = new StringBuilder(firstNameInitial + lastName);
    code = localCode.toString();
  }

  // Prompts user and scans in their input
  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String userInputString = userInput.nextLine();
    return userInputString;
  }

  // Checks if the inputted name has a space (implying it's a first and last name)
  private boolean checkName(StringBuilder name) {
    boolean hasSpace = name.toString().contains(" ");
    return hasSpace;
  }

  // STEP 19 Methods ------------------------------------------------------------------------------

  // Scans for ID input from user
  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    return userInput.nextLine();
  }

  // Calls getDeptId to get input from user
  // Checks input from user by calling validId
  // If valid, use inputted ID, if no then default to "None01"
  private void setDeptId() {
    String deptId = getDeptId();
    if (validId(deptId) == true) {
      reverseString(deptId);
      this.deptId = deptId;
    } else {
      this.deptId = "None01";
    }
    //System.out.println("Your deptID is: " + this.deptId);
  }

  private String getId() {
    return this.deptId;
  }

  // Checks formatting of input ID, returns false if doesn't match pattern
  private boolean validId(String id) {
    boolean isValid = false;
    // You had to look this up. Remember to review this.
    Pattern p = Pattern.compile("^[A-Z][a-z]{3}[1-9]{2}$");
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  public String toString() {
    return "\nEmployee Code : " + code + "\nDepartment Number : " + this.deptId;
  }

  // STEP 20 Methods ------------------------------------------------------------------------------

  public String reverseString(String id) {
    // Okay so this works, so does messing with an array, but he wants us to use recursion
    /*StringBuilder reverseStringID = new StringBuilder(id);
    reverseStringID.reverse();
    return reverseStringID.toString();*/
    // So here we're calling the method, within the method.
    // Syntax is easy but remember to review this on iLearning
    String reverseStringField;
    if (id.isEmpty() == true) {
      return id;
    } else {
      reverseStringField = reverseString(id.substring(1)) + id.charAt(0);
      return reverseStringField;
    }
    // (Why couldn't I set the first option to false and have the recursion happen in the "if"
    // instead of the "else"?)
  }

  // Constructor ----------------------------------------------------------------------------------

  EmployeeInfo() {
    setName();
    setDeptId();
  }

}
