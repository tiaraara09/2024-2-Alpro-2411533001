package Pekan3;

import java.util.Scanner;

public class OperatorAssigment {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assigment Penambahan ");
		A1 += A2; //penambahan, sekarang A1 = 15
		System.out.println("Penambahan : " + A1);
		System.out.println(" Assigmen Pengurangan ");
		A1 -= A2; //pengurangan, sekarang A1= 10
		System.out.println("Pengurangan : " + A1);
		System.out.println("Assigment Perkalian ");
		A1 *= A2; //perkalian, sekarang A1= 50
		System.out.println(" Perkalian : " + A1);
		System.out.println("Assigment Pembagian ");
		A1 /=A2; //pembagian, sekarang A1= 10
		System.out.println("Pembagian : " + A1);
		System.out.println("Assigmen Sisa Pembagian ");
		A1 %=A2; //Sisa pembagian, sekarang A1= 0
		System.out.println("Sisa Pembagian : " + A1);
		

	}

}
