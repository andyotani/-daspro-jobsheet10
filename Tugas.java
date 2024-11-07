import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] hasilSurvey = new int[jumlahResponden][jumlahPertanyaan];

        
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Input nilai untuk responden ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai untuk pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasilSurvey[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            int totalPerResponden = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalPerResponden += hasilSurvey[i][j];
            }
            double rataRataPerResponden = totalPerResponden / (double) jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataRataPerResponden);
        }

        
        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int totalPerPertanyaan = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                totalPerPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPerPertanyaan = totalPerPertanyaan / (double) jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataRataPerPertanyaan);
        }

        
        int totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (double) (jumlahResponden * jumlahPertanyaan);
        System.out.println("\nRata-rata nilai secara keseluruhan: " + rataRataKeseluruhan);


    }
}
