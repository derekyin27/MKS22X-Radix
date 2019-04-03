public class MyLinkedList<E>{
  private class Node<E>{
  private E data;
  private Node<E> next;
  private Node<E> prev;
  public Node(E data1, Node<E> next1, Node<E> prev1){
    data = data1;
    next = next1;
    prev = prev1;
  }
  public Node (E data1){
    data = data1;
  }

  public Node<E> next(){
    return next;
  }
  public Node<E> prev(){
    return prev;
  }
  public void setNext(Node<E> next1){
    next = next1;
  }
  public void setPrev(Node<E> prev1){
    prev = prev1;
  }
  public E getData(){
    return data;
  }
  public void setData(E data1){
    data = data1;
  }
  public String toString(){
  	return data+"";
  }

}

  private int size;
  private Node<E> start,end;

  public String toString(){
    String str = "[";
    Node current = start;
    if (end == null) return str + "]";
    while (current.next()!= null){
      str+=current.getData() + ",";
      current = current.next();
    }
    str += current.getData() + "]";
    return str;
  }

  public MyLinkedList(){
    size=0;
  }
  public void clear(){
    size=0;
  }
  public int size(){
    return size;
  }
  public void add(E element){
    Node<E> toAdd = new Node<E>(element);
    if (size==0){
      start = toAdd;
      end = toAdd;
    }
    else{
      end.setNext(toAdd);
      toAdd.setPrev(end);
      end = toAdd;
    }
    size++;
  }
  public void extend(MyLinkedList<E> other){
    if (size==0) start = other.start;
    else end.setNext(other.start);
    end = other.end;
    size+=other.size();
    other.clear();
  }
  public E removeFront(){
    Node<E> toRem = start;
    if (size>1){
      start= start.next();
      start.setPrev(null);
    }
    size--;
    return toRem.getData();
  }
  public static void main(String args[]){
    MyLinkedList<Integer> l1 = new MyLinkedList<>();
    MyLinkedList<Integer> l2 = new MyLinkedList<>();
    System.out.println(l1);
    System.out.println(l2);
    for(int i = 0; i < 20; i++){
      l1.add(i);
      l2.add(i+2);
    }
    System.out.println(l1);
    System.out.println(l2);
    l1.extend(l2);
    System.out.println(l1);
}

}
