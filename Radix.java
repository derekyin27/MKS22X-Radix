import java.util.*;
public class Radix{
  @SuppressWarnings("unchecked")
  public static void radixsort(int[] data){
    MyLinkedList<Integer>[] bucket = new MyLinkedList[20];//extend to include negatives
    MyLinkedList<Integer>[] temp = new MyLinkedList<>();
    for (int i =0; i < bucket.length; i++){
      bucket[i] = new MyLinkedList<Integer>();
    }
  }
}
