import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        
        System.out.print("Masukkan harga buku: ");
        double harga = input.nextDouble();
        
        System.out.print("Masukkan jumlah eksemplar: ");
        int jumlah = input.nextInt();
        
        System.out.print("Apakah tersedia versi e-book (true/false): ");
        boolean tersedia = input.nextBoolean();
        
        System.out.print("Masukkan kode rak: ");
        char kode = input.next().charAt(0);
        
        System.out.printf("Buku berjudul \"%s\" dengan kode rak %c berharga Rp%.2f,\n", judul, kode, harga);
        System.out.printf("jumlah eksemplar yang tersedia adalah %d.\n", jumlah);
        System.out.printf("Apakah tersedia versi e-book? %b\n", tersedia);
    }
}
