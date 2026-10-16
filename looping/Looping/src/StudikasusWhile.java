import java.util.Scanner;
public class StudikasusWhile {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String jawab="y";
        int totalBelanja = 0;
        int i=1;
        
        while (jawab.equals("y")){
            
            System.out.println("barang ke " + i );
             System.out.println("Masukkan harga barang: Rp ");
             int harga = input.nextInt();
        
            totalBelanja= totalBelanja + harga;

            System.out.print("Masih ada barang? (y/n): ");
            jawab = input.next();

            i++;
        }
            System.out.println("\n total belanja: Rp " + totalBelanja);
        sc.close();
    }
}
