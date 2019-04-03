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


}
