import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Dela";
        penonton[3][0] = "Farhan";
        penonton[3][1] = ""; // Menambahkan nilai default untuk menghindari null

        int choice;
        String nama;
        int baris, kolom;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        if (baris < 1 || baris > penonton.length) {
                            System.out.println("Nomor baris tidak tersedia. Silakan masukkan nomor baris yang valid.");
                            continue;
                        }

                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        if (kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor kolom tidak tersedia. Silakan masukkan nomor kolom yang valid.");
                            continue;
                        }
                        
                        
                        if (penonton[baris - 1][kolom - 1] != null && !penonton[baris - 1][kolom - 1].isEmpty()) {
                            System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi yang lain.");
                        } else {
                            break;
                        }
                    }

                    sc.nextLine(); 

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan!");

                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null || penonton[i][j].isEmpty()) {
                                System.out.print("*** \t");
                            } else {
                                System.out.printf("%s \t", penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 3);

        sc.close();
    }
}
