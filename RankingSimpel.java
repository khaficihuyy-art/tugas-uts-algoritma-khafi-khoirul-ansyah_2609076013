import java.util.Scanner;

public class RankingSimpel {
    public static void main(String[] args) {
        // Alat untuk membaca ketikan keyboard kamu
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA TOP 3 BESAR ===");

        // LOOPING: Mengulang input dari Juara 1 sampai Juara 3
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nMasukkan Nilai Juara ke-" + i + ": ");
            int nilai = input.nextInt(); // 

            // CONDITION: Cek apakah nilainya layak dapat piala
            if (nilai >= 70) {
                System.out.println("Status:KEREN KALI LULUS KAMU, JADI KAMU BERHAK DAPET PIALA;)!");
            } else {
                System.out.println("Status: WKWK INI NILAI APA SALDO DANA MU, GAK LULUS KAMU DAN GAK DAPET PIALA.");
            }
        }

        System.out.println("\n=== Semua data juara berhasil diinput! ===");
        input.close();
    }
}
