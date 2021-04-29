// package Streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class byteStream {
    public static void main(String[] args) {
        InputStream();
        outputStream();
    }    

    public static void InputStream(){
        byte[] byteArray = {'H', 'e', 'y'};
        ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteArray);
        int i;
        while((i=byteInputStream.read()) != -1){
            System.out.println((char)i);
        } 
    }

    public  static void outputStream(){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(5);
        byteArrayOutputStream.write('h');
        byteArrayOutputStream.write('o');
        byteArrayOutputStream.write('l');
        byteArrayOutputStream.write('a');

        byte[] b = byteArrayOutputStream.toByteArray();
        System.out.println(new String(b));
    }
}
