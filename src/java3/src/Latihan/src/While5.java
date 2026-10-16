import java.util.Scanner;
public class While5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int usia=0;
        int total=0;

        while(usia!=-1){

            System.out.println("Masukkan usia anda");
            usia=sc.nextInt();

            if(usia!=-1){
                if(usia<12){
                
                System.out.println("harga tiket = Rp 25.000" );
                total=total+25000;

            }else if(usia>=12){
                
                System.out.println("harga tiket = Rp 50.000");
                total = total+50000;

            }
        }

            
        }   
            System.out.println("total pembayaran = Rp " + total);

            sc.close();








    }
}
