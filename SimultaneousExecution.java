class AnotherThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Another Thread: " + i);
            try {
                Thread.sleep(50); // Adding a small delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SimultaneousExecution {
    public static void main(String[] args) {
        AnotherThread t1 = new AnotherThread();
        t1.start(); // Start thread t1

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(100); // Adding a small delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
