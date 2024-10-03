package Pekan3;

import java.util.Scanner;

public class OperatorRelasional {

	public static void main(String[] args) {
		int x;
		int y;
		boolean hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1 ");
		x = keyboard.nextInt();
		System.out.println("Input angka-2 ");
		y = keyboard.nextInt();
		keyboard.close();
		hasil = x > y; //apakah x lebih besar y?
		System.out.println("x > y = " + hasil);
		hasil = x < y; //apakah x lebih kecil y?
		System.out.println("x < y = " + hasil);
		hasil = x >= y; //apakah x lebih besar sama y?
		System.out.println(" x >= y = " + hasil);
		hasil = x <= y; //apakah x lebih kecil sama y?
		System.out.println("x <= y = " + hasil);
		hasil = x == y; //apakah x sama dengan y?
		System.out.println(" x == y = "+ hasil);
		hasil = x != y; //apakah x tidak sama dengan y?
		System.out.println(" x != y = " + hasil);
		
				
		


	}

}
