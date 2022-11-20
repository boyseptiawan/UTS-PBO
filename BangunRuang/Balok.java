package BangunRuang;

public class Balok extends Kotak {
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }

    @Override
    public void volume() {
        this.volume = panjang * lebar * tinggi;
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
