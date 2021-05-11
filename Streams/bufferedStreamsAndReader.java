import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class bufferedStreamsAndReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream("/home/surya/Documents/Oak/src/Streams/newFile.txt");
        // using bufferedStream
        BufferedInputStream bufferedStream = new BufferedInputStream(fs);

        // Only buffered stream/reader supports mark & reset 
        System.out.println(fs.markSupported());              //false
        System.out.println(bufferedStream.markSupported());         //true

        //reading data
        System.out.println((char)bufferedStream.read());  // H
        System.out.println((char)bufferedStream.read());  // i
        bufferedStream.mark(10);  // mark set for .
        System.out.println((char)bufferedStream.read()); // .
        System.out.println((char)bufferedStream.read()); // H
        bufferedStream.reset();   //resetting
        System.out.println((char)bufferedStream.read()); // .
        System.out.println((char)bufferedStream.read()); // H
        System.out.println("__________________________________");
        //using BufferedReader
        FileReader fr = new FileReader("/home/surya/Documents/Oak/src/Streams/newFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);

        //reading data
        System.out.println((char)bufferedReader.read());  // H
        System.out.println((char)bufferedReader.read());  // i
        bufferedReader.mark(10);  // mark set for .
        System.out.println((char)bufferedReader.read()); // .
        System.out.println((char)bufferedReader.read()); // H
        bufferedReader.reset();   //resetting
        System.out.println((char)bufferedReader.read()); // .
        System.out.println((char)bufferedReader.read()); // H
        bufferedReader.close();
     }
    
}