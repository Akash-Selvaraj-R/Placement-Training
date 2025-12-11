public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println();

        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        System.out.println();

        list.insertAtEnd(60);
        list.insertAtEnd(70);
        System.out.println();

        list.insertAtPosition(80, 3);
        list.insertAtPosition(90, 0);
        System.out.println();

        list.delete(10);
        list.delete(20);
        System.out.println();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        System.out.println();

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLLCore {
    Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void insert(int data) {
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
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
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
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

