public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();

        System.out.println("Lampu saat ini mati");

        lampuKamar.hidupkan(); // menyalakan lampu
        lampuKamar.matikan(); // mematikan lampu
        lampuKamar.matikan(); // lampu sudah mati
        lampuKamar.hidupkan(); // menyalakan lampu
        lampuKamar.hidupkan(); // lampu sudah hidup
    }
}
