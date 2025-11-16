import java.util.Scanner;

public class Day70 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("masukkan tinggi: ");
        int t = x.nextInt();
        System.out.print("masukkan lebar: ");
        int l = x.nextInt();

        for(int i = 1; i <= t; i++){
            for(int j = 1; j <= l; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
