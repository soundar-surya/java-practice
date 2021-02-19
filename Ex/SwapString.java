package Ex;

import java.util.*;

public class SwapString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1+" "+str2);

        //swapping numbers
        int x = 10;
        int y = 20;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x+" "+y);
    }
}