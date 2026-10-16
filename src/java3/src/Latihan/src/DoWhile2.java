import java.util.Scanner;
public class DoWhile2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int lanjut;

        do{
            System.out.println("program sedang berjalan");
            System.out.println("lanjut? 1=ya, 0=tidak");
            lanjut = sc.nextInt();

        } while(lanjut == 1);

            System.out.println("program selesai");
            sc.close();















    }
}
