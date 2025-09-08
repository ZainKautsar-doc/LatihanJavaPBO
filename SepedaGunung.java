public class SepedaGunung extends Sepeda {
    private int pedal;
    void setPedal(int jumlah) {
        pedal = getGir() - jumlah;
    }

    int getPedal() {
        return pedal;
    }
}