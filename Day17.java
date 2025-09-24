import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("masukkan angka kedua: ");
        b = input.nextInt();
        int hasil = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, hasil);
    }
}
