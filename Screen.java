/*
Tomas Vergara
November 5, 2018
Sets and returns important information about the screen.
 */

public class Screen implements ScreenSpec {

  String resolution;
  int refreshRate;
  int responseTime;

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshRate;
  }

  public int getResponseTime() {
    return responseTime;
  }

  // Returns description of Screen
  // creates formatted description of object (product) created
  public String toString() {
    return "\nResolution : " + getResolution() + "\nRefresh Rate : " + getRefreshRate() +
        "\nResponse Time : " + getResponseTime();
  }

  Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

}
