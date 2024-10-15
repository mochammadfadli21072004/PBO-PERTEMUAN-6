package LaguAnakAyam;

import java.util.Scanner;

public class LaguAnakAyam {

    
    public static void laguWithFor(int n) {
        System.out.println("Menggunakan For Loop:");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati satu habis semua.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
        System.out.println();
    }

   
    public static void laguWithWhile(int n) {
        System.out.println("Menggunakan While Loop:");
        int i = n;
        while (i >= 1) {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati satu habis semua.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
            i--;
        }
        System.out.println();
    }

    
    public static void laguWithDoWhile(int n) {
        System.out.println("Simulasi Do-While Loop:");
        int i = n;
        do {
            if (i == 1) {
                System.out.println("Anak ayam turun 1, mati satu habis semua.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
            i--;
        } while (i >= 1);
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int n = scanner.nextInt();

      
        laguWithFor(n);     
        laguWithWhile(n);   
        laguWithDoWhile(n);  
    }
}
