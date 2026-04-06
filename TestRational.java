public class TestRational {
    public static void main(String[] args) {

        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("Add: " + r1.add(r2));
        System.out.println("Subtract: " + r1.subtract(r2));
        System.out.println("Multiply: " + r1.multiply(r2));
        System.out.println("Divide: " + r1.divide(r2));
    }
}
