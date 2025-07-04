package June20.Task10_DeadLock;

public class DeadLockExample {
    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.method1(r1), "Thread-2");

        t1.start();
        t2.start();

    }
}

