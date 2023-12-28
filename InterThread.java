//InterThread communication using wait() and notify()
class Bank{
    private int balance = 100;
    public synchronized void widraw(int amt){
        System.out.println("Starting Widraw");
        if (amt > balance){
            System.out.println("invalid balcance. waiting for deposit");
            try{
                Thread.sleep(100);
                wait();
            }catch(Exception e){
                System.out.println("Error in Sleep or Wait");
            }
        }
        balance -= amt;
        System.out.println("Widraw done");
    }
    public synchronized void deposit(int amt){
        System.out.println("Starting Deposit");
        balance += amt;
        notify();
        System.out.println("Deposit done");
    }
}
public class InterThread {
    public static void main(String[] args) {
        Bank b = new Bank();
        Thread t1 = new Thread(){
            public void run(){
                b.widraw(200);
            }
        }; 
        Thread t2 = new Thread(){
            public void run(){
                b.deposit(100);
            }
        };
        t1.start();
        t2.start();   
    }
}