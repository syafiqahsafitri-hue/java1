import java.util.Scanner;
    
public class DoWhile4 {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int pin=1234;
    int pinBenar=0;

    do{
        System.out.println("masukkan pin anda");
        pinBenar= sc.nextInt();

        if (pin!=pinBenar){
            System.out.println("pin anda salah");
        } 

    } while(pin!=pinBenar);
        System.out.println("pin anda benar");


    sc.close();
    
}
}
