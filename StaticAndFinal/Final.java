package StaticAndFinal;

/*
Final can't be overwritten, can be initialized only inside instance block/constructor
Final methods are not overridden
Final class are not inherited. but, an object can be created
*/

abstract class Abs{
    final public void finalMethod(){
        System.out.println("Final method");
    }
}

final public class Final extends Abs{
    final int NUM;
    final int N;
    final String str = "Hola";

    //initializing in constructor
    Final(){
        this.N = 0;
    }

    //initializing in instance block
    {
        NUM = 1;
    }

    /* throws error while trying to override final method
    @Override
    public void finalMethod() {}
    */
    public static void main(String[] args){
        Final f = new Final();
        f.finalMethod();
    }
}

/*
Throws error
    class Child extends Final{
    }
*/

