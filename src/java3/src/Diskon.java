import java.util.Scanner;
public class Diskon {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int harga= 25000;
        System.out.println("Masukkan Jumlah Barang");

        int jumlahBarang= input.nextInt();

        double totalAwal = jumlahBarang * harga;
        double diskon = 0; 
        
         if (jumlahBarang >= 4 ){
            diskon = 0.10 * totalAwal;
         } 
         double totalAkhir = totalAwal - diskon;
            
            System.out.println("total awal = Rp " + (int) totalAwal);
            System.out.println("diskon = " + (int) diskon);
            System.out.println("totalAkhir = " + (int) totalAkhir);
        
         input.close();
    }

}
