import java.util.Scanner;

public class ContohProgram {

    public static void main(String[] args) {
        // Deklarasi variabel
        int angka = 10;

        // Tipe data

        // Loop menggunakan for
        for (int i = 0; i < 5; i++) {
            System.out.println("nilai ke-" + i);
        }

        // Percabangan if
        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5");
        } else {
            System.out.println("Angka lebih kecil dari atau sama dengan 5");
        }

        // Loop menggunakan while
        int counter = 0;
        while (counter < 3) {
            System.out.println("Perulangan while ke-" + counter);
            counter++;
        }

        // Loop menggunakan do-while
        int x = 0;
        do {
            System.out.println("Perulangan do-while ke-" + x);
            x++;
        } while (x < 3);

        // Array satu dimensi
        int[] arraySatuDimensi = {1, 2, 3, 4, 5};

        // Cetak isi array satu dimensi
        System.out.println("Isi array satu dimensi:");
        for (int i = 0; i < arraySatuDimensi.length; i++) {
            System.out.println("Indeks " + i + ": " + arraySatuDimensi[i]);
        }

        // Array multidimensi
        int[][] arrayMultiDimensi = {{1, 2, 3}, {4, 5, 6}};

        // Cetak isi array multidimensi
        System.out.println("Isi array multidimensi:");
        for (int i = 0; i < arrayMultiDimensi.length; i++) {
            for (int j = 0; j < arrayMultiDimensi[i].length; j++) {
                System.out.println("Baris " + i + ", Kolom " + j + ": " + arrayMultiDimensi[i][j]);
            }
        }

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Output
        System.out.println("Halo, " + nama);

        // Komentar
        // Ini adalah komentar satu baris
        /* Ini adalah
           komentar multi-baris */
    }
}
