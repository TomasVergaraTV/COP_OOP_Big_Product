public class MoviePlayer extends Product implements MultiMediaControl {

  Screen screen;
  MonitorType monitorType;

  public void play(){
    System.out.println("Playing movie");
  }

  public void stop(){
    System.out.println("Stopping movie");
  }

  public void previous(){
    System.out.println("Going back to previous movie");
  }

  public void next(){
    System.out.println("Going forward to next movie");
  }

  public String toString(){
    return super.toString() + screen.toString() + "\nMonitor Type : " + monitorType;
  }

  MoviePlayer(String name, Screen screen, MonitorType monitorType){
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

}
