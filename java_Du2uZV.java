// headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    list.addToFront(new Node(2)); 
    list.addToFront(new Node(7));
    //System.out.print(list.toString()); //  7 2 
    
    
    list.addToEnd(new Node(15));
    System.out.print(list.toString()); //  7 2 15
  }
}

public class Node {
  public int data;
  public Node next;
  
  public Node(int d){
    data = d;
  }
}

public class LinkedList {
  private Node head = null;
  
  public LinkedList(){}
  
  public void addToFront(Node node) {
    
    if(head == null){
      // New node is the first line
      head = node;
    }
    else {
      node.next = head;
      head = node;
    }
  }
  
  public void addToEnd(Node node){
    Node tmp = head;
    // iterate through list
    while(tmp != null){
      // check if end of list
      if(tmp.next == null){
        tmp.next = node;
        break;
      }
    }
  }
  
  public String toString(){
  	String value = "";
    
    while(head != null){
      value += " " + head.data;
      head = head.next;
    }
    
    return value;
  }
}
  
  