import java.util.Locale;
import java.util.Scanner;

public class TUGAS3 {

    static String format(String angka) {
        long nilai = Long.parseLong(angka);
        return String.format(Locale.forLanguageTag("id-ID"), "%,d", nilai);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("DATA GAJI KARYAWAN");
        System.out.print("Jumlah Karyawan : ");
        int jumlah = Integer.parseInt(input.nextLine());

        String karyawan[][] = new String[jumlah][4];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));
            System.out.print("Nama      : ");
            karyawan[i][0] = input.nextLine().toUpperCase();
            System.out.print("Jabatan   : ");
            karyawan[i][1] = input.nextLine().toUpperCase();
            System.out.print("Gapok     : ");
            karyawan[i][2] = input.nextLine();
            System.out.print("Tunjangan : ");
            karyawan[i][3] = input.nextLine();
        }

        System.out.println();
        System.out.printf("%-5s%-12s%-12s%-14s%-14s%n", "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d%-12s%-12s%-14s%-14s%n",
                    (i + 1),
                    karyawan[i][0],
                    karyawan[i][1],
                    format(karyawan[i][2]),
                    format(karyawan[i][3]));
        }
        input.close();
    }
}