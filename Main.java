
public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(50);
        RoundPeg rpeg = new RoundPeg(50);

        hole.fits(rpeg);
        RoundPeg small_sqpeg = new RoundPeg(30);
        RoundPeg large_sqpeg = new RoundPeg(40);
        hole.fits(small_sqpeg);

        SquarePeg small_sqpeg_ = new SquarePeg(5);
        SquarePeg large_sqpeg_ = new SquarePeg(10);

        Adapter small_sqpeg_adapter = new Adapter(small_sqpeg_);
        Adapter large_sqpeg_adapter = new Adapter(large_sqpeg_);

        hole.fits(small_sqpeg_adapter); // true
        hole.fits(large_sqpeg_adapter); // false
    }
}
