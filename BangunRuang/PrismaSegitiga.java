package BangunRuang;

public class PrismaSegitiga extends Prisma {
    private double alas, tinggi, tinggiPrisma;

    public PrismaSegitiga(double alas, double tinggi, double tinggiPrisma) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public void volume() {
        super.volume = (alas * tinggi * tinggiPrisma) / 2;
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan = (alas * tinggi) + (alas * tinggiPrisma) + (tinggi * tinggiPrisma);
    }

}
