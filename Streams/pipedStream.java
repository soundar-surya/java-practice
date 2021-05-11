/*
Pipe - Passing the output of one process as an input to another process
*/

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class pipedStream {
    public static void main(String[] args) throws Exception{
        PipedInputStream pi = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();

        //connnecting pipes
        pi.connect(po);

        Producer producer = new Producer(po);
        Consumer consumer = new Consumer(pi);

        producer.start();
        consumer.start();
    }
}


class Producer extends Thread{
    
    private OutputStream os;

    public Producer(OutputStream outputStream){
        this.os = outputStream;
    }

    public void run(){
        int count = 1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer -"+count);
                System.out.flush();
                count++;
            }catch(IOException e){}
        }
    }
}


class Consumer extends Thread{
    
    private InputStream is;

    public Consumer(InputStream inputStream){
        this.is = inputStream;
    }

    public void run(){
        int x;
        while(true){
            try{
                x = is.read();
                System.out.println("Consumer -"+x);
                System.out.flush();
            }catch(IOException e){}
        }
    }
}