package Pekan6;

import java.util.Random;
import java.util.Scanner;

public class LemparanDadu {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		Random rand = new Random();
		int tries = 0;
		int sum= 0;
		int t= 0;
		int n;
		n= a.nextInt();
		while (t != n) {
		int dadu1 = rand.nextInt(6) + 1;
		int dadu2 = rand.nextInt(6) + 1;
		sum = dadu1 + dadu2;
		System.out.println(dadu1 + " + " + dadu2+ " = " + sum);
		tries++;
	}
	System.out.println("You won after " + tries + "tries ");
		
		
		

	}

}
