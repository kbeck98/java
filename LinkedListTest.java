public class LinkedListTest {

  public static void main(String args[]){
    LinkedListNode node1 = new LinkedListNode(1);
    LinkedListNode node2 = new LinkedListNode(2);
    LinkedListNode node3 = new LinkedListNode(3);
    LinkedListNode node4 = new LinkedListNode(4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
  }

}
