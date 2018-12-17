/*
Tomas Vergara
December 12, 2018
INSERT DESCRIPTION OF CLASS HERE
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class ProcessFiles {

  // REPLACE PATH WITH C ROOT
  private Path p = Paths.get("C:\\Users\\T Vergara\\Documents\\FGCU\\Fall 2018\\COP\\"
      + "OOP Release Candidate Test Folder\\LineTests");
  private Path p2 = Paths.get("TestResults.txt");
  private Path p3 = Paths.get(p.toString(),p2.toString());

  // Makes folder if there isn't already one
  private void CreateDirectory() {
    File lineTestsDir = new File(p.toString());
    // If directory does not exist, make one (mkdir = make directory)
    if (!lineTestsDir.exists()) {
      lineTestsDir.mkdir();
      System.out.println("Directory created!");
    }
    else {
      System.out.println("Directory already exists!");
    }
  }

  // You could probably combine these two methods
  public void WriteFile(EmployeeInfo emp) throws IOException {
    CreateDirectory();
    if (!Files.exists(p3)) {
      Files.createFile(p3);
      System.out.println("File created!");
    }
    else {
      System.out.println("File already exists!");
    }
    Files.write(p3, emp.toString().replaceAll("\n", System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
    System.out.println("Employee information appended to file!");
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {
    CreateDirectory();
    if (!Files.exists(p3)) {
      Files.createFile(p3);
      System.out.println("File created!");
    }
    else {
      System.out.println("File already exists!");
    }
    for (Product product : products) {
      Files.write(p3, products.toString().replaceAll("\n", System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
      System.out.println(product.getName() + " information appended to file!");
    }
  }
}