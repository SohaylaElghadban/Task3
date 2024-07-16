public class RoundHole {

    private double radius;

    public RoundHole(double radius) {

        this.radius = radius;
    }

    public double GetRadius() {

        return radius;
    }

    public boolean fits(RoundPeg peg) {

        return this.GetRadius() >= peg.getRadius();
    }

}


