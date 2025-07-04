package June20.Task8_synchronization;

public class ThreadDemo extends Thread {
    Counter counter;

    ThreadDemo(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}
