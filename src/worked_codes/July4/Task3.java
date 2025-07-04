package July4;

public class Task3 {
    Node head = null;
    Node tail = null;

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Check if a node with given data exists
    public boolean contains(int data) {
        if (head == null) return false;

        Node current = head;
        do {
            if (current.data == data) return true;
            current = current.next;
        } while (current != head);

        return false;
    }

    // Delete the first node with the given data
    public void delete(int data) {
        if (head == null) return;

        Node current = head;
        Node prev = tail;
        boolean found = false;

        do {
            if (current.data == data) {
                found = true;

                // Case 1: Single node in list
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                }
                // Case 2: Deleting head
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // Case 3: Deleting tail
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // Case 4: Deleting middle node
                else {
                    prev.next = current.next;
                }

                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Node " + data + " not found.");
        }
    }

    // Print the circular list
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.print("Circular Linked List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    // Main method for testing
    public static void main(String[] args) {
        Task3 list = new Task3();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.traverse();

        System.out.println("Contains 20? " + list.contains(20)); // true
        System.out.println("Contains 50? " + list.contains(50)); // false

        list.delete(10);  // Delete head
        list.traverse();

        list.delete(40);  // Delete tail
        list.traverse();

        list.delete(25);  // Not found
        list.traverse();

        list.delete(20);  // Delete middle
        list.traverse();

        list.delete(30);  // Delete last node
        list.traverse();
    }
}
