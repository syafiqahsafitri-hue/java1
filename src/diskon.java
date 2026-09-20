import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan status member(GOLD/ SILVER/ BRONE/ REGULER): ");
        String member = sc.next();

        if (member.equalsIgnoreCase("GOLD")){
            System.out.println("Diskon 20%");
        } else if (member.equalsIgnoreCase("SILVER")){
            System.out.println("Diskon 15%");
        } else if (member.equalsIgnoreCase("BRONZE")){
            System.out.println("Diskon 10%");
        } else {
            System.out.println("Tidak Ada Diskon (0%)");
        }

        sc.close();

            }


}
