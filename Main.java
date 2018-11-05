/*
Tomas Vergara
November 5, 2018
Main.java creates object of CollectionTest, withing that creates objects of AudioPlayer and
MoviePlayer. Within MoviePlayer creates objects of Screen.
Uses CollectionTest object to print description of objects made.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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


  }
}

class TestClass extends Product { // test class that derives from abstract

  public TestClass(String name) {
    // Calls parent constructor
    super(name);
    // manufacturer is already set, so is serial number, and date. You only get to choose the name
  }
}
