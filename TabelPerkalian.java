package TabelPerkalian;

import java.util.Scanner;

public class TabelPerkalian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();
        
        
        if (n > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
            return;
        }

        
        System.out.println("Tabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
               
                System.out.print(i * j + "\t");
            }
            System.out.println(); 
        }
    }
}
