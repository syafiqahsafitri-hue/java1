import java.util.Scanner;

    public class NilaiUjian {
        public static void main(String[] args) {
             Scanner input= new Scanner (System.in);

                System.out.println("Masukkan Nilai");
                int nilai= input.nextInt();

                System.out.println("Masukkan Persentase Kehadiran");
                int kehadiran= input.nextInt();

                if (nilai >= 60 && kehadiran >=75){
                    System.out.println("Anda Lulus");

                }else if (nilai <60 && kehadiran <75){
                    System.out.println("Maaf anda tidak lulus");
                }

                input.close();
        }
}
