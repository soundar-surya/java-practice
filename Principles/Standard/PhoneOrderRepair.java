package Standard;

public class PhoneOrderRepair implements Template {
    public void ProcessAccessoryRepair(String accessoryType){
        System.out.printf("%s repair accepted!", accessoryType);
    }
    public void ProcessOrder(String modelName){
        System.out.printf("%s order accepted!", modelName);
    }

    public void ProcessPhoneRepair(String modelName){
        System.out.printf("%s repair accepted!", modelName);
    }
}
