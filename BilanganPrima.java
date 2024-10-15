package bilanganprima;

public class BilanganPrima {
    
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static void primesWithFor() {
        System.out.println("Menggunakan For Loop:");
        System.out.print("Bilangan Prima: ");
        for (int num = 0; num <= 20; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.print("\nBukan Bilangan Prima: ");
        for (int num = 0; num <= 20; num++) {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    
    public static void primesWithWhile() {
        System.out.println("Menggunakan While Loop:");
        int num = 0;
        System.out.print("Bilangan Prima: ");
        while (num <= 20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
        
        num = 0;
        System.out.print("\nBukan Bilangan Prima: ");
        while (num <= 20) {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("\n");
    }

    
    public static void primesWithDoWhile() {
        System.out.println("Simulasi Do-While Loop:");
        int num = 0;
        System.out.print("Bilangan Prima: ");
        do {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);

        num = 0;
        System.out.print("\nBukan Bilangan Prima: ");
        do {
            if (!isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 20);
        System.out.println("\n");
    }

    
    public static void main(String[] args) {
        primesWithFor();      
        primesWithWhile();    
        primesWithDoWhile(); 
    }
}
