package alakzatok.alakzatok;

public class Kor extends Sikidom
{
    private final int r;

    public Kor(int r) {
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
