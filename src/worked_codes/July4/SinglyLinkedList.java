package July4;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
public class SinglyLinkedList {
    Node head;

    // Add node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Traverse and print the list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to run the code
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        list.traverse();
    }
}
