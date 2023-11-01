package MKV;

public class Ogre extends Mesehos implements Ogreinterface
{
    private boolean bufoges;

    @Override
    public double osszegez() {
        if (this.bufoges)
        {
            return super.osszegez() + (10 * this.getNapok()) ;
        }
        else
        {
            return super.osszegez();
        }
    }

    public Ogre(String nev, boolean jo, double napiar, int napok, boolean bufoges) {
        super(nev, jo, napiar, napok);
        this.bufoges = bufoges;
    }

    @Override
    public boolean KiralyLanyMentes(Mesehos kiralylany)
    {
        return kiralylany.getNev().equals("Fiona");
    }
}
