import java.util.Scanner;
public class While2 {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int angkaRahasia=0;


    while(angkaRahasia!=15){

        angkaRahasia= sc.nextInt();
        if(angkaRahasia!=15){
            System.out.println("cb lg");
        }
         
        
        }
    System.out.println("tebakan benar");

        sc.close();


    }


}
