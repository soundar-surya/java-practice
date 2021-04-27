package workouts;

import trash.Trash;

//protected - accessible within same package and inherited by the classes in another packages

class Test extends Trash{
    public static void main(String[] args){
        System.out.println(1);
    }
}

class A{
    protected int x = 1;
}

class B extends A{}

public class Main{
      public static void main(String[] args) {
        Test m = new Test(); 
        //The Trash class is from another package. so, throws error that number is not visible.
          System.out.println(m.number);
      }  
}

/*
if we have that Trash class in the same package. it works. because, the protected fields can be accessible in same package
*/