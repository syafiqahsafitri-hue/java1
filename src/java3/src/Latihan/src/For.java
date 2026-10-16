import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int tertinggi=0;
        for(int i = 1; i <=5 ; i++){
            System.out.println("Masukkan nilai siswa ke " + i);
            int nilai = sc.nextInt();

          
            if(nilai>tertinggi){
            tertinggi=nilai;
            
            }
                
        }System.out.println("Nilai tertinggi = " + tertinggi ); 


        sc.close();













    }
}
