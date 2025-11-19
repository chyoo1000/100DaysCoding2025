import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.print("masukkan angka: ");
            int angka = x.nextInt();
            if (angka < 0) {
                break;
            }
            total += angka;
        }
        System.out.println("total: " + total);
    }
}
