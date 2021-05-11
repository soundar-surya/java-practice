import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class EX1 {
    public static void main(String[] args) throws Exception {
        float[] arr = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f};
        writeFileSync(arr);
        readFileSync();
    }

    public static void writeFileSync(float[] arr) throws Exception{
        FileOutputStream fos = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/Serialization/erercise.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        int len = arr.length;
        dos.writeInt(len);
        for(int i = 0; i < len; i++) {
            dos.writeFloat(arr[i]);   
        }
        dos.close();
    }
    
    public static void readFileSync() throws Exception{
        FileInputStream fis = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Serialization/erercise.txt");
        DataInputStream dis = new DataInputStream(fis);
        int len = dis.readInt();
        for(int i = 0; i < len; i++) {
            System.out.println(dis.readFloat());
        }
        dis.close();
    }
}
