public class Toko {
    public static void man(String[] args){


        int harga= 25000;
        int jumlahBarang= 10;
        int totalAwal= harga*jumlahBarang;

        System.out.println("Total Awal = " + totalAwal);
        double diskon= 0.10;
        double potongan= totalAwal*diskon;
        

        if (jumlahBarang>=4){
        double totalAkhir= totalAwal-potongan;
            System.out.println("Total Akhir = " + totalAkhir);
        } else if (jumlahBarang <= 4) {
            System.out.println("Total Akhir = " + totalAwal);
        }
    }
}
