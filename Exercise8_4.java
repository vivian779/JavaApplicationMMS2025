: public class Exercise8_4 {
    private double length = 1.0;
    private double width = 1.0;

    // Set method for length
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Length must be greater than 0.0 and less than 20.0");
        }
    }

    // Get method for length
    public double getLength() {
        return length;
    }

    // Set method for width
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0.0 and less than 20.0");
        }
    }

    // Get method for width
    public double getWidth() {
        return width;
    }

    // Calculate perimeter
    public double perimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double area() {
        return length * width;
    }

    // Main method for testing
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.setLength(10.5);
        rect.setWidth(5.2);

        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Area: " + rect.area());
    }
}
 