import java.util.Scanner;
    public class KasirDiskon{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int total=0;
        int diskon=0;
        
        for (int i=1;i<=5;i++){

            System.out.println("Masukkan harga ke " + i);
            int harga = sc.nextInt();
            

            if(harga>=50000){
                diskon= 10000;
                System.out.println("Dapat diskon Rp 10000!");
                total=total+(harga-diskon);
            } else{
                total=total+harga;
            } 
            

            

        }System.out.println("total yang harus dibayar = " + total);
            sc.close();
        }

            









    }
