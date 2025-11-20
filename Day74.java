import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("1. Lihat\n2. Tambah\n3. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            if(pilih == 1) System.out.println("Lihat Data");
            else if(pilih == 2) System.out.println("Tambah Data");
        } while(pilih != 3);
        System.out.println("Keluar program");
    }
}
