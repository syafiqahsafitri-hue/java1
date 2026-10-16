import java.util.Scanner;
public class Latihanifelse {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner (System.in);
        int total=0;
        int diskon;
        int harga=50000;

        System.out.println("masukkan jumlah baju yang kamu beli");

        int jumlah=sc.nextInt();

    

        if (jumlah>=3){
            
            System.out.println("anda mendapat diskon 15%");
            total= (jumlah*harga);
            diskon= (total*15)/100;

        } else{
            diskon=0;
            } total= (jumlah*harga);
            System.out.println("total yg hrus di bayar= " + (total-diskon));


            sc.close();



    


    }
    }
