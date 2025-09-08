public class Mobil {
    String warna;
    int tahunProduksi;

    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public Mobil() {
    }
    void info() {
        System.out.println("Warna mobil: " + warna);
        System.out.println("Tahun produksi: " + tahunProduksi);
    }
}