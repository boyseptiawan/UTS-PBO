package BangunRuang;

public class Bola implements BangunRuang {
    private double jariJari, volume, luasPermukaan;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void volume() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
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
