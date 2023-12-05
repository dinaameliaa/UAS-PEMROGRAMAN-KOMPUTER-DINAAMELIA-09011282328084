import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = input.nextInt();
        System.out.print("Masukkan harga per barang: ");
        double hargaBarang = input.nextDouble();

        double totalHarga = 0;
        if (jumlahBarang < 5) {
            totalHarga = jumlahBarang * hargaBarang;
        } else if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            totalHarga = jumlahBarang * hargaBarang * 0.95;
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            totalHarga = jumlahBarang * hargaBarang * 0.9;
        } else {
            totalHarga = jumlahBarang * hargaBarang * 0.8;
        }

        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}