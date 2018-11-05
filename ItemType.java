public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIOMOBILE("AM"), VISUALMOBILE("VM");

  private String itemTypeStr;

  ItemType(String itemTypeStr){
    this.itemTypeStr = itemTypeStr;
  }

  public String getItemType(){
    return itemTypeStr;
  }
}
