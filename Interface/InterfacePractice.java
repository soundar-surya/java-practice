package Interface;

/*
NOTE:
    - one interface can extend another interface
    - by default the variables are final static
    - from java 8,9 we can have static default, private methods in interface
    - if we modify the iterface the classes that implements the interface will break. in order to avoid that we can use default methods which will not
        break the code.
    - private methods are used with default methods. which helps default methods.

*/

interface A{
    int h = 1;
    void x();
    //static method
    static void y(){
        System.out.println("Hello from method Y");
    }

    //default method
    default void z(){
        call();
    }
    
    //private method
    private void call(){
        System.out.println("Hello from method Z");
    }
}

interface B extends A{
    void c();
}

public class InterfacePractice implements B {
    
    @Override
    public void x(){
        System.out.println("Hello from method X");
    }

    @Override
    public void c(){
        System.out.println("Hello from method C");
    }

    public static void main(String args[]){
        InterfacePractice i = new InterfacePractice();
        A.y();
        //B.y();  error
    }
}
