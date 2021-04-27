// package workouts;

public class BuilderAndBuffer {
    public static void main(String[] args) {
        //Immutable, it uses string pool
        String s1 = "Hi";

        //synchronous, mutable, thread safe ( multiple threads cannot access this simultaneously )
        StringBuffer s2 = new StringBuffer("Hello");

        //same as StringBuffer, but it is faster & not thread safe.( simultaneously accessble by multiple threads )
        StringBuilder s3 = new StringBuilder("Hola");

        s1.concat(".Hello");  //returs a new String
        s2.append(".Hola");  //returns a modified string
        s3.append(".Hi"); //returns a modified string

        System.out.println(s1 + "--" + s2+"--"+s3);
    }
}
