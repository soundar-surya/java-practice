// package Singleton;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class Singleton{
    static private Singleton instance = null;

    private Singleton(){
    }

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

    public void getConnection(){
        try{
            //Registering JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Opening a connection
            System.out.println("Connecting to a selected database...");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Truyum", "root", "quackquack");
            System.out.println("Connected database successfully...");

            //Executing a query
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM AdminPanel");
            while(rs.next()){
                //Retrieving data    
                String name = rs.getString(1);
                System.out.println(name);
            }
            //closing the connection
            rs.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("\n-------------------------------\n          "+obj1.equals(obj2)+"\n-------------------------------");  //true
        obj1.getConnection();
    }
}
