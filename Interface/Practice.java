package Interface;

@FunctionalInterface
interface Interstellar {
    void ratings();
}

public class Practice implements Interstellar{

    public void Music(){
        System.out.println("Music has been composed by Hans Zimmer");
    }

    @Override
    public void ratings(){
        System.out.println(9.1);
    }

    public static void main(String[] args){
        Practice i = new Practice();
        i.Music();          //Music has been composed by Hans Zimmer
        i.ratings();        //9.1

        Interstellar j = new Practice();
        j.ratings();  // 9.1
        
        /*
        throws error, because the ref is Interstellar. it doesn't have Music method
        j.Music();
        */
    } 
}
