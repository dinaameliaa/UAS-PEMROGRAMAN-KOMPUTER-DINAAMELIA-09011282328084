import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang akan di-faktorisasi:");
        int bilangan = input.nextInt();

        if (bilangan <= 0) {
            System.out.println("Bilangan harus positif.");
            return;
        }

        System.out.println("Faktor-faktor dari " + bilangan + ":");
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i == 0) {
                System.out.print(i + " ");
                bilangan /= i;
            }
        }
    }
}