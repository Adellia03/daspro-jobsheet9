import java.util.Scanner;
public class ArrayRataNilai03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] nilaiMhs= new int [10];
        double totalKeseluruhan = 0;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i + 1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            totalKeseluruhan += nilaiMhs[i];
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        
        double rataKeseluruhan = totalKeseluruhan / jumlahMhs;
        double rataLulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
        double rataTidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai keseluruhan = " + rataKeseluruhan);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus = " + jumlahTidakLulus);

    }
}