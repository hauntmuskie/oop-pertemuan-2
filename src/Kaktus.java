class Kaktus extends Tumbuhan {
    private final int jumlahDuri;

    public Kaktus(String nama, int usia, int jumlahDuri) {
        super(nama, "Kaktus", usia, "Padang gurun");
        this.jumlahDuri = jumlahDuri;
    }

    public void berduri() {
        System.out.println(nama + " memiliki " + jumlahDuri + " duri...");
    }
}