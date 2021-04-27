public class Constructor{
    private String var = "Hola Amigo";
    int num;
    String str;
    Constructor(){
        this.num = 1;
        this.str = "let the honey flow!";
    }
    Constructor(String s, int n){
        this.num = n;
        this.str = s;
    }

    public static void main(String[] args){
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("cisco", 0);

        System.out.println(obj1.var);  //Hola Amigo
        System.out.println(obj1.str);  //let the honey flow
        System.out.println(obj2.str);  //cisco
        System.out.println();
    }
}