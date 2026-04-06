public class Rational {

    private long numerator;
    private long denominator;

    // Constructor
    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    // Add
    public Rational add(Rational second) {
        long n = numerator * second.denominator +
                 denominator * second.numerator;
        long d = denominator * second.denominator;
        return new Rational(n, d);
    }

    // Subtract
    public Rational subtract(Rational second) {
        long n = numerator * second.denominator -
                 denominator * second.numerator;
        long d = denominator * second.denominator;
        return new Rational(n, d);
    }

    // Multiply
    public Rational multiply(Rational second) {
        return new Rational(
            numerator * second.numerator,
            denominator * second.denominator
        );
    }

    // Divide
    public Rational divide(Rational second) {
        return new Rational(
            numerator * second.denominator,
            denominator * second.numerator
        );
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    // GCD method
    private static long gcd(long n, long d) {
        while (d != 0) {
            long temp = d;
            d = n % d;
            n = temp;
        }
        return n;
    }
}
