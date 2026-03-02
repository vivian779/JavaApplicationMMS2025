import java.util.Scanner;

public class Exercise3_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Encrypt section
        System.out.print("Enter a four-digit integer to encrypt: ");
        int number = scanner.nextInt();

        int encryptedNumber = encrypt(number);
        System.out.println("Encrypted number: " + encryptedNumber);

        // Decrypt section
        System.out.print("Enter a four-digit integer to decrypt: ");
        int encryptedInput = scanner.nextInt();

        int decryptedNumber = decrypt(encryptedInput);
        System.out.println("Decrypted (original) number: " + decryptedNumber);
    }

    // Method to encrypt a four-digit number
    public static int encrypt(int number) {
        // Extract digits
        int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // Encrypt each digit
        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        // Swap first with third
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        // Swap second with fourth
        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        // Reconstruct the number
        int encryptedNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        return encryptedNumber;
    }

    // Method to decrypt a four-digit number
    public static int decrypt(int number) {
        // Extract digits
        int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        // Reverse the swap
        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        // Reverse encryption for each digit
        digit1 = (digit1 + 3) % 10;
        digit2 = (digit2 + 3) % 10;
        digit3 = (digit3 + 3) % 10;
        digit4 = (digit4 + 3) % 10;

        // Reconstruct the original number
        int originalNumber = digit1 * 1000 + digit2 * 100 + digit3 * 10 + digit4;
        return originalNumber;
    }
}