package MKV;

public class Mesehos implements Mesehosinterface
{
    private String nev;
    private boolean jo;
    private double napiar;
    private int napok;

    public Mesehos(String nev, boolean jo, double napiar, int napok) {
        this.nev = nev;
        this.jo = jo;
        this.napiar = napiar;
        this.napok = napok;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isJo() {
        return jo;
    }

    public void setJo(boolean jo) {
        this.jo = jo;
    }

    public double getNapiar() {
        return napiar;
    }

    public void setNapiar(double napiar) {
        this.napiar = napiar;
    }

    public int getNapok() {
        return napok;
    }

    public void setNapok(int napok) {
        this.napok = napok;
    }

    @Override
    public void megnovel(int enyivel)
    {
        this.napiar = this.napiar + enyivel;
    }

    @Override
    public double osszegez()
    {
        double osszeg = this.napok * this.napiar;
        return osszeg;
    }

    @Override
    public double ado()
    {
        return this.osszegez() * 0.27;
    }

    @Override
    public String toString() {
        return "Mesehos{" +
                "nev='" + nev + '\'' +
                ", jo=" + jo +
                ", napiar=" + napiar +
                ", napok=" + napok +
                ", Bruttó=" + this.osszegez() +
                ", Nettó=" + (this.osszegez() - this.ado()) +
                ", Áfa=" + this.ado() +
                '}';
    }
}
