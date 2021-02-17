import java.util.ArrayList;
import java.lang.String;

public class Strings{

    public static void main(String[] args){

        //case : (toUpperCase, toLowerCase, Character.isUpperCase, Character.isLowerCase())
        System.out.println(caseConversion("hey"));
        System.out.println(caseConversion("HEY"));
        System.out.println(caseConversion("*(&123"));

        //String join - Array
        String[] arr = {"Hi", "Hello", "Hey", "Hola"};
        System.out.println(join(arr, "."));

        //String join - ArrayList
        ArrayList<String> a = new ArrayList<String>();
        a.add("hi");
        a.add("hello");
        System.out.println(join(a, "."));

        //
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