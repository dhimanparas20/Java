//File IO operations 
import java.io.FileInputStream;
import java.io.FileOutputStream;

class WriteData{
    WriteData(){
        try{
          FileOutputStream fout = new FileOutputStream("fileoOut.txt");
          String s = "Hello from paras into a txt file.";
          byte[] b = s.getBytes();
          fout.write(b);
          fout.close();
        } catch(Exception e){}
    }
}   
class ReadData{
   ReadData(){
        try{
            FileInputStream fin = new FileInputStream("fileoOut.txt");
            int i = 0;
            while ((i=fin.read())!= -1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception E){}
    } 
} 
public class FileIO {
 public static void main(String[] args){
    WriteData obj = new WriteData();
    ReadData obj2 = new ReadData();
 }
}