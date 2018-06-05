import java.util.ArrayList;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

    public void remove() {
        if(head == null) {
            return;
        } else {
            Node runner1 = head;
            Node runner = head.next;
            while(runner.next != null) {
                runner1 = runner;
                runner = runner.next;
            }
           runner1.next = null;
        }
    }

    public void printValues() {
        ArrayList<Object> arrlist = new ArrayList();
        Node runner = head;
        while(runner != null) {
            arrlist.add(runner.value);
            runner = runner.next;
        }
        System.out.println("The list has: " + arrlist);
    }
}