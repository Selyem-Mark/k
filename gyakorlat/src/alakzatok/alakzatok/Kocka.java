package alakzatok.alakzatok;

public class Kocka extends Test
{
    private final int a;

    public Kocka(int a) {
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
