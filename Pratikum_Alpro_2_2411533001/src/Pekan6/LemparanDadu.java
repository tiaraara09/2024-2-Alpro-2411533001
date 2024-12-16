package Pekan6;

import java.util.Random;
import java.util.Scanner;

public class LemparanDadu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int skor = 0, kesalahan = 0;

        System.out.println("Tebak total angka dari dua dadu");

        while (kesalahan < 3) {
            System.out.print("Tebakan: ");
            int tebakanPengguna = scanner.nextInt();
            int hasilDadu1 = random.nextInt(6) + 1;
            int hasilDadu2 = random.nextInt(6) + 1;
            int totalDadu = hasilDadu1 + hasilDadu2;

            if (tebakanPengguna == totalDadu) {
                skor += 10;
                System.out.println("Benar! Skor: " + skor);
            } else {
                kesalahan++;
                System.out.println("Salah! Dadu: " + hasilDadu1 + " + " + hasilDadu2 + " = " + totalDadu + " | Kesalahan: " + kesalahan);
            }
        }

        System.out.println("Game over! Skor akhir: " + skor);
        scanner.close();
    }
}