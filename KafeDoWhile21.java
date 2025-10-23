import java.util.Scanner;
public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

// DEKLARASI VARIABEL
        int kopi, teh, roti;
        int hargaKopi=12000;
        int hargaTeh= 7000;
        int hargaRoti= 20000;
        int totalHarga;
        String namaPelanggan;
// STRUKTUR
        do{
            System.out.print("Masukan Nama Pelanggan (ketik 'batal') untuk keluar: ");
            namaPelanggan= sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
                
            }
                System.out.print("Jumlah kopi: ");
                kopi= sc.nextInt();
                System.out.print("Jumlah Teh: ");
                teh= sc.nextInt();
                System.out.print("Jumlah roti: ");
                roti=sc.nextInt();
// PERHITUNGAN
            totalHarga= (kopi*hargaKopi) + (teh * hargaTeh) + (roti *hargaRoti);
            System.out.println("Total yang harus dibayar :Rp " + totalHarga);
            sc.nextLine();

            

        } while(true);
        System.out.println("Semua Transaksi  Selesai.");
    }
    
}
