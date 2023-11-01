package alakzatok.alakzatok;

public class Teglatest extends Test
{
    private final int a,b,c;

    public Teglatest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
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
