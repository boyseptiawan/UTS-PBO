import BangunRuang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu")
                System.out.println("1. Kubus");
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
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak ada");
                }
            }
        }
    }
}
