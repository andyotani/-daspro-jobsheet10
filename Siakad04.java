import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

      
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        
        for (int i = 0; i < nilai.length; i++) {
            int totalPerSiswa = 0;
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / (double) jumlahMatkul); 
        }

        System.out.println("\n=======================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah: ");

        
        for (int j = 0; j < jumlahMatkul; j++) { 
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa); 
        }
    }
}
