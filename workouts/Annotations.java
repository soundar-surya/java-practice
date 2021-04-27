// package workouts;

import java.util.*;

/*
Annotations - provides meta data of a method
Annotations that gives instructions to raise warnings in compile time are:
        - @Override
        - @Deprecated
        - @SuppressWarnings("unchecked" || "deprecation")
        - @SafeVarArgs
        @FunctionalInterface

*/

abstract class Abs{
    
    abstract public void display();

    @Deprecated
    public void oldMen(){
        System.out.println("No country for old men");
    }
}

public class Annotations extends Abs{

    @Override
    public void display(){
        System.out.println("Override");
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Annotations obj = new Annotations();
        obj.oldMen();
    }

}
