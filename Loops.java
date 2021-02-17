public class Loops{
    public static void main(String[] args){
        String[] languages = {"javaScript", "java", "python", "C", "golang"};
        int count = languages.length - 1;

        //for loop
        for(int i = 0; i < languages.length; i++)
            System.out.println(languages[i]);

        System.out.println("***************");

        //forEach
        for(String lang: languages)
            System.out.println(lang);

        System.out.println("***************");

        //while
        while(count > 0)
            System.out.println(languages[count--]);

        System.out.println("***************");

        //do-while
        do{
            System.out.println("Hi.Hey.Hello.Hola");
        }while (false);
    }
}