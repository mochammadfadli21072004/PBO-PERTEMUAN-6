package BilanganGanjilGenap;

public class BilanganGanjilGenap {

    
    public static void ganjilGenapWithFor() {
        System.out.println("Menggunakan For Loop:");
        
        System.out.print("Bilangan Genap: ");
        for (int num = 0; num <= 20; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nBilangan Ganjil: ");
        for (int num = 0; num <= 20; num++) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    
    public static void ganjilGenapWithWhile() {
        System.out.println("Menggunakan While Loop:");
        
        int num = 0;
        System.out.print("Bilangan Genap: ");
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        }

        num = 0;
        System.out.print("\nBilangan Ganjil: ");
        while (num <= 20) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("\n");
    }

   
    public static void ganjilGenapWithDoWhile() {
        System.out.println("Simulasi Do-While Loop:");
        
        int num = 0;
        System.out.print("Bilangan Genap: ");
        do {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);

        num = 0;
        System.out.print("\nBilangan Ganjil: ");
        do {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);
        System.out.println("\n");
    }

    
    public static void main(String[] args) {
        ganjilGenapWithFor();    
        ganjilGenapWithWhile();    
        ganjilGenapWithDoWhile();  
    }
}
