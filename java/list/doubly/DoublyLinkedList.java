/*
doubly list for basic view, edit, delete, add, search, sort, display, and save operations in java
*/

class DoublyLinkedList{
    Node head;
    Node tail;
    int size;
    
    class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void search(int data){
        Node current = head;
        int index = 0;
        while(current != null){
            if(current.data == data){
                System.out.println("Element found at index " + index);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Element not found");
    }
    public void delete(int data){
        Node current = head;
        while(current != null){
            if(current.data == data){
                if(current == head){
                    head = current.next;
                    if(head != null){
                        head.prev = null;
                    }
                }
                else if(current == tail){
                    tail = current.prev;
                    tail.next = null;
                }
                else{
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found");
    }
    public void sort(){
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            while(next != null){
                if(current.data > next.data){
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.display();
        list.search(20);
        list.delete(20);
        list.display();
        list.sort();
        list.display();
    }
}


