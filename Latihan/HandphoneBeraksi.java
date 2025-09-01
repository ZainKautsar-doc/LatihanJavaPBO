package Latihan;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.hidupkan = "Handphone otw hidup ...";
        hp.lakukanPanggilan = "kring, kring, kring ... panggilan dilakukan, Handphone berdering";
        hp.kirimSMS = "Dung, dung ... pesan berhasil terkirim";
        hp.matikan = "Handphone dimatikan";

        System.out.println(hp.hidupkan);
        System.out.println(hp.lakukanPanggilan);
        System.out.println(hp.kirimSMS);
        System.out.println(hp.matikan);
    }
}
