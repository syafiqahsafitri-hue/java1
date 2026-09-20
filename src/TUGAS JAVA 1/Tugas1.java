import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int panjang, lebar, luas;
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan Panjang: ");
        panjang = sc.nextInt();

        System.out.println("Masukkan Lebar");
        lebar = sc.nextInt();

        luas = panjang*lebar;

        System.out.println("Luas Persegi Panjang " + luas);
        sc.close();

    }

}
