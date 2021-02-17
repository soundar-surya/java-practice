import java.util.*;
import java.lang.*;

public class ReadingInput{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float f= in.nextFloat();
        double d = in.nextDouble();
        char c = in.next().charAt(0);
        String s = in.next();
        in.next();
        String l = in.nextLine();

        System.out.printf("%d %f %f %c %s %s", n, f, d, c, s, l);

    }
}