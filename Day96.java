public class Day96 {
    static int tambah(int a, int b){
        return a + b;
    }

    static int kurang(int a, int b){
        return a - b;
    }

    static int kali(int a, int b){
        return a * b;
    }

    static int bagi(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(tambah(10, 5));
        System.out.println(kurang(10, 5));
        System.out.println(kali(10, 5));
        System.out.println(bagi(10, 5));
    }
}
