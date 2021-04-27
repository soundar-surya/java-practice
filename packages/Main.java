package packages;

import java.util.*;
import Oops.Interface;

class Main implements Interface {
    Main(){
        System.out.println("Main constructor is called...");
    }

    @Override
    public void battery(){
        System.out.println("5000 mAh");
    }

    public static void main(String[] args){
        Main m = new Main();
        m.label();
        Interface.description();
    }
}