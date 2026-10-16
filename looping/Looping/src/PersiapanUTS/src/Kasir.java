import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int total=0;
        double diskon; 

            for(int i=1; i<=5; i++){
                    System.out.println("Masukkan harga barang ke-" + i +": Rp ");
                    int harga = sc.nextInt();
                    total = total + harga;
                   
                    
            }   
                    if (total >= 100000){
                    diskon=0.10;
                    } else{
                        diskon=0;
                    }

                    double totalBayar;
                    totalBayar= total-(total*diskon);
                    System.out.println("total = " + totalBayar);
    }
}
