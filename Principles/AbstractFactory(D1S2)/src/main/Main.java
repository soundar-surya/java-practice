package main;

import java.util.Scanner;

import abstractClasses.Factory;
import abstractClasses.HeadLight;
import abstractClasses.Tire;
import audi.AudiFacotry;
import mercedes.MercedesFactory;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int choice = 0;
		
		Factory factory;
		
		do
		{
			System.out.println("Choose Audi or Mercedes");
			String car=in.nextLine().trim().toLowerCase();
			
			switch(car)
			{
			case "audi":{
				factory=new AudiFacotry();
				break;
			}
			case "mercedes":{
				factory=new MercedesFactory();
				break;
			}
			default:
				factory=null;
			}
			
			if(factory!=null)
			{
				HeadLight headLight=factory.makeHeadLight();
				Tire tire=factory.makeTire();
				headLight.flash();
				tire.start();
			}
			System.out.println("Enter 1 to continue and 0 to stop");
			choice=in.nextInt();
			
		}while(choice==1);
		in.close();
	}

}
