import java.util.Scanner;
    public class SiakadFor21 { 
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

// Deklarasi Variabel
        double nilai, tertinggi=0, terendah = 100;
// Struktur
        for (int i = 1; i <= 10; i++) {
            System.out.print( "Masukan nilai mahasiswa ke-" + i + ":");
            nilai= sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi= nilai;
            if (nilai > terendah) {
                terendah= nilai;
                
            }
                
            }

        }
// Output
            System.out.println("Nilai tertinggi " + tertinggi);
            System.out.println("Nilai terendah" + terendah);

            sc.close();
        }
    }
     


    