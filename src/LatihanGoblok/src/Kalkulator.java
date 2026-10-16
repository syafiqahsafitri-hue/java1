import java.util.Scanner;

    public class Kalkulator {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);

            System.out.println("Masukkan angka pertama");
            int angka = input.nextInt();

            System.out.println("Masukkan Angka kedua");
            int angka2 = input.nextInt();

            System.out.println("Masukkan Operator");
            char operator = input.next().charAt((0));

            double hasil;

            switch (operator) {
                case '+':
                    hasil = angka+angka2;
                    System.out.println("Hasil = " + angka + "+" + angka2 + "=" + hasil);
                    
                    break;
            
                case '-':
                    hasil = angka-angka2;
                    System.out.println("Hasil = " + angka + "-" + angka2 + "=" + hasil);
                    break;

                case '*':
                    hasil = angka*angka2;
                    System.out.println("Hasil = " + angka + "*" + angka2 + "=" + hasil);
                    break;

                case '/':
                    if(angka2 != 0){
                    hasil = angka/angka2;
                    System.out.println("Hasil = " + angka + "/" + angka2 + "=" + hasil);
                    break;
                    }else{  
                        System.out.println("Error");                     
                    } break;


                default:
                    System.out.println("Error");
                    break;
            }

                input.close();
        }

}
