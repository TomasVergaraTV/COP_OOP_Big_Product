public class Screen implements ScreenSpec {

  String resolution;
  int refreshRate;
  int responseTime;

  public String getResolution(){
    return resolution;
  }

  public int getRefreshRate(){
    return refreshRate;
  }

  public int getResponseTime(){
    return responseTime;
  }

  public String toString() { // creates formatted description of object (product) created
    return "\nResolution : " + getResolution() + "\nRefresh Rate : " + getRefreshRate() +
        "\nResponse Time : " + getResponseTime();
  }

  Screen(String resolution, int refreshRate, int responseTime){
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

}
