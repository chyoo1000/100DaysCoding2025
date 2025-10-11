public class Day34 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 8;

        boolean hasil = (a > b && c <= a) || !(b == 5);

        System.out.println("Hasil evaluasi: " + hasil);
    }
}
