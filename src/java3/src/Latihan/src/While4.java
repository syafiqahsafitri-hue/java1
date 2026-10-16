import java.util.Scanner;
    public class While4 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int pilihan=0;
            
            
        
            while(pilihan!=3){
                
                System.out.println("=== MENU RESTORAN ===\n" + 
                                        "1. Pesan Makanan\n" + 
                                        "2. Pesan Minuman\n" + 
                                        "3. Keluar\n" + 
                                        "Pilih menu (1-3):");

                
                pilihan= sc.nextInt();

                if(pilihan==1){
                    System.out.println("anda memesan makanan");
                }else if(pilihan==2){
                    System.out.println("anda memesan minuman");
                }else if(pilihan==3){}
                else{
                    System.out.println("pilihan anda tidak valid");
                }

            }
            System.out.println("terima kasih telah berkunjung");
            sc.close();
        }
        
}
