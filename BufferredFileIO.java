//File IO operations 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

class WriteData {
    WriteData() {
        try {
            FileOutputStream fout = new FileOutputStream("fileOut.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Hello from paras into a txt file.";
            byte[] b = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace(); // Handle the exception properly
        }
    }
}   
class ReadData{
   ReadData(){
        try{
            FileInputStream fin = new FileInputStream("fileoOut.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            while ((i=bin.read())!= -1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch(Exception E){}
    } 
} 
public class BufferredFileIO {
 public static void main(String[] args){
    WriteData obj = new WriteData();
    ReadData obj2 = new ReadData();
 }
}