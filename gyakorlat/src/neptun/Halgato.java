package neptun;

public class Halgato extends Egyetemipolgar implements Diak
{
    public static final int DB = 10;
    private String szak;
    private int evfolyam;
    private int targyakszama = 0;
    private Tantargy[] tantargyak = new Tantargy[DB];


    public Halgato()
    {
        super();
    }

    public Halgato(String nev, int szev, boolean nem, int jovedelme, String neptunkod, String szak, int evfolyam, int targyakszama, Tantargy[] tantargyak) {
        super();
        this.neptunkod = neptunkod;
        this.szak = szak;
        this.evfolyam = evfolyam;
        this.targyakszama = targyakszama;
        this.tantargyak = tantargyak;
    }

    public Halgato(String nev, int szev, boolean nem, int jovedelme, String neptunkod, String szak, int evfolyam) {
        super();
        this.neptunkod = neptunkod;
        this.szak = szak;
        this.evfolyam = evfolyam;
        this.targyakszama = 0;
        this.tantargyak = new Tantargy[DB];
    }

    public String getNeptunkod()
    {
        return neptunkod;
    }

    public void setNeptunkod(String neptunkod)
    {
        this.neptunkod = neptunkod;
    }

    public String getSzak()
    {
        return szak;
    }

    public void setSzak(String szak)
    {
        this.szak = szak;
    }

    public int getEvfolyam()
    {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam)
    {
        this.evfolyam = evfolyam;
    }

    public int getTargyakszama()
    {
        return targyakszama;
    }

    public void setTargyakszama(int targyakszama)
    {
        this.targyakszama = targyakszama;
    }

    public Tantargy[] getTantargyak()
    {
        return tantargyak;
    }

    public void setTantargyak(Tantargy[] tantargyak)
    {
        this.tantargyak = tantargyak;
    }


    @Override
    public String getnev() {
        return null;
    }

    @Override
    public String toString() {


        /*
        Ember uj = new Ember();
        uj.nev = "Valaki";
        uj.jovedelme = 200000;
        */
        StringBuilder szoveg = new StringBuilder();
        szoveg.append(super.toString());
        szoveg.append("neptunkod='" + neptunkod + '\'' + "\n" +
                ", szak='" + szak + '\'' + "\n" +
                ", evfolyam=" + evfolyam + "\n" +
                ", targyakszama=" + targyakszama + "\n");
        szoveg.append("Tantárgyak: \n");
        for (int i = 0; i< targyakszama;i++)
        {
            szoveg.append(this.tantargyak.toString() + "\n");
        }
        for (Tantargy t: tantargyak)
        {
            /* if (t != null)
            {
                szoveg.append(t.toString() + "\n");
            }*/
            szoveg.append(t==null?"":t.toString() + "\n");
        }
        return szoveg.toString();
    }
}
