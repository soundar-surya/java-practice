
//package workouts;

import java.util.*;
import java.lang.reflect.Array;

//user defined datatype
enum Fav {
    JS, GO, ERLANG, ELIXIR;
}

//assigning values to enum
enum AssignValues {
    JS("dynamic", "multi paradigm");

    private String nature;
    private String type;

    private AssignValues(String nature, String type){
        this.nature = nature;
        this.type = type;
    }

    public String getNature(){
        return nature;
    }

    public String getType(){
        return type;
    }

}

public class Enum {
  public static void main(String[] args) {
    
    Fav oneOfMyFavLangs = Fav.JS; 
    Fav[] arrayOfFavLang = Fav.values();

    System.out.println(Arrays.toString(arrayOfFavLang));    //  [JS, GO, Erlang, Elixir]
    System.out.println(oneOfMyFavLangs);    //   JS


    AssignValues val = AssignValues.JS;
    System.out.println(val.getNature());  // dynamic
  }  
}
