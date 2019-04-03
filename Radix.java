import java.util.*;
public class Radix{
  @SuppressWarnings("unchecked")
  public static void radixsort(int[] data){
    MyLinkedList<Integer>[] bucket = new MyLinkedList[20];//extend to include negatives
    MyLinkedList<Integer> temp = new MyLinkedList<>();
    for (int i =0; i < bucket.length; i++){
      bucket[i] = new MyLinkedList<Integer>();
    }
    for (int i =0; i<data.length; i++){
      temp.add(data[i]);
    }
    int max = Math.abs(data[0]);
    for (int i =0; i <data.length; i++){
      if (Math.abs(data[i])>max) max = Math.abs(data[i]);
    }
    for (int in = 1; max/in > 0; in*=10){
      for (int i =0; i < data.length; i++){
        int x = temp.removeFront();
        bucket[9+x/in%10].add(x);
      }
      for (int i =0; i < bucket.length; i++){
        if (bucket[i].size()>0) temp.extend(bucket[i]);
      }
    }
    for (int i = 0; i < data.length; i++){
      data[i] = temp.removeFront();
    }
  }
}
