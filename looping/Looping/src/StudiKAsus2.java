import java.util.Scanner;
public class StudiKAsus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan jumlah siswa");
        int jumlah= input.nextInt();

        double totalNilai=0;

        for(int i = 1; i<= jumlah; i++){

            System.out.println("Masukkan nilai ujian siswa ke-" + i + ":");
            double nilai = input.nextDouble();

            totalNilai = totalNilai + nilai;
        }
            double rataRata = totalNilai/ jumlah;
            System.out.println("Rata-rata nilai dari " + jumlah + " Siswa adalah: " + rataRata);

        








    }
}
