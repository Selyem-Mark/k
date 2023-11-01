package MKV;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MKV implements MKVinterface
{
    public static int jok = 0;

    List<Mesehos> mesehosok =new ArrayList<Mesehos>();

    public MKV() {
    }

    public MKV(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

    public static int getJok() {
        return jok;
    }

    public static void setJok(int jok) {
        MKV.jok = jok;
    }

    public List<Mesehos> getMesehosok() {
        return mesehosok;
    }

    public void setMesehosok(List<Mesehos> mesehosok) {
        this.mesehosok = mesehosok;
    }

    @Override
    public void feldolgoz()
    {

    }

    @Override
    public double osszBevetel()
    {
        double osszeg = 0;
        Iterator<Mesehos> bejaro = mesehosok.iterator();
        while (bejaro.hasNext())
        {
            bejaro.next().osszegez();
        }
        for (Mesehos hos: mesehosok)
        {
            osszeg = osszeg + hos.osszegez();
        }
        return osszeg;
    }

    @Override
    public String legnagyobbKolcsonzesiNapiaruHos()
    {
        return null;
    }

    @Override
    public double legKissebbKolcsonzesiOsszeg()
    {
        return 0;
    }

    @Override
    public double atlagAr()
    {
        return 0;
    }

    @Override
    public String megmentette()
    {
        Ogre shrek = null;
        for (Mesehos hos: mesehosok)
        {
            if ( hos instanceof Ogre)
            {
                shrek =(Ogre)hos;
            }
        }
        if (shrek != null)
        {
            for (Mesehos hos: mesehosok)
            {
                if (shrek.KiralyLanyMentes(hos))
                {
                    return "megmentette";
                }
            }

        }
        return "Nem megmentette meg";
    }

    @Override
    public String otNaposKolcsonzottek()
    {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jó Hősök száma:" + MKV.jok);
        sb.append("Hősök:\n");
        for (Mesehos hos: mesehosok)
        {
            sb.append(hos.toString()+ "\n");
        }
        return sb.toString();
    }
}
