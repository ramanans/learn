// Java program for reversing the linked list
 
public class ReverseLinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        if(node.next == null)
            return node;
        Node ret = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return ret;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(2);
        list.head.next = new Node(6);
        list.head.next.next = new Node(24);
        list.head.next.next.next = new Node(100);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
