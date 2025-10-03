public class Day26 {
    public static void main(String[] args) {
        int a = 10; // nilai awal
        System.out.printf("Nilai awal: a = %d\n", a);

        a += 5;
        System.out.printf("Setelah a += 5 → %d\n", a);

        a -= 5;
        System.out.printf("Setelah a -= 5 → %d\n", a);

        a *= 5;
        System.out.printf("Setelah a *= 5 → %d\n", a);

        a /= 5;
        System.out.printf("Setelah a /= 5 → %d\n", a);

        a %= 5;
        System.out.printf("Setelah a %%= 5 → %d\n", a);
    }
}
