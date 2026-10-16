import java.util.Scanner;
    public class StudiKasus {
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    System.out.println("Masukkan batas angka");
    int batasAngka = input.nextInt();

    int bawah=1;

    for (; bawah <= batasAngka ; bawah++){
         if(bawah%2==0){
            System.out.println(bawah + " genap");
        
         }else{
            System.out.println(bawah + " ganjil");
         }

         input.close();
    }


 }

}
