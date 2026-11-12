import java.util.Scanner;

public class Latihan_03_02 {

    static int tentukanHarga(String jurusan, String kelas) {
        if (kelas.equalsIgnoreCase("Bisnis")) {
            if (jurusan.equalsIgnoreCase("Bandung")) return 40000;
            else if (jurusan.equalsIgnoreCase("Jakarta")) return 60000;
        } else if (kelas.equalsIgnoreCase("Ekonomi")) {
            if (jurusan.equalsIgnoreCase("Bandung")) return 20000;
            else if (jurusan.equalsIgnoreCase("Jakarta")) return 40000;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah pembeli : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nama = new String[n];
        String[] jurusan = new String[n];
        String[] kelas = new String[n];
        int[] jumlah = new int[n];
        int[] harga = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPembeli ke-" + (i + 1));
            System.out.print("Nama               : ");
            nama[i] = input.nextLine();
            System.out.print("Jurusan (Bandung/Jakarta) : ");
            jurusan[i] = input.nextLine();
            System.out.print("Kelas (Bisnis/Ekonomi)    : ");
            kelas[i] = input.nextLine();
            System.out.print("Jumlah Tiket       : ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            harga[i] = tentukanHarga(jurusan[i], kelas[i]);
            bayar[i] = harga[i] * jumlah[i];
        }

        String garis = "=".repeat(75);
        System.out.println("\n" + garis);
        System.out.printf("%-4s %-15s %-10s %-10s %-10s %-9s %-8s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas", "Jum Tiket", "Harga", "Bayar");
        System.out.println(garis);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-15s %-10s %-10s %-10d %-9d %-8d%n",
                    (i + 1), nama[i], jurusan[i], kelas[i], jumlah[i], harga[i], bayar[i]);
        }
        System.out.println(garis);

        input.close();
    }
{

}
}
