public class Adapter extends RoundPeg {
    private SquarePeg Peg;

    public Adapter(SquarePeg Peg) {
        super(0);
        this.Peg = Peg;

    }

    @Override
    public double getRadius() {
        return (Math.sqrt(2) * Peg.getWidth()) / 2;
    }
}

