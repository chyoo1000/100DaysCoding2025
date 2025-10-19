import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        double gp = x.nextDouble();
        System.out.print("Masukkan tunjangan: ");
        double t = x.nextDouble();
        System.out.print("Masukkan potongan: ");
        double p = x.nextDouble();
        double gb = gp + t - p;
        System.out.println("Gaji bersih Anda adalah: Rp " + gb);
    }
}
