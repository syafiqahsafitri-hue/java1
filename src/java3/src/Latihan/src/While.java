import java.util.Scanner;
    public class While {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            int pin=0;
            while(pin!=1234){
                System.out.println("masukkan pin");
                pin=sc.nextInt();
            
                
            } 
            System.out.println("pin anda benar");

            
            sc.close();

            
        }
}
