package alakzatok.beolvas;

import alakzatok.alakzatok.Alakzat;

import java.util.Scanner;

public abstract class Beolv
{
    protected static Scanner scanner = new Scanner(System.in);

    abstract Alakzat beolvas();

    public static Beolv getbeolvas()
    {
        return null;
    }
}
