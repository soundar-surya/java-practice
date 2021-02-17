import java.util.Arrays;

public class DecToBin{
    public int[] Bin(int[] arr, int num) {
        int count = 0;
        int res;

        while (num > 0) {
            res = num % 2;
            arr[count++] = res;
            num /= 2;
        }
        return arr;
    }
    public static void main(String[] args){
        int num = 5;
        int[] arr = new int[4];


        DecToBin b = new DecToBin();
        //reverse an array
        // ...
        System.out.println(Arrays.toString(b.Bin(arr, num)));

        //utility for binary conversion
        System.out.println(Integer.toBinaryString(num));
    }
}