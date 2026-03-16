import java.util.Random;

public class PasswordGenerator {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>?/";

    private static final String ALL = UPPER + LOWER + NUMBERS + SYMBOLS;
    private static final int PASSWORD_LENGTH = 18;

    public static String generatePassword() {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category
        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        password.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));

        // Fill the remaining characters randomly
        for (int i = 4; i < PASSWORD_LENGTH; i++) {
            password.append(ALL.charAt(random.nextInt(ALL.length())));
        }

        // Shuffle the password to mix the guaranteed characters
        char[] passArray = password.toString().toCharArray();
        for (int i = 0; i < passArray.length; i++) {
            int randomIndex = random.nextInt(passArray.length);
            char temp = passArray[i];
            passArray[i] = passArray[randomIndex];
            passArray[randomIndex] = temp;
        }

        return new String(passArray);
    }

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated Password: " + password);
    }
}