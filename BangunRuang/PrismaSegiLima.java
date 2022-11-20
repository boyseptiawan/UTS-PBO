package BangunRuang;

public class PrismaSegiLima extends Prisma {
    private double luasAlas, tinggiPrisma, kelilingAlas;

    public PrismaSegiLima(double luasAlas, double tinggiPrisma, double kelilingAlas) {
        this.luasAlas = luasAlas;
        this.tinggiPrisma = tinggiPrisma;
        this.kelilingAlas = kelilingAlas;
    }

    @Override
    public void volume() {
        super.volume = luasAlas * tinggiPrisma;
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan = tinggiPrisma * kelilingAlas + (2 * luasAlas);
    }
}
