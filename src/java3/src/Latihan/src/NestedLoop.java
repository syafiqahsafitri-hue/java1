import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.printf("Masukkan nilai n = ");
        int nilai = sc.nextInt();

        for (int i=1 ; i <=nilai;i++){
            for(int j = 1; j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        sc.close();


    }
}
