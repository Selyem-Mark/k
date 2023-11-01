package alakzatok;

import alakzatok.alakzatok.Alakzat;
import alakzatok.alakzatok.Merheto;
import alakzatok.alakzatok.Sikidom;

import static alakzatok.beolvas.Beolv.getbeolvas;

public class Main
{
    public static void main(String[] args)
    {
        Merheto merheto = (Merheto) getbeolvas();
        if (merheto != null)
        {
            System.out.println(merheto.terfogat());
        }
        Alakzat alakzat = (Alakzat) getbeolvas();
        if (alakzat != null)
        {
            System.out.println(alakzat.terfogat());
            System.out.println(alakzat.felszin());
        }
        /*Sikidom sikidom = (Sikidom) getbeolvas();
        if (sikidom != null)
        {
            System.out.println(alakzat.terfogat());
            System.out.println(alakzat.felszin());

        }*/
    }

    private static Merheto beolvas()
    {
        return null;
    }
}
