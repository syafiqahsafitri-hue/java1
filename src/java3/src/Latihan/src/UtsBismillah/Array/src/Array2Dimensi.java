public class Array2Dimensi {

    public static void main(String[] args) {
        
        int arr2D [][] = new int [2][3];
        int brr2D [][] = new int [][]{{10,7,10}, {6,3,10}}; //dua baris tiga kolom
        int crr2D [][] = new int [][]{{10,7,10}, {3,10}}; // [0] berisi 3 kolom, [1] berisi 2 kolom

        System.out.println("ukuran arr[0][1] = " +  arr2D[0][1]);
        System.out.println("ukuran arr[0][1] = " +  brr2D[0][1]);
        System.out.println("ukuran arr[0][1] = " +  crr2D[0][1]);


    }
}
