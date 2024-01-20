package glproject21;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency notes in your country");
		int size = sc.nextInt();
		
		int currency[] = new int[size];
		System.out.println("please enter the Note denomination");
		for(int i=0;i<currency.length;i++) {
			currency[i] =sc.nextInt();
		}
		System.out.println("Before sorting:"+Arrays.toString(currency));
		
		InsertionSort k = new InsertionSort();
		k.sort(currency);
		System.out.println("After sorting:"+Arrays.toString(currency));
		
		System.out.println("Enter amount to exchange");
		int amount= sc.nextInt();
		
		Nodecount k1 = new Nodecount();
		k1.counting(currency, amount);
		
	}

}
