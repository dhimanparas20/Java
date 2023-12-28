interface intf{
    public void a();
    public void b(int a);
    public void c(int a,int b);
}
abstract class kk implements intf{
    public void a(){}
    public void b(int a){}
    public void c(int a,int b){}
}
public class adapterClass extends kk{
    public void a(){
        System.out.println("Hello");
    }

  public static void main(String args[]){
    System.out.println("Hello");
  }
}