package Interface;

import java.util.*;

interface Member{
    void callback();
} 

class Customer implements Member{
    String name;

    Customer(String name){
        this.name = name;
    }

    public void callback(){
        System.out.println("Welcome "+this.name);
    }

    public void test(){
        System.out.println("Test...");
    }
}

class Main{
    Member m[] = new Member[100];
    int count = 0;

    public void register(Customer member){
        member.test();
        m[count++] = member;
    }


    // throws error because the reference here is Member which doesn't have test method. 
    // public void register(Member member){
    //     member.test();
    //     m[count++] = member;
    // }

    public void inviteSale(){
        for(int i = 0; i < count; i++){
            m[i].callback();
        }
    }

    public static void main(String args[]){
        Main main = new Main();
        Customer c1 = new Customer("surya");
        Customer c2 = new Customer("soundarsurya");

        main.register(c1);
        main.register(c2);

        main.inviteSale();
    }
}

