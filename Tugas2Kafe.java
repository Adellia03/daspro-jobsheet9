import java.util.Scanner;
public class Tugas2Kafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPesanan;
        String[] daftarPesanan;
        double[] hargaPesanan;
        double totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        daftarPesanan = new String[jumlahPesanan];
        hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            daftarPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
            totalBiaya += hargaPesanan[i]; 
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(daftarPesanan[i] + " - Harga: " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: " + totalBiaya);

    }
}
