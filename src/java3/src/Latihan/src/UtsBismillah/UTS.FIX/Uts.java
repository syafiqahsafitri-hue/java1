import java.util.Scanner;
public class Uts {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner (System.in);

        System.out.println("masukkan bilangan");
        int bilangan= sc.nextInt();

        int hasil =1;
        
       
       if(bilangan==0){
        hasil=0;
       }else{
       for( int i = 1;i <=bilangan ; i++){
    
        hasil = hasil*i;
       
       }
       
        sc.close();
       
       }System.out.println(hasil);

    }
}
