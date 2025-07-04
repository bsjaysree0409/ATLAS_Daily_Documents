/*class Task0001 {

    Node head;

        public void add(int data) {
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

        public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

      public static void main(String[] args) {
        Task0001 list = new Task0001();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        list.traverse();
    }
} */