// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
    public void run()
    {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
    }
}
 
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object = new MultithreadingDemo();
            System.out.println(object.getPriority());
            object.start();
        }
    }
}
