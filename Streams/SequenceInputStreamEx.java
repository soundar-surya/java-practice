import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamEx {
    public static void main(String[] args) {
        try{
            FileInputStream fs1 = new FileInputStream("/home/surya/Documents/Oak/src/Streams/newFile.txt");
            FileInputStream fs2 = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Streams.txt");
            SequenceInputStream newFile = new SequenceInputStream(fs1, fs2);
            // byte[] res = new byte[newFile.available()];
            // newFile.read(res);
            // System.out.println(new String(res));
            int j;
            FileOutputStream fs3 = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/newFile3.txt");
            while((j=newFile.read()) != -1){
                // System.out.println((char)j);
                fs3.write(j);
            }
            // fs3.write(res);
            fs1.close();
            fs2.close();
            fs3.close();
            newFile.close();
        }
        catch(IOException e){
            System.err.println(e.getStackTrace());
        }
    }
}
