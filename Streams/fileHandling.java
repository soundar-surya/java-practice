import java.io.*;

public class fileHandling {
    public static void main(String[] args) {
          File fs = new File("/home/surya/Documents/Oak/src/Streams/newFile.txt");
          System.out.println(fs.getName()+"--"+fs.getAbsolutePath());
          
          File dir = new File("/home/surya/Documents/Oak/src/Streams");
          String[] list = dir.list();
          for (String fileName : list) {
              System.out.println(fileName);
          }
          System.out.println("---------------");
          File[] files = dir.listFiles();
          for (File file : files) {
              System.out.println(file.getName());
          }
    }    
}
