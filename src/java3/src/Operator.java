import java.util.Scanner;


public class Operator {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
            System.out.println ("Masukkan angka pertama!");
            double angka1 = input.nextDouble();

            System.out.println ("Masukkan angka kedua!");
            double angka2 = input.nextDouble();

            System.out.println ("Masukkan operator!");
            char operator = input.next().charAt((0));

            double hasil;


    switch(operator)
    { 
        case'+':
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + angka1 + "+" + angka2 + "=" + hasil);
        break;

        case'-':
        hasil = angka1 - angka2;
        System.out.println("Hasil =  " + angka1 + "-" + angka2 + "=" + hasil);
        break;

        case '*':
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + angka1 + "*" + angka2 + "=" + hasil);
        break;

        case '/':
        if (angka2 != 0){
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + angka1 + "+" + angka2 + "=" + hasil);
        } else {
        System.out.println("error");
        }
        break;

        default:
        System.out.println("Error");
        break;
    }
        input.close();
}
     }

