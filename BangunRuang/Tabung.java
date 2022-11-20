package BangunRuang;

public class Tabung implements BangunRuang {
    private double tinggi, jariJari, volume, luasPermukaan;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void volume() {
        this.volume = Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getLuasPermukaan() {
        return this.luasPermukaan;
    }

}
