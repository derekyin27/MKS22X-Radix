public class MyLinkedList<E>{

  private int size;
  private Node<E> start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }
  public void clear(){
    size = 0;
  }
    public String toString(){
      if (size == 0){
        return "[]";
      }
      String ans = "[";
      //transversing list
      Node<E> current = start;
      while(current != null){
        ans += (current.getData()+", ");
        current = current.next();
      }
      return ans.substring(0,ans.length()-2)+"]";
    }

  private Node<E> get(int n){
    Node<E> current = start;
    for (int i = 0; i < n; i++){
      current = current.next();
    }
    return current;
  }
  
  public boolean add(E value){
    Node<E> n = new Node<E>(value);
    //special case if list is empty - node would be both start and end node
    if (size == 0){
      start = n;
      end = n;
    }
    else{
      end.setNext(n);
      n.setPrev(end);
      end = n;
    }
    size++;
    return true;
  }

  public E removeFront(){
    Node<E> n = start;
    if(size>1){
      start = start.next();
      start.setPrev(null);
    }
    size--;
    return n.getData();
  }

  public void extend(MyLinkedList<E> other){
    end.setNext(other.start);
    end = other.end;
    size+= other.size();
    other.clear();
  }



}
