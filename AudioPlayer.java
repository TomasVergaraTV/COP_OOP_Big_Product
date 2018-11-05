public class AudioPlayer extends Product implements MultiMediaControl {

  String audioSpecification;
  ItemType mediaType;

  public void play(){
    System.out.println("Playing music");
  }

  public void stop(){
    System.out.println("Stopping music");
  }

  public void previous(){
    System.out.println("Going back to previous music");
  }

  public void next(){
    System.out.println("Going forward to next music");
  }

  public String toString(){
    return super.toString() + "\nAudio Spec : " + audioSpecification + "\nType : " + mediaType;
  }

  AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

}
