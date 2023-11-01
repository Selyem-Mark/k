package alakzatok.alakzatok;

public class Teglalap extends Sikidom
{
    private final int a,b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
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
