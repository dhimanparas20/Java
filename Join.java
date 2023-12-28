class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            Thread.yield();
            try {
                Thread.sleep(100); // Simulating some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Join {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread
        
        try {
            thread.join(); // Wait for the thread to complete before proceeding to main thread
            System.out.println("jai ho");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //thread2.start(); // Start the thread
        System.out.println("Main thread finished");
    }
}
