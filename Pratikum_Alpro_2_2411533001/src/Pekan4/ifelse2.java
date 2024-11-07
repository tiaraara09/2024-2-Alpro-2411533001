package Pekan4;

import java.util.Scanner;

public class ifelse2 {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a= new Scanner(System.in);
		System.out.print("Input umur anda: ");
		umur= a.nextInt();
		System.out.print("Apakah Anda sudah memiliki SIM C: ");
		sim= a.next().charAt(0);
		a.close();
		if ((umur>= 17) && (sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh membawa motor");
		}
		else if((umur>=17) && (sim!='y')) {
			System.out.println("Anda sudah dewasa tetapi tidak diizinkan membawa motor");
		}
		else if((umur < 17) && (sim!='y')) {
			System.out.println("Anda belum dewasa dan tidak memiliki SIM");
		}
		else if((umur < 17) && (sim=='y')) {
			System.out.println("Anda belum dewasa tetapi sudah memiliki SIM");
		}
			}

}
