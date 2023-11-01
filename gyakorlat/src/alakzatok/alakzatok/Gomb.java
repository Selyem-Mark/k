package alakzatok.alakzatok;

public class Gomb extends Test
{
    private final int r;

    public Gomb(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
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
