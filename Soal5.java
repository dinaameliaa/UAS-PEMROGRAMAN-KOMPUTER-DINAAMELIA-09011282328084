import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukkan bilangan pertama:");
                int bilangan1 = input.nextInt();
                System.out.println("Masukkan bilangan kedua:");
                int bilangan2 = input.nextInt();
                System.out.println("Hasil penjumlahan: " + (bilangan1 + bilangan2));
                break;
            case 2:
                System.out.println("Masukkan bilangan pertama:");
                int bilangan1 = input.nextInt();
                System.out.println("Masukkan bilangan kedua:");
                int bilangan2 = input.nextInt();
                System.out.println("Hasil pengurangan: " + (bilangan1 - bilangan2));
                break;
            case 3:
                System.out.println("Masukkan bilangan pertama:");
                int bilangan1 = input.nextInt();
                System.out.println("Masukkan bilangan kedua:");
                int bilangan2 = input.nextInt();
                System.out.println("Hasil perkalian: " + (bilangan1 * bilangan2));
                break;
            case 4:
                System.out.println("Masukkan bilangan pertama:");
                int bilangan1 = input.nextInt();
                System.out.println("Masukkan bilangan kedua:");
                int bilangan2 = input.nextInt();
                if (bilangan2 != 0) {
                    System.out.println("Hasil pembagian: " + (bilangan1 / bilangan2));
                } else {
                    System.out.println("Pembagian tidak dapat dilakukan karena bilangan kedua adalah nol.");
                }
                break;
            default:
                System.out.println("Pilihan yang Anda masukkan tidak valid.");
        }
    }
}