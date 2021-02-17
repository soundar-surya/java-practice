import java.util.Arrays;

public class Random {
    public static void main(String[] args){
        //pass by value
        int[] arr1 = {1, 2};
        int[] arr2 = new int[2];
        arr2 = arr1;
        System.out.println(arr1 == arr2);  //true

        //strings
        String s = "Hello";  //this will be stored in string pool in Heap
        System.out.println(s.toUpperCase());  //HELLO
        System.out.println(Character.isUpperCase('A'));  //true
        System.out.println(s.charAt(1)); //e

        //object string
        String str = new String("Hello"); //sine it's an object, it'll be stored in the Heap

        //String.join
        System.out.println(String.join(".", "Hi", "Hey", "Hello", "Hola")); //Hi.Hey.Hello.Hola

        //String.equals
        System.out.println(s.equals("Hello"));  //true

        //String.split()
        System.out.println(Arrays.toString("Hi Hello Hey Hola".split("\\s", 2))); //[Hi, Hello Hey Hola]
        System.out.println(Arrays.toString("Hi.Hello.Hey.Hola".split("\\.", 2))); //[Hi, Hello.Hey.Hola]

        //float
        double f = 10.1234567;
        System.out.println(String.format("%.2f", f));   //10.12
    }
}