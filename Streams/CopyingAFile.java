import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingAFile {
    public static void main(String[] args) {
        // writing to a new file
        writeFileSync("LIFE IS BEAUTIFUL");

        // copying the newFile2.txt
        makeACopy("/home/surya/Documents/Oak/src/Streams/Copy.txt"); 
    }

    public static void writeFileSync(String str){
        try(FileOutputStream fs = new FileOutputStream("/home/surya/Documents/Oak/src/Streams/newFile2.txt")){
            fs.write(str.getBytes());
        }
        catch(IOException e){
            System.out.println(e.getStackTrace());
        }
    }

    public static void makeACopy(String destination){
        try(FileInputStream fs = new FileInputStream("/home/surya/Documents/Oak/src/Streams/newFile2.txt")){
            byte[] content = new byte[fs.available()];
            fs.read(content);
            try(FileOutputStream Fs = new FileOutputStream(destination)){
                Fs.write(new String(content).toLowerCase().getBytes());
                /*
                Alternate solution:
                int b;
                    while((b = Fs.read()) != -1){
                        if(b >= 65 && b <= 90) Fs.write(b+32)
                        else Fs.write(b)
                    }
                */
                System.out.println("Successfully made a copy.");
            }catch(IOException e){
                System.out.println(e.getStackTrace());
            }
        }
        catch(IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}
