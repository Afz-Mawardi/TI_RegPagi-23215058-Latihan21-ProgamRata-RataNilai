package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan For, Operator
 *          Progam Rata-Rata Nilai
 */
import java.util.Scanner;

public class Latihan_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilai = new int[jumlahMahasiswa];
        int totalNilai = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
            totalNilai += nilai[i];
        }

        double rataRata = (double) totalNilai / jumlahMahasiswa;

        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");

        scanner.close();
    }
}