public class Day87 {
    public static void main(String[] args) {
        String[] hewan = {"ayam", "bebek", "kucing", "anjing", "biawak"};
        String target = "kucing";
        int index = -1;
        for(int i = 1; i < hewan.length; i++){
            if(hewan[i].equals(target)){
                index = i;
                break;
            }
        }if(index != -1){
            System.out.println("elemen ditemukan di index "+ index);
        }else{
            System.out.println("elemen tidak di temukan");
        }
    }
}
