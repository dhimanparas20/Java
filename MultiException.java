public class MultiException{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String s = null;
        int z;
        try {
            System.out.println(arr[6]);
            System.out.println(s.length());
            z = 100/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally");}
        System.out.println("exception over");
    }
}