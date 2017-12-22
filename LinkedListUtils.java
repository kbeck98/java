
public class LinkedListUtils {

  public void printList(LinkedListNode head){
     LinkedListNode node = head; 
     System.out.println(node.value); 
     while(node.next != null){
        node = node.next; 
        System.out.println(node.value);
     }
  }


  public LinkedListNode reverseList(LinkedListNode node){
     if(node==null){return null;}
     if(node.next==null){return node;}
     LinkedListNode prev = node;   
     node = node.next;  
     while(node.next!=null){
         node.next = prev;
         prev = node;
         node = node.next;            
     }
     node.next = prev;
     return node;
  }

}
