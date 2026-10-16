import java.util.Scanner;
public class NestedIf {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("masukan menu belanja");
    int menu=sc.nextInt();

    System.out.println("masukan jumlah cangkir yang dibeli");
    int jumlahCangkir=sc.nextInt();

    int totalBayar=0;
    
    switch(menu){
    
            case 1:
            
            totalBayar= (15000*jumlahCangkir);
            break;

            case 2:
           
            totalBayar= (20000*jumlahCangkir);
            break;

            case 3:
           
            totalBayar= (22000*jumlahCangkir);
            break;

            default:
                System.out.println("pilihan tidak valid");

    }       System.out.println("total bayar = " + totalBayar);

        sc.close();










}
}
