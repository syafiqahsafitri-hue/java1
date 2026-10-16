import java.util.Scanner;
    public class While3 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int harga=1;
            int total=0;

            while(harga!=0){
                System.out.println("Masukkan harga (ketik 0 jika selesai)");
                harga=sc.nextInt();

                total =total+harga;

            } 
                System.out.println("total belanjaan anda = " + total);

            sc.close();











        }
}
