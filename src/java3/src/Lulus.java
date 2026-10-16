import java.util.Scanner;

public class Lulus {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan Nilai 0-100");
            int nilai = input.nextInt();
        System.out.println("Masukkan Persentase kehadiran");
            double kehadiran = input.nextDouble();
        
        if (nilai >=60 && kehadiran >=75 ){
        System.out.println("Lulus");
        } else {
        System.out.println("Tidak Lulus");
        }

        input.close();








    }
}
