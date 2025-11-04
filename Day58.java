import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int N = x.nextInt();
        System.out.println("1-N: ");
         for(int a = 1; a <= N; a++)
             System.out.println(a);
         
         System.out.println("N-1: ");
         for(int b = N; b >= 1; b--)
             System.out.println(b);
    }
}
