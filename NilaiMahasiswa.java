import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = sc.nextInt();
        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            while (true) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                int nilai = sc.nextInt();
                if (nilai >= 0) { 
                    arrNilai[i] = nilai;
                    break;
                } else {
                    System.out.println("Nilai tidak boleh negatif. Silakan coba lagi.");
                }
            }
        }

        int total = 0;
        int tertinggi = arrNilai[0];
        int terendah = arrNilai[0];

        for (int nilai : arrNilai) {
            total += nilai;
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
    
        double rata2 = total / jumlahNilai;

        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Semua nilai yang dimasukkan:");
        for (int nilai : arrNilai) {
            System.out.println(nilai);
        }

    }
}
