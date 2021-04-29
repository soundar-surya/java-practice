package Standard;

import java.util.Scanner;
import Standard.PhoneOrderRepair;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to our site. Would you like to order or repair?");
        String processOption = in.nextLine().toLowerCase().trim();
        PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
        String productDetail = "";

        switch(processOption){
            case "order":
                System.out.println("Please provide the phone model name");
                productDetail = in.nextLine().trim();
                phoneOrderRepair.ProcessOrder(productDetail);
                break;
            case "repair":
                System.out.println("Is it the phone or the accessory that you want to be repaired?");
                String productType = in.nextLine().toLowerCase();
                if(productType.equals("phone")){
                    System.out.println("Please provide the phone model name");
                    productDetail = in.nextLine().trim();
                    phoneOrderRepair.ProcessPhoneRepair(productDetail);
                }
                else{
                    System.out.println("Please provide the accessorydetail, like headphone, tempered glass");
                    productDetail = in.nextLine().trim();
                    phoneOrderRepair.ProcessPhoneRepair(productDetail);
                }
                break;
            default:
                break;
        }
    }   
}
