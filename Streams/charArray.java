// package Streams;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;

public class charArray {
    public static void main(String[] args) throws Exception {
        charArrayReader();
        charArrayWriter();
    }    

    public static void charArrayReader() throws Exception{
        char[] ch = {'H', 'e', 'l', 'l', 'o'};
        CharArrayReader charReader = new CharArrayReader(ch);

        int i;
        while((i = charReader.read()) != -1){
            System.out.println((char)i);
        }
    }

    public static void charArrayWriter(){
        CharArrayWriter charWriter = new CharArrayWriter(5);
        charWriter.write('h');
        charWriter.write('i');

        char[] ch = charWriter.toCharArray();
        System.out.println(new String(ch));
    }
}
