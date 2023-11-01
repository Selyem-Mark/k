package alakzatok.alakzatok;

public class Haromszog extends Sikidom
{
    private final int a,b,c;

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
