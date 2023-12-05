public class Soal7 {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status: Sedang dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    public void pinjam() {
        if (dipinjam) {
            System.out.println("Buku sedang dipinjam.");
        } else {
            dipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        }
    }
}