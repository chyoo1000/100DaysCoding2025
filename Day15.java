import java.util.Scanner;

public class Day15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("DISCLAIMER: codingan ini hanya menerima 2 angka disetiap operator aritmatikanya, mengikuti day roadmap yg sudah dilewati:)"); 
		System.out.println("kalkulator penambahan (+)"); {
		System.out.print("masukkan angka pertama: ");
		float angkapertama = input.nextFloat();
		System.out.print("masukkan angka kedua: ");
		float angkakedua = input.nextFloat();
		float hasiltambah = angkapertama + angkakedua;
		System.out.printf("hasilnya adalah: %.2f\n", hasiltambah);
		}
		System.out.println("kalkulator pengurangan (-)"); {
		System.out.print("masukkan angka pertama: ");
		float angkapertama = input.nextFloat();
		System.out.print("masukkan angka kedua: ");
		float angkakedua = input.nextFloat();
		float hasilkurang = angkapertama - angkakedua;
		System.out.printf("hasilnya adalah: %.2f\n", hasilkurang);
		
		input.close();
	}
	}
}
