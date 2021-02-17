import java.util.*;

public class TypeCasting{
    public static void main(String[] args){
        int i = 1;
        long l = 10000;
        float f = 12.2f;
        double d = 1000.23;

        //Implicit conversion
        //a smaller type will be casted to larger type if there's two different types.
        long r1 = i + l;
        float r2 = l + f;
        double r3 = f + d;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //Explicit conversion

        int explicitConversion = (int)d + i;
        System.out.println(explicitConversion);

        String s = "10";
        int num = 10;
        System.out.println(Integer.toString(num));
        System.out.println(Integer.parseInt(s));
    }
}


/*
byte -> short -> int -> long -> float -> double
*/