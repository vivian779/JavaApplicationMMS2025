public class Exercise6_16 {

    public static void main(String[] args) {

        double sum = 0;

        for (String value : args)
            sum += Double.parseDouble(value);

        System.out.println("Sum = " + sum);
    }
}