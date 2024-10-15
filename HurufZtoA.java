package HurufZtoA;

public class HurufZtoA {

   
    public static void hurufZtoAWithFor() {
        System.out.println("Menggunakan For Loop:");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("\n");
    }

   
    public static void hurufZtoAWithWhile() {
        System.out.println("Menggunakan While Loop:");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println("\n");
    }

    
    public static void hurufZtoAWithDoWhile() {
        System.out.println("Simulasi Do-While Loop:");
        char ch = 'Z';
        do {
            System.out.print(ch + " ");
            ch--;
        } while (ch >= 'A');
        System.out.println("\n");
    }

  
    public static void main(String[] args) {
        hurufZtoAWithFor();      
        hurufZtoAWithWhile();   
        hurufZtoAWithDoWhile();  
    }
}
