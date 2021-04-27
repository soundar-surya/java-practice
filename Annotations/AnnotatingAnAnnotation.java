/*
Retention & Target- https://www.mindstick.com/articles/12141/annotations-in-java-target-and-retention
Inherited - https://stackoverflow.com/questions/23973107/how-to-use-inherited-annotation-in-java

meta Annotations(for user defined Annotations)
    - using this meta annotations compiler can enforce the intended functionality during compilation. 
    - Target - where should the user defined annotation applied(method, class, param, fields).
    - Retention - visibility of an annotation(source, runtime, class). for example, runtime rentention makes the user defined annotation available in runtime. source(compiler only can see). class - default, and annotation available in class file
    - Inherited - The subclass inherites the parent's annotations
    - Repeatable - Used in multiple places. interface should be written in new file with public access modifier 
    - Documented - javadoc tool gives description for the annotation that applied on.
*/


import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Inherited
@Target(value={ElementType.MODULE})
@interface Decorator{
    String truth() default "It's ok, shit happens. That's life";
}

@Decorator
public class AnnotatingAnAnnotation {
    public static void main(String[] args) {
        System.out.println("Hi");
    }    
}
