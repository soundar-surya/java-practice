import java.math.*;

public class BinToDec{
    public static Integer Dec(String bin){
        int res = 0;

        for(int i = 0; i < bin.length(); i++)
            if(Integer.parseInt(String.valueOf(bin.charAt(i))) == 1)
                res += Math.pow(2, i);
        return res;
    }
    public static void main(String[] args){
        int Decimal = Dec("101");
        System.out.println(Decimal);

        System.out.println(Integer.parseInt("101", 2));  //5
    }
}

/*
* String.valueOf() converts types to string.
*/