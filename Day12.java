import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input data
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        // output data
        System.out.println("\n=== BIODATA MABA ===");
        System.out.print("Nama: " + nama + "\n");
        System.out.printf("Umur: %d tahun, Tinggi Badan: %.1f cm\n", umur, tinggi);

        input.close();
    }
}
