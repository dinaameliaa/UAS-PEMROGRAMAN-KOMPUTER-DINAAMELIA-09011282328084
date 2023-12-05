import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata atau frasa: ");
        String kata = input.nextLine();
        if (isPalindrom(kata)) {
            System.out.println(kata + " adalah palindrom");
        } else {
            System.out.println(kata + " bukan palindrom");
        }
    }

    public static boolean isPalindrom(String kata) {
        kata = kata.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }
}