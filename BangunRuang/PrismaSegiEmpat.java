package BangunRuang;

public class PrismaSegiEmpat extends Prisma {
    private double panjang, lebar, tinggiPrisma;

    public PrismaSegiEmpat(double panjang, double lebar, double tinggiPrisma) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public void volume() {
        super.volume = panjang * lebar * tinggiPrisma;
    }

    @Override
    public void luasPermukaan() {
        super.luasPermukaan = (2 * panjang * lebar) + (2 * panjang * tinggiPrisma) + (2 * lebar * tinggiPrisma);
    }
}