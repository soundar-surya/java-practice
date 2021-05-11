import java.io.RandomAccessFile;

/*
Simultaneously Reading and writing a file is possible with RandomFIleAccess
*/

public class randomAccessFile {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("/home/surya/Documents/Oak/src/Streams/newFile2.txt", "rw");        
        System.out.println((char)raf.read());  // L
        System.out.println((char)raf.read());  // I
        System.out.println(raf.getFilePointer());  //returns the index of a byte that pointer is currently pointing on
        raf.write('f');  //writing a byte on index 2
        raf.seek(0);  // hoping to index 0
        System.out.println((char) raf.read());  // L

    }    
}
