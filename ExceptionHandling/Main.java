package ExceptionHandling;

import java.util.*;

public class Main{
	public static void main(String[] args){
		int x = 1;
		int y = 0;
		int[] arr = {1, 2, 3, 4, 5};
		try{
			System.out.println("Successful "+ x/y);
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}	
}
