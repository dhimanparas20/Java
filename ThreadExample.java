class MyThread extends Thread {
    int val;
    // MyThread(int t){
    //    val = t;
    // }
    public void run() {
        // if (val==2){
        //     Thread.yield();
        //     // try{
        //     //     Thread.sleep(7);
        //     // }
        //     // catch(InterruptedException e){
        //     //    System.out.println("catched"+e);
        //     // }
        // }
        for (int i = 1; i <= 10; i++) {
            System.out.println("task in thread " +val+ " -- "  + i);

        }
        
    }
}

public class ThreadExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread(); // Specify 1 to run run1()
        t1.start();

        MyThread t2 = new MyThread(); // Specify 2 to run run2()
        t2.start();

        for (int i=0;i<=10;i++){
            System.out.println("This is main thres : "+i);

        }
    }
}
