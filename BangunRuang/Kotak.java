package BangunRuang;

public abstract class Kotak implements BangunRuang {
    protected double sisi, panjang, lebar, tinggi, volume, luasPermukaan;

    // Overloading constructor

    // Constructor untuk kubus
    public Kotak(double sisi) {
        this.sisi = sisi;
    }

    // Constructor untuk balok
    public Kotak(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }

    public abstract void volume();

    public abstract void luasPermukaan();
}
