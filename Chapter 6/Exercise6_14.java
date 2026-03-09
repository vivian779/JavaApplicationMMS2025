public class Exercise6_14 {

    public static int product(int... numbers) {

        int result = 1;

        for (int num : numbers)
            result *= num;

        return result;
    }

    public static void main(String[] args) {

        System.out.println(product(2,3));
        System.out.println(product(2,3,4));
        System.out.println(product(2,3,4,5));
    }
}