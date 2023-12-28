class MyThread extends Thread{
    int a=30,b=50;
    public void add(){
        System.out.println("Addition="+(a+b));
    }
    public void sub(){
        System.out.println("Subtraction="+(a-b));
    }
    public void run(){
        add();
        sub();
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(20000);
            String s="name";
            System.out.println(s.charAt(4));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class exception2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("....Multithreading with sleep and join...");
        MyThread obj=new MyThread();
        obj.start();
        obj.join();
        for(int j=0;j<=10;j++){
            System.out.println("main thread:"+j);
        }
    }
}
