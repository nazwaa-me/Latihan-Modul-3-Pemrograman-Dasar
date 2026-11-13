import java.util.Scanner;

public class POST_TEST3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("DATA NILAI MAHASISWA\nSISTEM INFORMASI\nFKOM - UNIKU");
        System.out.print("Jumlah Orang : ");
        int jumlah = Integer.parseInt(input.nextLine());

        String mahasiswa[][] = new String[jumlah][2];
        double nilai[][] = new double[jumlah][4];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("NAMA  : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("TUGAS : ");
            nilai[i][0] = Double.parseDouble(input.nextLine());
            System.out.print("UTS   : ");
            nilai[i][1] = Double.parseDouble(input.nextLine());
            System.out.print("UAS   : ");
            nilai[i][2] = Double.parseDouble(input.nextLine());

            nilai[i][3] = (0.3 * nilai[i][0]) + (0.3 * nilai[i][1]) + (0.4 * nilai[i][2]);
            total += nilai[i][3];
        }

        System.out.println("\nNo.\tNIM\t\tNAMA\t\tTUGAS\tUTS\tUAS\tAKHIR");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + mahasiswa[i][0] + "\t" + mahasiswa[i][1]
                    + "\t\t" + nilai[i][0] + "\t" + nilai[i][1] + "\t" + nilai[i][2]
                    + "\t" + nilai[i][3]);
        }

        double rataRata = total / jumlah;
        System.out.println("\nRata-rata Nilai Akhir : " + rataRata);
        input.close();
    }
}