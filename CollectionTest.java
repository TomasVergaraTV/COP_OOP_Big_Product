import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTest {

  AudioPlayer a1;
  AudioPlayer a2;
  MoviePlayer m1;
  MoviePlayer m2;
  ArrayList<Product> arrListProduct = new ArrayList<>();

  public ArrayList createSortArrayList(){

   arrListProduct.add(a1);
   arrListProduct.add(a2);
   arrListProduct.add(m1);
   arrListProduct.add(m2);
   Collections.sort(arrListProduct);
   return arrListProduct;

  }

  public <T> void printStuff(ArrayList<T> arrayList) {
    for(T genericVar : arrayList){
      System.out.println(genericVar);
    }
  }

  // Constructor
  CollectionTest(AudioPlayer a1, AudioPlayer a2, MoviePlayer m1, MoviePlayer m2){
    this.a1 = a1;
    this.a2 = a2;
    this.m1 = m1;
    this.m2 = m2;
  }
}
