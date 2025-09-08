public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        sepedaku.setGir(1);
        // Mengubah nilai gir secara langsung
        sepedaku.gir = 3;
        System.out.println("Gir saat ini " + sepedaku.getGir());

        sepedaku.setGir(2);
        System.out.println("Gir setelah ditambah 2 = " + sepedaku.getGir());
    }
}
