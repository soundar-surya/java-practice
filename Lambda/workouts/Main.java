import java.util.*;

@FunctionalInterface
interface Template{
    void display();
}

public class Main {
    public static void main(String[] args) {
        //Throws error
        // int x = 1;
        // Template cb = () -> System.out.println("cuckoo cuckoo"+x);
        // cb.display();
        // x++;

        Template cb = () -> System.out.println("cuckoo cuckoo");
        cb.display();

        //passing function as a parameter
        show(() -> System.out.println("Ah Ah"));

    }

    public static void show(Template cb){
        cb.display();
    }
    
}

/*
- non final local variables in a method where the lambda function cannotbe used inside the lambda functions.
- but,the variables blong to class can be used. 

*/