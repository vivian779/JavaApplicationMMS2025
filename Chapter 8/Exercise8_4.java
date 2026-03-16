class Rectangle {

    private double length = 1.0;
    private double width = 1.0;

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0)
            this.length = length;
        else
            throw new IllegalArgumentException("Length must be >0 and <20");
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be >0 and <20");
    }

    public double getLength() { return length; }

    public double getWidth() { return width; }

    public double perimeter() { return 2 * (length + width); }

    public double area() { return length * width; }
}

public class Exercise8_4 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.setLength(5.5);
        r.setWidth(4.0);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Area: " + r.area());
    }
}