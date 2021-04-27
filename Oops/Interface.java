package Oops;
import java.util.*;

/*
* interface can have static and default methods
* by default the methods and the var are final.
* */

public interface Interface {
    default void label(){
        System.out.println("Made in China");
    }
    static void description(){
        System.out.println("X");
    }
    void battery();
}