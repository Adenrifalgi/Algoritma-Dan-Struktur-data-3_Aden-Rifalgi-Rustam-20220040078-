import java.util.Scanner;

public class DisneyIslandTarif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input umur dan tinggi
        System.out.print("Masukkan umur anak (tahun): ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi badan anak (cm): ");
        int tinggi = scanner.nextInt();

        int tarif = 0;

        // Logika penentuan tarif
        if (umur < 1) {
            System.out.println("Dilarang masuk");
        } else if (umur <= 3) { // umur 1 - 3 tahun
            tarif = 30000;
            if (tinggi > 70) {
                tarif += 10000;
            }
            System.out.println("Tarif masuk: Rp " + tarif);
        } else if (umur <= 7) { // umur 4 - 7 tahun
            tarif = 40000;
            if (tinggi > 120) {
                tarif += 15000;
            }
            System.out.println("Tarif masuk: Rp " + tarif);
        } else if (umur <= 10) { // umur 8 - 10 tahun
            tarif = 50000;
            if (tinggi > 150) {
                tarif += 20000;
            }
            System.out.println("Tarif masuk: Rp " + tarif);
        } else { // umur di atas 10 tahun
            tarif = 80000;
            System.out.println("Tarif masuk: Rp " + tarif);
        }

        scanner.close();
    }
}