// class MyThread implements Runnable{
//     public void run(){
//         for (int i=0;i<=5;i++){
//             System.out.println("Running thread No:"+Thread.currentThread().getId()+" : "+i);
//             try{
//                 Thread.sleep(50);
//             }catch(Exception e){}
//         }
//     }
// }

class MyThread extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Running thread1 No:"+Thread.currentThread().getId()+" : "+i);
            try{
                Thread.yield();
                Thread.sleep(50);
            }catch(Exception e){}
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println("Running thread2 No:"+Thread.currentThread().getId()+" : "+i);
            try{
                Thread.yield();
                Thread.sleep(50);
            }catch(Exception e){}
        }
    }
}

public class practice {
    public static void main(String[] args){
        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();
        //Thread t1 =  new Thread(t);   // for interfaces
        t.start();
        // t2.start();
        // try{
        //     //t.join();
        //     t.join();   // T will execute first then t2 and main thread will execute
        // }catch(Exception e){}
        t2.start();
        
        for (int i=0;i<=5;i++){
            System.out.println("Running Main Thread No:"+Thread.currentThread().getId()+" : "+i);
            try{
                Thread.sleep(50);
            }catch(Exception e){}
        }
    }
    
}
