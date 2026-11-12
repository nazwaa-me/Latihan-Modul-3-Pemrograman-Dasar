import java.util.Scanner;

public class Latihan_03_01 {

    static String tentukanIndex(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] nim = new String[n];
        String[] nama = new String[n];
        double[] uts = new double[n];
        double[] uas = new double[n];
        double[] nilaiAkhir = new double[n];
        String[] index = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData mahasiswa ke-" + (i + 1));
            System.out.print("Nim   : ");
            nim[i] = input.nextLine();
            System.out.print("Nama  : ");
            nama[i] = input.nextLine();
            System.out.print("UTS   : ");
            uts[i] = input.nextDouble();
            System.out.print("UAS   : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            nilaiAkhir[i] = (0.5 * uts[i]) + (0.5 * uas[i]);
            index[i] = tentukanIndex(nilaiAkhir[i]);
        }

        String garis = "=".repeat(62);
        System.out.println("\n" + garis);
        System.out.printf("%-4s %-8s %-15s %-6s %-6s %-12s %-5s%n",
                "No", "Nim", "Nama", "UTS", "UAS", "Nilai Akhir", "Index");
        System.out.println(garis);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-4d %-8s %-15s %-6.0f %-6.0f %-12.1f %-5s%n",
                    (i + 1), nim[i], nama[i], uts[i], uas[i], nilaiAkhir[i], index[i]);
        }
        System.out.println(garis);

        input.close();
    }
}