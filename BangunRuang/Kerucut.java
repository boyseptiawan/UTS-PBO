package BangunRuang;

public class Kerucut implements BangunRuang {
    private double tinggi, jariJari, volume, luasPermukaan;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public void volume() {
        this.volume = (1.0 / 3.0) * Math.PI * Math.pow(this.jariJari, 2) * this.tinggi;
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(jariJari, 2) + Math.pow(tinggi, 2)));
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
