import java.util.Scanner;
public class DoWhile3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int nilai;

        do{
            System.out.println("Masukkan nilai");
            nilai=sc.nextInt();

            if(nilai>100 || nilai <0){
                System.out.println("nilai tidak valid");
            }

        } while(nilai>100 || nilai <0);
            System.out.println("data tersimpan");

        sc.close();









    } 
}
