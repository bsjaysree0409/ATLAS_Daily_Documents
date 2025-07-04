package worked_codes.July4;

class CustomQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor
    public CustomQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Check if the queue is empty Initializes the queue with:

    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == queue.length;
    }

    // Add element to the rear
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
        System.out.println("Enqueued: " + data);
    }

    // Remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removed = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }

        return queue[front];
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
}

public class CustomQueueTest {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.display();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        queue.enqueue(60); // Should show "Queue is full"

        System.out.println("Peek: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.display();

        System.out.println("Is Empty? " + queue.isEmpty());
        System.out.println("Is Full? " + queue.isFull());
    }
}
