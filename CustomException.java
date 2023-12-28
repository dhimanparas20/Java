class MyException extends Exception{
    MyException(String S){
        super(S);
    }
}

public class CustomException{
    public static void main(String[] args){
       try{
        //int x = 100/0;
        throw new MyException("this is custom exception");

       }
       catch(MyException me) {
         System.out.println(me.getMessage());
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       finally{
        System.out.println("finally");}
    System.out.println("exception over");
       }
}