import java.util.Scanner;

public class MhsBrks {
    public static void main(String[] args) {
        // Objek untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Instansiasi objek Mhs
        Mhs mhs = new Mhs();
        mhs.membaca = "Literasi Membaca Buku";
        mhs.nyontek = "Melihat jawaban milik teman";
        mhs.modifikasi = "Modifikasi tugas";

        System.out.println("Pilih Kegiatan Mahasiswa:");
        System.out.println("1. Membaca");
        System.out.println("2. Nyontek");
        System.out.println("3. Modifikasi");
        System.out.print("Masukkan pilihan (1-3): ");

        // Menerima pilihan dari pengguna
        int pilihan = input.nextInt();
        
        System.out.println("------------------------------------");

        // Menampilkan output berdasarkan pilihan pengguna
        switch (pilihan) {
            case 1:
                System.out.println("Kegiatan yang dipilih: " + mhs.membaca);
                break;
            case 2:
                System.out.println("Kegiatan yang dipilih: " + mhs.nyontek);
                break;
            case 3:
                System.out.println("Kegiatan yang dipilih: " + mhs.modifikasi);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        // Menutup objek Scanner
        input.close();
    }
}

// Perubahan: Nama kelas Mahasiswa diubah menjadi Mhs
class Mhs {
    String membaca;
    String nyontek;
    String modifikasi;
}