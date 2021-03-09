package Oops;

/*
* An abstract method can have constructor, methods with implementation too.
* abstract with static throws error - coz, abstract methods are overwritten by sub classes and it happns at run time.
   but, static methods/variable are compile time elements.
*/
abstract class Phone{
    private static final int priceRange = 30_000;
    Phone(){
        // Constructor
    }
    public abstract void brand();
    public abstract void spec();
    public static void range(){
        System.out.println("The price range is :"+priceRange);
    }
}