/*
input: FUN
output:
    F, FU, FUN, U, UN, N
 */

package Ex;

import java.util.*;

public class SubsetOfString{

    public static void print(int len, String str){
        if(len == 1)
            System.out.println(str);
        else {
            for (int i = 0; i < len; i++) {
                System.out.println(str.substring(0, i + 1));
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //reading input
        String str = in.next();

        for(int i = 0; i < str.length(); i++)
            print(str.substring(i, str.length()).length(), str.substring(i, str.length()));

    }
}