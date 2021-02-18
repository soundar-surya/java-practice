package Ex;

import java.util.*;
import java.lang.*;

public class RepeatingSequence{
    public static String checkNextChar(String s1, String s2){
        int len = Math.min(s1.length(), s2.length());

        for(int i = 0; i < len; i++)
            if(s1.charAt(i) != s2.charAt(i))
                return s1.substring(0, i);
        return s1.substring(0, len);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = "";

        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                String res = checkNextChar(str.substring(i, str.length()), str.substring(j, str.length()));

                if (res.length() > result.length())
                    result = res;
            }
        }
        System.out.println(result);
    }
}

/*
    Java Program to find the longest repeating sequence in a string
    acbdfghybdf - bdf
 */

/*
 String result;
        for(int i = 0; i < str.length() - 1; i++){
            result = "";
            int temp = i;
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    result += str.charAt(i);
                    result += checkNextChar(i, j, result, str);
                }

                //result += checkNextChar(temp, j, result, str);
            }
            System.out.println(result);
        }
        //System.out.println(result);

 */