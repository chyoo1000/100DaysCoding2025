import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input data
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        input.nextLine(); // biar gak loncat input

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobi = input.nextLine();

        // output data
        System.out.println("\n=== MY BIODATA GW ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Hobi   : " + hobi);

        input.close();
    }
}
