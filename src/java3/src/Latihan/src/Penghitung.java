import java.util.Scanner;

    public class Penghitung {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            
            int lulus=0;
            for (int i = 1; i<=5; i++){
                    System.out.println("Masukkan nilai ke  " + i);
                    int nilai= sc.nextInt();

                    if (nilai>60){
                        lulus++;
                    } 
                    

            } System.out.println("Jumlah siswa yang lulus = " + lulus);


            sc.close();













        }
}


