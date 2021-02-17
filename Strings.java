import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

public class Strings{

    public static void main(String[] args){

        //case : (toUpperCase, toLowerCase, Character.isUpperCase, Character.isLowerCase())
        System.out.println(caseConversion("hey")); //Hey
        System.out.println(caseConversion("HEY")); //hey
        System.out.println(caseConversion("*(&123")); //Invalid String

        //String join - Array
        String[] arr = {"Hi", "Hello", "Hey", "Hola"};
        System.out.println(join(arr, ".")); //Hi.Hey.Hello.Hola

        //String join - ArrayList
        ArrayList<String> a = new ArrayList<String>();
        a.add("hi");
        a.add("hello");
        System.out.println(join(a, "."));  //hi.hello

        //string split
        String str = "Hi Hey Hello Hola";
        System.out.println(Arrays.toString(split(str)));  // ["Hi", "Hey", "Hello", "Hola"]

        //converting string to char arr and vice versa
        System.out.println(Arrays.toString(compare("Julia")));  //['j', 'u', 'l', 'i', 'a']
        System.out.println(compare(new char[]{'R', 'u', 'b', 'y'})); // Ruby

        //equality & comparison
        System.out.println(isEqual("Hey", "hey"));  // true
        System.out.println(lexicographicalComparison("node", "react"));  //4

        //indexOf
        System.out.println(new String("Redis").indexOf('R')); // 0

        //charAt
        System.out.println(new String("RabbitMQ").charAt(1));  // a
    }

    //equals
    public static Boolean isEqual(String s1, String s2){
        // s1.equals(s2) -> for identical case
        return s1.equalsIgnoreCase(s2);
    }

    //lexicographical comparison
    public static int lexicographicalComparison(String s1, String s2){
        /*
            * s1 > s2 -> val >= 1
            * s1 < s2 -> val <= 0
        */
        return s1.compareTo(s2);
    }

    // str -> char arr
    public static char[] compare(String str){
        return str.toCharArray();
    }
    //method overloading char arr -> str
    public static String compare(char[] charArray){
        /*
            * String.valueOf(arr)
            * new String(arr)
        */
        return new String(charArray);
    }

    //split
    public static String[] split(String str){
        return str.split(" ", 0);
    }

    //join
    public static String join(String[] arr, String delimiter){
        return String.join(delimiter, arr);
    }
    //method overloading - join
    public static String join(ArrayList<String> arr, String delimiter){
        return String.join(delimiter, arr);
    }


    //method that checks the passed argument's case
    public static String checkTheCase(String payload){

        Boolean state = false;
        char[] arr = payload.toCharArray();

        for(char c: arr){
            if(Character.isUpperCase(c))
                state = true;
            else
                state = false;
        }

        if(state == true)
            return "upper";
        return "lower";
    }

    //check string
    public static Boolean checkIfString(String str){

        Boolean state = false;
        char[] arr = str.toCharArray();

        for(char c: arr)
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    state = true;
        return state;
    }

    //function that converts lowercase to uppercase and vice versa.
    public static String caseConversion(String str){
        if(checkIfString(str) == false)
            return "Invalid String";
        String stringCase = checkTheCase(str);
        if(stringCase == "upper")
            return str.toLowerCase();
        return str.toUpperCase();
    }

}

/*
    * string(immutable), stringBuffer(mutable), StringBuilder(mutable) uses characterSequence interface to represent sequence of characters.
    * the reason why string was immutable  - coz, it uses string constant pool. in SCP if there's many variable have same string value only one instance
        will be created and that reference is passed to those variables..if the string was mutable, the value would change. then, it gets effect in all variables that
        holds that ref.
* */