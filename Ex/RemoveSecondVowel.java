//weird - werd, pool - pol, hello - hello, aau - a
package Ex;

import java.util.*;

public class RemoveSecondVowel{

    public static Boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < vowels.length; i++)
            if(c == vowels[i])
                return true;
        return false;
    }

    public static int[] checkNextCharacter(int[] arr){
        int[] res = arr;
        for(int i = 1; i < arr.length; i++)
            if(arr[i] == 1 && arr[i-1] == 1)
                res[i] = -1;

        return res;
    }
     public static char[] generateCharacterArray(char[] charArr, int[] res, String str){
        String result = "";
         for (int i = 0; i < str.length(); i++){
             if(res[i] != -1)
                 result += charArr[i];
         }
         return  result.toCharArray();
     }

     public static int[] assignBinary(char[] charArr){
        int[] indexArray = new int[charArr.length];
         for(int i = 0; i < charArr.length; i++){
             if(isVowel(charArr[i]))
                 indexArray[i] = 1;
             else
                 indexArray[i] = 0;
         }
         return indexArray;
     }

     public static Boolean isTrueString(char[] charArray){
        Boolean flag = true;
        int[] binaryArray = assignBinary(charArray);
        for(int i = 1; i < binaryArray.length; i++){
            if(binaryArray[i] == 1 && binaryArray[i-1] == 1)
                flag = false;
        }
        return flag;
     }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int state = 0;
        String str = in.next();
        char[] charArr = str.toCharArray();
        int[] indexArray = new int[str.length()];

        while(state == 0){
            //assigning binaries for the elements based on vowel(1) or not a vowel(0)
            indexArray = assignBinary(charArr);

            //checking consecutive characters for a vowel match. if so, assign that index -1.
            // so, we have 1 for vowel, -1 for second consecutive vowel, 0 for others.
            int[] res = checkNextCharacter(indexArray);

            //generating new String
            char[] newCharArr = generateCharacterArray(charArr, res, str);

            //checking whether it satisfies the condition. if so, break the loop, else repeat until we get the desired output
            if(isTrueString(newCharArr)){
                System.out.println(new String(newCharArr));
                state = 1;
                break;
            }
            else{
                //System.out.println(newCharArr);
                charArr = newCharArr;
                str = new String(newCharArr);
            }

        }

    }
}