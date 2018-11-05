/*
Tomas Vergara
November 5, 2018
Extension of Product class.
Allows users to pause, resume, skip, and rewind as specified by the implemented interface.
Returns description of itself.
 */
public class MoviePlayer extends Product implements MultiMediaControl {

  Screen screen;
  MonitorType monitorType;

  public void play() {
    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {
    System.out.println("Going back to previous movie");
  }

  public void next() {
    System.out.println("Going forward to next movie");
  }

  // returns description of MoviePlayer. Calls description of parent class and Screen class
  public String toString() {
    return super.toString() + screen.toString() + "\nMonitor Type : " + monitorType;
  }

  // Constructor. Also calls parent constructor
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

}
