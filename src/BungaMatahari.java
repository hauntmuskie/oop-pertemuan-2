class BungaMatahari extends Tumbuhan {
    public BungaMatahari(String nama, int usia) {
        super(nama, "Bunga", usia, "Daerah beriklim hangat");
    }

    public void berputarMenujuMatahari() {
        System.out.println(nama + " berputar menuju matahari...");
    }
}