import java.util.Scanner;
public class Day40 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("1. Penambahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.print("Masukkan Operasi (angka): ");
		float a = x.nextFloat();
		if(a==1){
			System.out.print("Masukkan angka pertama: ");
			float b = x.nextFloat();
			System.out.print("Masukkan angka kedua: ");
			float c = x.nextFloat();
			float d = b+c;
			System.out.printf("= %.2f", d);
		}else if(a==2){
			System.out.print("Masukkan angka pertama: ");
			float b = x.nextFloat();
			System.out.print("Masukkan angka kedua: ");
			float c = x.nextFloat();
			float d = b-c;
			System.out.printf("= %.2f", d);
		}else if(a==3){
			System.out.print("Masukkan angka pertama: ");
			float b = x.nextFloat();
			System.out.print("Masukkan angka kedua: ");
			float c = x.nextFloat();
			float d = b*c;
			System.out.printf("= %.2f", d);
		}else if(a==4){
			System.out.print("Masukkan angka pertama: ");
			float b = x.nextFloat();
			System.out.print("Masukkan angka kedua: ");
			float c = x.nextFloat();
			float d = b/c;
			System.out.printf("= %.2f", d);
		}else{
			System.out.println("Pilihan tidak valid");
		}
	}
}
