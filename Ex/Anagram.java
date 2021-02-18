package Ex;

import java.util.*;
import java.lang.String;

public class Anagram{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        //convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //checking length of the strings
        if (s1.length() != s2.length())
            System.out.println("Not an Anagram.");
        else{
            //convert to character array
            char[] str1 = s1.toCharArray();
            char[] str2 = s2.toCharArray();

            //sorting char arrays
            Arrays.sort(str1);
            Arrays.sort(str2);

            //checking whether it's an Anagram
            if(Arrays.equals(str1, str2) == true)
                System.out.println("It's an Anagram");
            else
                System.out.println("Not an Anagram");
        }


    }
}

/*
commands for execution:
    javac -d ../../classes/ Anagram.java
    java -cp ../../classes/.: Ex.Anagram

 */