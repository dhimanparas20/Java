class CountTillHundred extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread: "+Thread.currentThread().getId()+ " isrunning: " + i);
            try {
                Thread.sleep(50); // Adding a small delay for demonstration purposes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadsExample {
    public static void main(String[] args) {
        CountTillHundred t1 = new CountTillHundred();
        CountTillHundred t2= new CountTillHundred();
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println("Main thread is running: " + i);
        //     try {
        //         Thread.sleep(100); // Adding a small delay for demonstration purposes
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        
        //t1.setPriority(2);
        //t2.setPriority(10);
        t1.start(); // Start threclass MyThread extends Thread{
	public void run(){
		for (int i=0;i <10 ;i++ ) {
			System.out.println("Child Thread");
			Thread.yield(); // ---->(1) 
		}
	}
}

class Test{
  public static void main(String[] args){
  	MyThread t  =  new  MyThread();
  	t.start();
  	for (int i=0;i <10 ;i++ ) {
		System.out.println("Main Thread");
	}
  }
}ad t1
        t2.start(); // Start thread t2
        
    }
}