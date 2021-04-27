
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndOutputStream {
    public static void main(String[] args) {
        //writing file using FileOutputStream
       writeFIleSync();
       //reading file using FileInputStream
       readFileSync();
    }    

    public static void writeFIleSync(){
        byte[] str = "Hi.Hey.Hello.Hola".getBytes();

        try{
            // use FileWriter for CharacterStream Implementation
            FileOutputStream fs = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/newFile.txt");
            fs.write(str);
            fs.close();
        }
        catch(FileNotFoundException notfound){
            System.out.println(notfound);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void readFileSync(){

        //using try with resources
        // use FileReader for CharacterStream Implementation
        try(FileInputStream fs = new FileInputStream("/home/surya/Documents/Oak/src/Streams/newFile.txt")){
            int len = fs.available();
            byte[] result = new byte[len];
            fs.read(result);
            System.out.println(new String(result));   //  Hi.Hey.Hello.Hola
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
