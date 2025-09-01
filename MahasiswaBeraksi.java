public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.membaca = "Literasi Membaca Buku";
        mhs.nyontek = "Melihat jawaban milik teman";
        mhs.modifikasi = "Modifikasi tugas";

        System.out.println("Kegiatan Mahasiswa:");
        System.out.println("1. " + mhs.membaca);
        System.out.println("2. " + mhs.nyontek);
        System.out.println("3. " + mhs.modifikasi);
    }
}
