import java.util.Scanner;

public class PenjualanTiket21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DEKLARASI VARIABEL
         int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualanBersih = 0;

        System.out.println("=========================================");
        System.out.println("  PROGRAM PENJUALAN TIKET BIOSKOP HARIAN ");
        System.out.println("=========================================");
        System.out.println("Harga Tiket: Rp " + HARGA_TIKET);
        System.out.println("Masukkan '0' atau input non-angka untuk mengakhiri penjualan.");
        System.out.println("-----------------------------------------");

        // PROSES
        
        do {
            int jumlahTiket = 0;
            double diskon = 0;
            double subTotal = 0;
            
            System.out.print("\nMasukkan jumlah tiket yang dibeli pelanggan: ");

            // Cek jika input berikutnya adalah angka
            if (sc.hasNextInt()) {
                jumlahTiket = sc.nextInt();
                sc.nextLine(); // Membersihkan buffer

                // 1. Cek Sentinel Value (Berhenti)
                if (jumlahTiket == 0) {
                    System.out.println("\n--- Penjualan Diakhiri ---");
                    break; // Keluar dari loop
                }

                // 2. Cek Validasi Input Negatif (Abaikan & Minta Ulang)
                if (jumlahTiket < 0) {
                    System.out.println("⚠️ ERROR: Jumlah tiket tidak valid (negatif). Silakan masukkan ulang.");
                    continue; // Abaikan iterasi ini dan lanjut ke awal loop
                }

                // --- 3. Hitung Diskon dan Subtotal ---
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } 
                
                else if (jumlahTiket > 4) {
                    diskon = 0.10;
                } 
               
                else {
                    diskon = 0.0;
                }

                // Hitung Harga
                subTotal = jumlahTiket * HARGA_TIKET;
                double jumlahDiskon = subTotal * diskon;
                double hargaBayar = subTotal - jumlahDiskon;

                // --- Update Total Penjualan Harian ---
                totalTiketTerjual += jumlahTiket;
                totalPenjualanBersih += hargaBayar;

                // Tampilkan Rincian Transaksi
                System.out.printf("  Diskon yang didapat: %.0f%%\n", diskon * 100);
                System.out.printf("  Total Harga (Setelah Diskon): Rp %.2f\n", hargaBayar);

            } else {
                // Jika input bukan angka (misal: 'q' atau teks lain)
                String inputSentinel = sc.next();
                if (inputSentinel.equalsIgnoreCase("q")) {
                    System.out.println("\n--- Penjualan Diakhiri ---");
                    break;
                }
                System.out.println("⚠️ ERROR: Input tidak dikenali. Silakan masukkan angka.");
                sc.nextLine(); // Membersihkan buffer
            }

        } while (true); // Loop akan terus berjalan tanpa batas

        // --- Output Hasil Akhir Harian ---
        System.out.println("\n=========================================");
        System.out.println("           LAPORAN PENJUALAN HARIAN      ");
        System.out.println("=========================================");
        System.out.println("Total Tiket Terjual   : " + totalTiketTerjual + " tiket");
        System.out.printf("Total Pendapatan Bersih : Rp %.2f\n", totalPenjualanBersih);
        System.out.println("=========================================");
        
        sc.close();
    }
}
