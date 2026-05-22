// Railway Management System - Singly Linked List in Java
// Simple & working version

class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
        this.next = null;
    }
}

class RailwayTrack {
    private Node head;

    // Add station at the end
    public void addStation(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added: " + name);
    }

    // Insert new station AFTER a given station
    public void insertAfter(String prevName, String newName) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(prevName)) {
                Node newNode = new Node(newName);
                newNode.next = current.next;
                current.next = newNode;
                System.out.println("Inserted " + newName + " after " + prevName);
                return;
            }
            current = current.next;
        }
        System.out.println("Station '" + prevName + "' not found!");
    }

    // Remove a station by name
    public void removeStation(String name) {
        if (head == null) {
            System.out.println("Track is empty!");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Removed: " + name);
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next;
                System.out.println("Removed: " + name);
                return;
            }
            current = current.next;
        }
        System.out.println("Station '" + name + "' not found!");
    }

    // Print entire route with arrows
    public void traverse() {
        if (head == null) {
            System.out.println("No stations on the track.");
            return;
        }

        System.out.print("Route: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.name);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println("\n");
    }
    
    public void findNextNStations(String startName, int n) {
        Node current = head;

        while (current != null) {
            if (current.name.equals(startName)) {
                System.out.print("Next " + n + " stations from " + startName + ": ");
                Node temp = current;
                int count = 0;

                while (temp != null && count < n) {
                    System.out.print(temp.name);
                    if (count < n - 1) System.out.print(" → ");
                    temp = temp.next;
                    count++;
                }
                System.out.println();
                return;
            }
            current = current.next;
        }
        System.out.println("Station '" + startName + "' not found!");
    }
    public static void main(String[] args) {
        RailwayTrack track = new RailwayTrack();
        track.addStation("Station A");
        track.addStation("Station B");
        track.addStation("Station C");
        track.traverse();
        track.insertAfter("Station B", "Station D");
        track.traverse();
        track.removeStation("Station C");
        track.traverse();
        track.findNextNStations("Station A", 2);
        track.findNextNStations("Station B", 3);
        track.findNextNStations("Station D", 1);
    }
}