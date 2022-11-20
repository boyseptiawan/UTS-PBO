package BangunRuang;

public class Kubus extends Kotak {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public void volume() {
        this.volume = Math.pow(sisi, 3);
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 6 * Math.pow(sisi, 2);
    }
}
