import java.util.Scanner;
public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input panjang
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        //input lebar
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        //hitung luas
        int luas = panjang * lebar;

        //output hasil
        System.out.printf("Luas persegi panjang = %d × %d = %d\n", panjang, lebar, luas);
    }
}
