import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class Part1 {
    public static void main(String[] args) throws Exception{
        
        // writing everything as a string
        write();  
        read();

        //using dataInput and output - writing based on it's datatype
        writeWithOutputStream();
        readWithInputStream();
    }

    public static void writeWithOutputStream() throws Exception {
        FileOutputStream fs = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/Serialization/anotherfile.txt");
        DataOutputStream dos = new  DataOutputStream(fs);
        Me i = new Me("soundarsurya", 21, "sharon stone");
        dos.writeUTF(i.name);
        dos.writeInt(i.age);
        dos.writeUTF(i.favActress);
        dos.close();
    }

    public static void readWithInputStream() throws Exception {
        FileInputStream fs = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Serialization/anotherfile.txt");
        DataInputStream dis = new DataInputStream(fs);
        Me i = new Me(dis.readUTF(), dis.readInt(), dis.readUTF());
        System.out.println(i.name + " " + i.age+ " " + i.favActress);
        dis.close();
    }

    public static void  write() throws Exception{
        FileOutputStream fs = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/Serialization/file.txt");
        //writing string is not possible using FileOutputStream. it is possible using PrintStream
        PrintStream ps = new PrintStream(fs);

        Me i = new Me("soundarsurya", 21, "sharon stone");
        ps.println(i.name);
        ps.println(i.age);
        ps.println(i.favActress);
        ps.close();
    }

    public static void read() throws Exception{
        FileInputStream fs = new FileInputStream("/home/surya/Documents/Oak/src/Streams/Serialization/file.txt");
        //FileInputStream read as bytes. so, converting it to BufferedReader for reading strings.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fs));

        Me i = new Me(bufferedReader.readLine(), Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine());
        System.out.println(i.name+" "+i.age+" "+i.favActress);  //soundarsurya 21 sharon stone
        bufferedReader.close();
    } 
}
class Me{
    String name;
    int age;
    String favActress;

    public Me(String Name, int Age, String FavActress){
        this.name = Name;
        this.age = Age;
        this.favActress = FavActress;
    }

    public void show(){
        System.out.println(name+" "+age+" "+favActress);
    }
}
