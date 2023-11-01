package alakzatok.alakzatok;

public class Negyzet extends Sikidom
{
    private final int a;

    public Negyzet(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public double felszin() {
        return 0;
    }

    @Override
    public double terfogat() {
        return 0;
    }
}
