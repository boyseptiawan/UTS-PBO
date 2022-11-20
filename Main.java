import BangunRuang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Bola");
                System.out.println("4. Tabung");
                System.out.println("5. Kerucut");
                System.out.println("6. Exit");
                System.out.print("Pilih: ");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan sisi: ");
                        double sisi = input.nextDouble();
                        Kubus kubus = new Kubus(sisi);
                        kubus.volume();
                        kubus.luasPermukaan();
                        System.out.printf("Volume: %.2f \n", kubus.getVolume());
                        System.out.printf("Luas Permukaan: %.2f \n", kubus.getLuasPermukaan());
                        break;
                    case 2:
                        System.out.print("Masukkan panjang: ");
                        double panjang = input.nextDouble();
                        System.out.print("Masukkan lebar: ");
                        double lebar = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        double tinggi = input.nextDouble();
                        Balok balok = new Balok(panjang, lebar, tinggi);
                        balok.volume();
                        balok.luasPermukaan();
                        System.out.printf("Volume: %.2f\n", balok.getVolume());
                        System.out.printf("Luas Permukaan: %.2f\n", balok.getLuasPermukaan());
                        break;
                    case 3:
                        System.out.print("Masukkan jari-jari: ");
                        double jariJari = input.nextDouble();
                        Bola bola = new Bola(jariJari);
                        bola.volume();
                        bola.luasPermukaan();
                        System.out.printf("Volume: %.2f\n", bola.getVolume());
                        System.out.printf("Luas Permukaan: %.2f\n", bola.getLuasPermukaan());
                        break;
                    case 4:
                        System.out.print("Masukkan jari-jari: ");
                        jariJari = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        tinggi = input.nextDouble();
                        Tabung tabung = new Tabung(jariJari, tinggi);
                        tabung.volume();
                        tabung.luasPermukaan();
                        System.out.printf("Volume: %.2f\n", tabung.getVolume());
                        System.out.printf("Luas Permukaan: %.2f\n", tabung.getLuasPermukaan());
                        break;
                    case 5:
                        System.out.print("Masukkan jari-jari: ");
                        jariJari = input.nextDouble();
                        System.out.print("Masukkan tinggi: ");
                        tinggi = input.nextDouble();
                        Kerucut kerucut = new Kerucut(jariJari, tinggi);
                        kerucut.volume();
                        kerucut.luasPermukaan();
                        System.out.printf("Volume: %.2f\n", kerucut.getVolume());
                        System.out.printf("Luas Permukaan: %.2f\n", kerucut.getLuasPermukaan());
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                }
            }
        }
    }
}
