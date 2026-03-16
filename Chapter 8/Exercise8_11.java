class Complex {

    private double real;
    private double imaginary;

    public Complex() {
        this(0,0);
    }

    public Complex(double r,double i) {
        real = r;
        imaginary = i;
    }

    public Complex add(Complex c) {

        return new Complex(real + c.real,
                imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {

        return new Complex(real - c.real,
                imaginary - c.imaginary);
    }

    public String toString() {

        return "(" + real + ", " + imaginary + ")";
    }
}

public class Exercise8_11 {

    public static void main(String[] args) {

        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(1,2);

        System.out.println("Add: " + c1.add(c2));
        System.out.println("Subtract: " + c1.subtract(c2));
    }
}