package Ex;

import java.util.Scanner;

public class Permutation{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        permutations(str, 0, str.length());
    }

    public static void permutations(String str, int start, int end){
        if(start == end - 1)
            System.out.println(str);
        else{
            for(int i = start; i < end; i++){
                str = swap(str, start, i);
                permutations(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char c = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = c;

        return String.valueOf(charArray);
    }
}