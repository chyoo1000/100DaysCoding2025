public class LASTDAY_Day100 {
    static int[] baru;
    static int retas(int[] arr) {
        int n = arr.length;
        baru = new int[n];
        boolean[] isi = new boolean[n];
        int p = 0;
        for (int x : arr) {
            int idx = x % n;
            while (isi[idx]) {
                idx = (idx + 1) % n;
                p++;
            }
            baru[idx] = x;
            isi[idx] = true;
        }
        return p;
    }
    static String susunKode(int p) {
        StringBuilder gabung = new StringBuilder();
        for (int x : baru) gabung.append(x);
        int len = String.valueOf(p).length();
        return gabung.substring(0, len);
}
}
