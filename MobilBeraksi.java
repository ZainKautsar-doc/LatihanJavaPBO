public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.warna = "Biru";
        mobilku.tahunProduksi = 2025;

        System.out.println("Mobilku:");
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun Produksi: " + mobilku.tahunProduksi);
    }
}
