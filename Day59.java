import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai: ");
        int N = input.nextInt();
        
        System.out.println("angka ganjil 1 - " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nangka genap 1 - " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
