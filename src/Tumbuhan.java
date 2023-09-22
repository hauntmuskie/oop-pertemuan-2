class Tumbuhan {
    String nama;
    String jenis;
    int usia;
    String habitat;

    public Tumbuhan(String nama, String jenis, int usia, String habitat) {
        this.nama = nama;
        this.jenis = jenis;
        this.usia = usia;
        this.habitat = habitat;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Usia: " + usia + " bulan");
        System.out.println("Habitat: " + habitat);
    }

    public void tumbuh() {
        System.out.println(nama + " tumbuh...");
    }
}