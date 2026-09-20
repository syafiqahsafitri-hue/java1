import java.util.Scanner;

public class TugasPercabangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan nilai (0 - 100): ");
        int nilai = sc.nextInt();

        if (nilai >= 85 && nilai <= 100){
            System.out.println("A");
        } else if (nilai >=70 && nilai <=84){
            System.out.println("B");
        } else if (nilai >=55 && nilai <=69){
            System.out.println("C");
        } else if (nilai >= 40 && nilai <=54){
            System.out.println("D");
        } else if (nilai >=0 && nilai < 40){
            System.out.println("E");
        } else {
            System.out.println("Nilai diluar jangkauan (0-100)!");
        }

        sc.close();
    }

}
