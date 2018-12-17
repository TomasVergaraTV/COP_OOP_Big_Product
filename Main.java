/*
Tomas Vergara
November 5, 2018
Main.java creates object of CollectionTest, withing that creates objects of AudioPlayer and
MoviePlayer. Within MoviePlayer creates objects of Screen.
Uses CollectionTest object to print description of objects made.
 */

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    /*TestClass testObj = new TestClass("Product ONE");
    System.out.println(testObj.toString());
    TestClass testObj2 = new TestClass("Product TWO");
    System.out.println(testObj2.toString());

    // Below is Step 6. "Driver Class" just means class with "main" in it right?
    System.out.println("\nSTEP 6");
    AudioPlayer audioPlayer = new AudioPlayer("iPod", "meme.wav");
    System.out.println(audioPlayer.toString());

    // Step 7
    System.out.println("\nSTEP 7");
    Screen screen = new Screen("1920 x 1080", 144, 1);
    System.out.println(screen.toString());

    // Step 12
    System.out.println("\nSTEP 12");
    MoviePlayer moviePlayer = new MoviePlayer("Samsung HDTV",
        new Screen("1920 x 1080", 144, 1), MonitorType.LED);
    System.out.println(moviePlayer.toString());

    // Step 13
    System.out.println("\nSTEP 13");
    audioPlayer.play();
    moviePlayer.play();*/

    // Step 16
    //System.out.println("\nSTEP 16");

    // Creates object of CollectionTest, throws in objects of AudioPlayer and MoviePlayer
    CollectionTest collectionTest = new CollectionTest(
        new AudioPlayer("iPod Mini", "MP3"),
        new AudioPlayer("Walkman", "WAV "),
        // MoviePlayer needs a Screen argument, so we make an object of Screen here too
        new MoviePlayer("DBPOWER MK101",
            new Screen(" 720x480", 40, 22), MonitorType.LCD),
        new MoviePlayer("Pyle PDV156BK",
            new Screen("1366x768", 40, 22), MonitorType.LED));
    collectionTest.printStuff(collectionTest.createSortArrayList());

    EmployeeInfo empInfoObj = new EmployeeInfo();

    // Creates text file with CollectionTest ArrayList and EmployeeInfo
    ProcessFiles processFilesObj = new ProcessFiles();

    try {
      processFilesObj.WriteFile(collectionTest.createSortArrayList());
      processFilesObj.WriteFile(empInfoObj);
    } catch (Exception e) {
      System.out.println("Oopsies we messed up!");
    }

    // STEP 22 ------------------------------------------------------------------------------------

    File textFile = new File("C:\\Users\\T Vergara\\Documents\\FGCU\\Fall 2018\\COP\\"
        + "OOP Release Candidate Test Folder\\LineTests\\TestResults.txt");
    try {
      Scanner scanner = new Scanner(textFile);
      // Reads in text file line by line
      System.out.println("\nReading out text file:");
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("Oopsies! We couldn't find that file :( \nPlease try another one");
    }


  }
}

class TestClass extends Product { // test class that derives from abstract

  public TestClass(String name) {
    // Calls parent constructor
    super(name);
    // manufacturer is already set, so is serial number, and date. You only get to choose the name
  }
}
