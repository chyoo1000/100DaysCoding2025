import java.util.Scanner;
public class Day38 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("masukkan angka: ")
		int a = in.nextInt();
		if(a>0){
			System.out.println("positif");
				}else if(a<0){
				System.out.print("negatif");
			}else{
				System.out.print("nol");
		}
	}
}
