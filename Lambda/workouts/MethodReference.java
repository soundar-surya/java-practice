// package workouts;

/*
Method Reference - assigning different methods to a reference.
*/


interface BoilerPlate{
    void display(String str);
}

interface Compare{
    int compare(String str1, String str2);
}

@interface Description{
    String author() default "soundarsurya";
    String mode();
}

@Description(author = "sound", mode="workouts")
public class MethodReference {
    public static void main(String[] args) {

        //assigning println method to a reference
        BoilerPlate template = System.out::println;
        template.display("It's ok shit happens. That's life");

        //assigning the reference to userdefined methods
        BoilerPlate anotherTemplate = MethodReference::reverse;
        anotherTemplate.display("Hi.Hey.Hello.Hola");

        //example 3
        Compare strings = String::compareTo;
        int result = strings.compare("hello", "hello");
        System.out.println(result == 0 ? true : false);
    }

    private static void reverse(String str){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
}
