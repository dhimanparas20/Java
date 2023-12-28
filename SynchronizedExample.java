class Counter {
    private int count = 0;

    public synchronized void increment() {
        // Increment the counter in a synchronized manner
        count++;
        System.out.println("Counter: " + count);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Counter sharedCounter = new Counter();
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                sharedCounter.increment();
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                sharedCounter.increment();
            try {
                Thread.sleep(100); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                
            }
        };
        t1.start();
        t2.start();
    }
}
