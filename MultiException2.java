public class MultiException2{
    public static void main(String[] args){
        System.out.println("----Multiple catch blocks----");
        try{
            int a[]={1,2,3,4,5,6};
            if(a.length>6){
            System.out.println("Array is out of Range");
            }
            System.out.println(a[20]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Exception ArrayIndexOutOfBoundsException handled..!");
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Exception ArithmeticException handled..!");
        }
        catch(NullPointerException e){
            System.out.println(e);
            System.out.println("Exception NullPointerException handled..!");
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Only one catch block execute..");
    }}
