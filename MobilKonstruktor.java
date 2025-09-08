public class MobilKonstruktor {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Merah", 2020);
        mobil1.info();

        Mobil mobil2 = new Mobil();
        mobil2.warna = "Biru";
        mobil2.tahunProduksi = 2021;
        mobil2.info();
    }
}
