public class Day85 {
    public static void main(String[] args) {
        int[] angka = {3, 14, 7, 20, 19};
        int max = angka[0];
        for(int i = 1; i < angka.length; i++){
            if(angka[i] > max){
                max = angka[i];
            }
        }System.out.println("angka max: "+max);
    }
}
