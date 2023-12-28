class OwnException extends Exception{
    public OwnException(String message){
        super(message);
    }
}
public class exception3 {
    void m1() throws OwnException{
        throw new OwnException("System error");
    }
    void m3(){
        try{
            m1();
        }
        catch(OwnException e){
            System.out.println("---------------------------");
            System.out.println(e);
            System.out.println("catch exception Here");
        }

    }
    public static void main(String[] args){
        System.out.println("---Throws user-defined exception---");
            exception3 obj=new exception3();
            obj.m3();
        System.out.println("Exception handled Sucessfully..!");
    }
}
