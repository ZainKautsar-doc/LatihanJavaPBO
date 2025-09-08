public class SepedaGunungBeraksi {
    public static void main(String[] args) {
        SepedaGunung sg = new SepedaGunung();
        sg.setGir(3);
        System.out.println("Nilai awal = " + sg.getGir());

        sg.setPedal(1);
        System.out.println("Pedal setelah dikurangi 1 = " + sg.getPedal());
    }
    
}
