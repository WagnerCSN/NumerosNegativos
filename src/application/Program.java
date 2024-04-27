package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar:");
		int number = sc.nextInt();
		int[] array = new int[number];
		for(int x=0 ; x<array.length ; x++) {
			array[x] = sc.nextInt();
		}
		
		System.out.println("Numeros negatigos: ");
		
		for(int x=0 ; x<array.length ; x++) {
			if(array[x]<0) {
				System.out.println(array[x]);
			}
			
		}
		
		sc.close();
		
	}

}
