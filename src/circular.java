// Node class for Circular Linked List
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Circular Linked List class
class CircularLinkedList {
    Node1 head = null;
    Node1 tail = null;

    // Method to add a node to the list
    public void add(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points to itself (circular)
        } else {
            tail.next = newNode; // Link new node after tail
            tail = newNode;      // Update tail
            tail.next = head;    // Make it circular
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node1 current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
}

// Main class to run the example
public class circular {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display();
    }
}
