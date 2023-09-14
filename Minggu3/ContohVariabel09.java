public class ContohVariabel09{
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jeniskelamin = 'P';
        byte _umurSayaSekarang = 18;
        double $ipk = 4.00, tinggi = 1.55;
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jeniskelamin);
        System.out.println("Umurku saat ini " + _umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}