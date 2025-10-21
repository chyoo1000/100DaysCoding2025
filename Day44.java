import java.util.Scanner;
public class Day44 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Masukkan nilai (angka): ");
		int nilai = x.nextInt();
		if(nilai>=90){
			System.out.println("Nilai: A");
		}else if(nilai>=80 && nilai<90){
			System.out.print("Nilai: B");
		}else if(nilai>=70 && nilai<80){
			System.out.print("Nilai: C");
		}else if(nilai>=60 && nilai<70){
			System.out.println("Nilai: D");
		}
		else{
			System.out.println("Nilai: E");
		}
	}
}
