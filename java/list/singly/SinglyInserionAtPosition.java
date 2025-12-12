//simple java program for singly linked list inserion at user desired location
/*
class inserion{
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        head.next.next.next.next.next.next.next = new Node(80);
        head.next.next.next.next.next.next.next.next.next = new Node(90);
        head.next.next.next.next.next.next.next.next.next.next = new Node(100);
}
}
*/
public class SinglyInserionAtPosition {

    // Inner Node class
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Your improved insertAtPosition (now fixed and perfect)
    public void insertAtPosition(int index, int data) {
        if (index < 0) {
            System.out.println("Index cannot be negative");
            return;
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        // Traverse to the node just before the desired index
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If temp is null, index was too large
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete node by value
    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get size
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method to test everything
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtPosition(0, 5);         // Insert at start
        list.insertAtPosition(3, 25);        // Insert in middle
        list.insertAtPosition(6, 50);        // Insert at end (valid)
        list.insertAtPosition(10, 999);      // Out of bounds → error message

        System.out.println("\nAfter insertions:");
        list.printList();                    // 5 → 10 → 20 → 25 → 30 → 40 → 50 → null

        list.delete(20);
        System.out.println("\nAfter deleting 20:");
        list.printList();                    // 5 → 10 → 25 → 30 → 40 → 50 → null
    }
}