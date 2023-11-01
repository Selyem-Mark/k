package neptun;

import java.util.Objects;
public abstract class Ember//(String nev;int szev;boolean nem;int jovedelme)
{
    protected String nev;
    private int szev;
    private boolean nem; // 0 Férfi 1 Nő
    private int jovedelme;

    public Ember() {
        this.nev = "Senki Alfonz";
        this.szev = 2001;
        this.nem = false;
        this.jovedelme = 500000;
    }

    public Ember(String nev, int szev, boolean nem) {
        this.nev = nev;
        this.szev = szev;
        this.nem = nem;
        this.jovedelme = 200000;
    }

    public Ember(String nev, int szev, boolean nem, int jovedelme) {
        this.nev = nev;
        this.szev = szev;
        this.nem = nem;
        this.jovedelme = jovedelme;
    }

    public String getNev()
    {
        return nev;
    }

    public int getSzev()
    {
        return szev;
    }

    public boolean isNem()
    {
        return nem;
    }

    public int getJovedelme()
    {
        return jovedelme;
    }

    public void setNev(String nev)
    {
        this.nev = nev;
    }

    public void setSzev(int szev)
    {
        this.szev = szev;
    }

    public void setNem(boolean nem)
    {
        this.nem = nem;
    }

    public void setJovedelme(int jovedelme)
    {
        this.jovedelme = jovedelme;
    }

    public abstract String getnev();

    @Override
    public String toString() {
        return  "nev='" + nev + '\'' + "\n" +
                ", szev=" + szev + "\n" +
                ", nem=" + (nem?"Nő":"Férfi") + "\n" +
                ", jovedelme=" + jovedelme + " EUR" + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ember ember = (Ember) o;
        return szev == ember.szev && Objects.equals(nev, ember.nev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nev, szev);
    }
}
