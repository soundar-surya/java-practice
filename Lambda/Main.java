package Lambda;

import java.util.*;

class Main{
    Main(){
        System.out.println("Initiate spin...");
    }

    public static void main(String[] args){
        Template greetings = name -> "welcome " + name;
        greet("surya", greetings);
        Template sayHello = callback();
        System.out.println(sayHello.log("sound"));


    }

    protected static Template callback(){
        return str -> "Hello " + str;
    }

    protected static void greet(String name, Template greetings){
        System.out.println(greetings.log(name));
    }
}