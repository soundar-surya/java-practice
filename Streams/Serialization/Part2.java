import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Part2 implements Serializable{
    public static void main(String[] args) throws Exception{
        //writing to file as an Object
        writeFileSync();
        readFileSync();
    }

    public static void writeFileSync() throws Exception {
        FileOutputStream fos = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/Serialization/requirement.txt");
        ObjectOutputStream dos = new ObjectOutputStream(fos);
        BreakingBad  bb = new BreakingBad();
        bb.cast1 = "Walter White";
        bb.cast2 = "Jesse Pinkman";
        bb.helper = "Saul Goodman";
        bb.episodes = 62;
        dos.writeObject(bb);
        dos.close();
    }
    public static void readFileSync() throws Exception {
        FileInputStream fis = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Serialization/requirement.txt");
        ObjectInputStream dis = new ObjectInputStream(fis);
        BreakingBad  bb  = (BreakingBad) dis.readObject();
        System.out.println(bb.cast1 + "| " + bb.cast2 + "| " +bb.helper + "| " + bb.episodes);
        dis.close();
    }
}

//Static fields are not stored in File
// Inorder to use ObjectOuptutStream & objectInputStream the blow class should implement the Serializable Interface.

class BreakingBad implements Serializable {

    String cast1;
    String cast2;
    String helper;
    int episodes;
    BreakingBad() {}
}