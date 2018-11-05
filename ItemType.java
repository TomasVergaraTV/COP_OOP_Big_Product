/*
Tomas Vergara
November 5, 2018
Creates list of constants
 */
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIOMOBILE("AM"), VISUALMOBILE("VM");

  private String itemTypeStr;

  public String getItemType() {
    return itemTypeStr;
  }

  // Constructor
  ItemType(String itemTypeStr) {
    this.itemTypeStr = itemTypeStr;
  }

}
