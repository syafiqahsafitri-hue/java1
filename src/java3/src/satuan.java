public class satuan {
    public static void main(String[] args) {
        //470 

        int angka = 457;

        int satuan = angka/100;
        int puluhan = (angka/10) % 10;
        int ratusan = angka;

        System.out.println("ratusan" + ratusan);
        System.out.println("puluhan" + puluhan);
        System.out.println("satuan" + satuan);

    }
}
