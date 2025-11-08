import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = x.nextInt();
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }System.out.println("Jumlah dari 1 sampai " + N + " adalah: " + total);
    }
}
