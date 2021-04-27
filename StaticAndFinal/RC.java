package StaticAndFinal;

/*
rf - https://dev.to/njnareshjoshi/why-an-outer-java-class-can-t-be-static-1fef
- static var/methods can be called by className and object as well.
- static belongs to class. whereas non-static belongs to an object.
- static - metadata(Data about a data).
- static method/var is created in method area in compile time
*/
public class RC {
    static int price = 204_000;     //base price - belongs to RC class
    String Variant;                        //  BS6 || BS4 - belong to objects 

    //constructor
    RC(){}

    public static double onRoadPrice(String city){
        switch(city){
            case "coimbatore":
                return price +( price * 0.1);
            case "chennai":
                return price +( price * 0.3);
            default:
            return price +( price * 0.2);
        }
    }

    public static void main(String[] args){
        double onRoad = RC.onRoadPrice("coimbatore");
        System.out.println(onRoad);

        //calling static methods using objects
        RC electronicOrange = new RC();
        electronicOrange.Variant = "BS6";
        System.out.println(electronicOrange.Variant);
        System.out.println(electronicOrange.onRoadPrice("chennai"));
    }

}
