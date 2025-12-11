public class Singly {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;
    private int size;

    // Constructor
    public Singly() {
        head = null;
        size = 0;
    }

    // 1. Insert at the beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println(data + " inserted at the beginning.");
    }

    // 2. Insert at the end
    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        System.out.println(data + " inserted at the end.");
    }

    // 3. Insert at a specific position (1-based index)
    public void insertAtPosition(int data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position! Position should be between 1 and " + (size + 1));
            return;
        }

        if (position == 1) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
        System.out.println(data + " inserted at position " + position);
    }

    // 4. Delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        System.out.println(head.data + " deleted from beginning.");
        head = head.next;
        size--;
    }

    // 5. Delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (head.next == null) {
            System.out.println(head.data + " deleted (last node).");
            head = null;
            size--;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        System.out.println(current.next.data + " deleted from end.");
        current.next = null;
        size--;
    }

    // 6. Delete at position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        if (position < 1 || position > size) {
            System.out.println("Invalid position! Position should be between 1 and " + size);
            return;
        }

        if (position == 1) {
            deleteFirst();
            return;
        }

        Node current = head;

        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }

        System.out.println(current.next.data + " deleted from position " + position);
        current.next = current.next.next;
        size--;
    }

    // 7. Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println("Size: " + size);
    }

    // 8. Get size
    public int getSize() {
        return size;
    }

    // Main method
    public static void main(String[] args) {
        Singly list = new Singly();

        list.display();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.display();

        list.insertFirst(5);
        list.display();

        list.insertAtPosition(25, 4);
        list.display();

        list.insertAtPosition(100, 1);
        list.display();

        list.insertAtPosition(200, 8);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.deleteAtPosition(3);
        list.display();

        list.deleteAtPosition(1);
        list.display();
    }
}
