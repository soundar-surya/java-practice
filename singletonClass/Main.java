package singletonClass;

/*
singleton class is a class that can be instantiated only once at a time.
*/

class X {
    static int count = 0;
    static int num;
    static X obj = null;

    private X(){
        this.num = 10;
    }

    public static X getInstance(){
        if(count < 2){
            if(obj == null){
                obj = new X();
            }
            count++;
            return obj;
        }
        return null;
    }
}


public class Main{
    public static void main(String args[]){
        X obj1 = X.getInstance();
        X obj2 = X.getInstance();
        X obj3 = X.getInstance();
        X obj4 = X.getInstance();
        System.out.println(obj1 == obj2);  //true
        System.out.println(obj1 == obj3);   //false
    }
}



/*
class X {
    static int count = 0;
    static int num;
    static X obj = null;

    private X(){
        this.num = 10;
    }

    public static X getInstance(){
        if(obj == null){
            obj = new X();
        }
        return obj;
    }
}


public class Main{
    public static void main(String args[]){
        X obj1 = X.getInstance();
        X obj2 = X.getInstance();
        System.out.println(obj1 == obj2);   //true
    }
}
*/