package InnerClasses;

/*
Innerclasses:
    - nested innerclass
    - class inside method
    - static inner class
    - anonymous inner class
*/

// Nested InnerClass
public class NestedInnerclass {
    int x = 1;
    static int t = 1;

    //class inside class
    class InnerClass{
        int y = 0;

        public void display(){
            System.out.println(x+y);
        }
    }
    
    //class inside method
    public void classInsideMethod(){
        class Child{
            public void display(){
                System.out.println("Hello from local Child class....");
            }
        }

        new Child().display();
    }

    public void show(){
        InnerClass b = new InnerClass();
        b.display();
    }

    //static inner class class
    public static class StaticClass{
        public void display(){
            System.out.println("Hello from static inner class");
        }
    }

    public static void main(String[] args){
        NestedInnerclass n = new NestedInnerclass();
        //calling method that calls the inner class
        n.show();
        //calling the method that has class
        n.classInsideMethod();

        //calling static class - can be called using obj / class name
        System.out.println(n.t);   //1
        System.out.println(NestedInnerclass.t);  //1
        new NestedInnerclass.StaticClass().display();

    }
}


/*
for instantiating class inside class in some other class
    - type <name> = new type().new ssubClassname();


for instantiating static class inside class in some other class
    - type <name> = new type.new ssubClassname();


eg:
public class Main
{
	public static void main(String[] args) {
		NestedInnerclass n = new NestedInnerclass();
		//calling class indide method
		n.classInsideMethod();
		//static method
		NestedInnerclass.StaticClass s = new NestedInnerclass.StaticClass();
		s.display();
		//calling innerclass
		NestedInnerclass.InnerClass in = new NestedInnerclass().new InnerClass();
		in.display();
	}
}

*/