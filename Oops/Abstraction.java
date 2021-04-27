package Oops;
import Oops.Phone;
import java.util.*;

public class Abstraction extends Phone implements Interface{
    public void brand(){
        System.out.println("Apple");
    }
    @Override
    public void spec(){
        System.out.println("4gb ram with 2.4GHZ clockspeed");
    }
    @Override
    public void battery(){
        System.out.println("2800 mAh");
    }
    public static void main(String[] args){
        Abstraction abs = new Abstraction();
        abs.brand();
        abs.spec();
        Phone.range();

        //interface
        Interface.description();
        //abs.label();

        //anonymous inner class
        Interface i = new Interface() {
            @Override
            public void battery(){
                System.out.println("3000 mAh");
            }
        };
        i.battery();
        abs.battery();
    }
}
/*

output -----

Apple
        4gb ram with 2.4GHZ clockspeed
        The price range is :30000
        X
        3000 mAh
        2800 mAh
*/