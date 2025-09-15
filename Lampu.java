public class Lampu implements InterfaceLampu {
    int statusLampu;

    public void hidupkan() {
        if (statusLampu == KEADAAN_HIDUP) {
            statusLampu = KEADAAN_HIDUP;
            System.out.println("Lampu sudah hidup");
        } else {
            System.out.println("Lampu sudah hidup");
        }
    }

        public void matikan() {
            if (statusLampu == KEADAAN_MATI) {
                statusLampu = KEADAAN_MATI;
                System.out.println("Lampu sudah mati");
            } else {
                System.out.println("Lampu sudah mati");
            }
        }
    }
