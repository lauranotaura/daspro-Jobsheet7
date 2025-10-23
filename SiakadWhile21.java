import java.util.Scanner;
    public class SiakadWhile21 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
// Deklarasi Variabel
            int jml=0 ;
            int nilai;
            int i=0; 
            System.out.print(" Masukan jumlah mahasiswa:");
            jml= sc.nextInt();

// Struktur
            while (i < jml) {
                System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) + ":");
                nilai= sc.nextInt();

                if (nilai <0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukan lagi nilai yang valid");
                    continue;
                    
                }
                if (nilai > 80 && nilai <=100) {
                    System.out.println("Nilai Mahasiswa ke-" + (i + 1) + " adalah  A");

                } else if (nilai > 73 && nilai <= 80) {
                    System.out.println("Nilai Mahasiswa ke -" + (i + 1)+ " adalah B+");
                
                } else if (nilai > 65 && nilai <=73) {
                    System.out.println("Nilai Mahasiswa ke -" + (i + 1) + "adalah B");

                } else if (nilai > 60 && nilai <= 65) {
                    System.out.println("Nilai Mahasiswa ke -" + (i + 1) + "adalah C+");
                    
                } else if (nilai > 50 && nilai <= 60) {
                    System.out.println("Nilai Mahasiswa ke -" + (i + 1) + "adalah C");

                } else if (nilai > 39 && nilai <= 50) {
                    System.out.println("Nilai Mahasiswa ke -" + (i + 1) + "adalah D");
                    
                } else{
                    System.out.println("Nilai Mahasiswa ke _" + (i + 1) + "adalah E");
                }
               i++;
            }
                 sc.next();
    }
}