package Pekan4;

import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a= new Scanner(System.in);
		System.out.print("Input umur anda: ");
		umur= a.nextInt();
		System.out.print("Apakah Anda Sudah Punya SIM C: ");
		sim=a.next().charAt(0);
		a.close();
		if((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh membawa motor");
		}
		if((umur>=17)&&(sim!='y')) {
			System.out.println("Anda sudah dewasa tetapi tidak dibolehkan membawa motor");
		}
		if((umur<17)&&(sim!='y')) {
			System.out.println("Anda belum cukup umur untuk membawa motor");
		}
		if((umur<17)&&(sim=='y')) {
			System.out.println("Anda belum cukup umur untuk membawa motor, meski telah memiliki SIM");
		}			

	}

}
