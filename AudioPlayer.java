/*
Tomas Vergara
November 5, 2018
Makes different methods that an audioplayer should be expected to do. These methods were found in
the MultiMediaControl interface
*/
public class AudioPlayer extends Product implements MultiMediaControl {

  String audioSpecification;
  ItemType mediaType;

  public void play() {
    System.out.println("Playing music");
  }

  public void stop() {
    System.out.println("Stopping music");
  }

  public void previous() {
    System.out.println("Going back to previous music");
  }

  public void next() {
    System.out.println("Going forward to next music");
  }

  // Prints description of AudioPlayer
  public String toString() {
    return super.toString() + "\nAudio Spec : " + audioSpecification + "\nType : " + mediaType;
  }

  AudioPlayer(String name, String audioSpecification) {
    // Calls parent class constructor
    super(name);
    this.audioSpecification = audioSpecification;
    // Sets mediaType to AUDIO (aka "AU")
    mediaType = ItemType.AUDIO;
  }

}
