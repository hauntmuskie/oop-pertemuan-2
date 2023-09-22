public class Main {
    public static void main(String[] args) {

        // Bunga matahari
        BungaMatahari bungaMatahari = new BungaMatahari("Bunga Matahari", 3);
        bungaMatahari.tampilkanInfo();
        bungaMatahari.tumbuh();
        bungaMatahari.berputarMenujuMatahari();

        System.out.println();

        // Kaktus
        Kaktus kaktus = new Kaktus("Kaktus Ekor Rubah", 5, 50);
        kaktus.tampilkanInfo();
        kaktus.tumbuh();
        kaktus.berduri();
    }
}
