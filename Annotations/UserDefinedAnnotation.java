import java.lang.annotation.Annotation;


@interface About{
	// Elements
	String author();
	String startDate() default "22/4/2021";
}



@About(author="soundarsurya")
public class UserDefinedAnnotation{
	public static void main(String[] args){
		System.out.println("HI.Hey.Hello.Hola");
	}
}


/*
Note:
	- Annotations can be extracted using reflection package.
	- Annotations can be used on class, methods, variables, params.
*/
