/* 
circular list for basic view, edit, delete, add, search, sort, display, and save operations in java
*/

import java.io.*;

public class CircularList<T extends Comparable<T>> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head = null;
    public void add(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
    public boolean search(T key) {
        if (head == null) return false;

        Node temp = head;
        do {
            if (temp.data.equals(key)) return true;
            temp = temp.next;
        } while (temp != head);

        return false;
    }
    public boolean delete(T key) {
        if (head == null) return false;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.data.equals(key)) {
                if (prev == null) { // deleting head
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (head == head.next) {
                        head = null;
                    } else {
                        last.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = curr.next;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        return false;
    }
    public boolean edit(T oldValue, T newValue) {
        if (head == null) return false;

        Node temp = head;
        do {
            if (temp.data.equals(oldValue)) {
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        } while (temp != head);

        return false;
    }

    public void sort() {
        if (head == null || head.next == head) return;

        boolean swapped;
        do {
            swapped = false;
            Node curr = head;

            do {
                Node next = curr.next;
                if (next != head && curr.data.compareTo(next.data) > 0) {
                    T temp = curr.data;
                    curr.data = next.data;
                    next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            } while (curr.next != head);

        } while (swapped);
    }

    public void saveToFile(String filename) throws IOException {
        if (head == null) return;

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        Node temp = head;
        do {
            writer.write(temp.data.toString());
            writer.newLine();
            temp = temp.next;
        } while (temp != head);

        writer.close();
    }
    public void loadFromFile(String filename, TParser<T> parser) throws IOException {
        head = null;
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            add(parser.parse(line));
        }
        reader.close();
    }
    public interface TParser<T> {
        T parse(String str);
    }
    public static void main(String[] args) throws Exception {
        CircularList<Integer> list = new CircularList<>();

        list.add(20);
        list.add(5);
        list.add(15);

        list.display();

        System.out.println("Search 15: " + list.search(15));
        System.out.println("Delete 5: " + list.delete(5));

        list.display();

        System.out.println("Edit 20 → 25");
        list.edit(20, 25);

        list.display();

        System.out.println("Sorting...");
        list.sort();
        list.display();

        list.saveToFile("list.txt");

        CircularList<Integer> list2 = new CircularList<>();
        list2.loadFromFile("list.txt", Integer::parseInt);
        list2.display();
    }
}
