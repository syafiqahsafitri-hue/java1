import java.util.Scanner;
    public class AngkaTerkecil {
        public static void main (String[] args){
                Scanner input = new Scanner (System.in);

                System.out.println("Masukkan angka 1 = ");
                int angka1= input.nextInt();

                System.out.println("Masukkan angka 2 = ");
                int angka2= input.nextInt();

                System.out.println("Masukkan angka 3 = ");
                int angka3= input.nextInt();

                if(angka1 < angka2 && angka1 < angka3){
                    System.out.println("Angka terkecil = " + angka1);
                }else if(angka2 < angka1 && angka2 < angka3){
                    System.out.println("Angka terkecil = " + angka2);
                }else if(angka3 < angka1 && angka3 < angka2){
                    System.out.println("Angka terkecil = " + angka3);
                }

                input.close();









        }

}
