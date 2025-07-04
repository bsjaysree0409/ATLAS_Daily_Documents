package June20.Task10_DeadLock;

public class Resource {
    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.method2(this);
    }

    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        r.method1(this);
    }
}
